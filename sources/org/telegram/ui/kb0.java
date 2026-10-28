package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kb0 implements Runnable {
    public final int f40724a;
    public final Object f40725b;
    public final Object f40726c;

    public kb0(int i10, Object obj, Object obj2) {
        this.f40724a = i10;
        this.f40725b = obj;
        this.f40726c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f40724a) {
            case 0:
                ((FiltersSetupActivity) this.f40726c).Z(((ob0) this.f40725b).f42050a.O());
                return;
            case 1:
                rc0 rc0Var = (rc0) this.f40725b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f40726c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new pq(rc0Var, createBitmap2, gLSurfaceView, 23));
                    return;
                }
                return;
            case 2:
                rc0 rc0Var2 = (rc0) this.f40725b;
                rc0Var2.f42925c.setImageResource(R.drawable.msg_location_alert2);
                rc0Var2.f0(((LocationController.SharingLocationInfo) this.f40726c).proximityMeters);
                rc0Var2.G = false;
                return;
            case 3:
                ((EditText) this.f40725b).removeTextChangedListener((org.telegram.ui.Components.bo) this.f40726c);
                return;
            case 4:
                Runnable runnable = (Runnable) this.f40726c;
                nd0 nd0Var = ((qd0) this.f40725b).f42672a;
                int i14 = 0;
                while (true) {
                    zr[] zrVarArr = nd0Var.f45772f;
                    if (i14 < zrVarArr.length) {
                        zrVarArr[i14].l(0.0f);
                        i14++;
                    } else {
                        runnable.run();
                        nd0Var.e = false;
                        return;
                    }
                }
            case 5:
                ae0 ae0Var = (ae0) this.f40725b;
                ig0 ig0Var = ae0Var.f37757y;
                ig0Var.p1(false, false);
                AndroidUtilities.hideKeyboard(ae0Var.f37748a);
                ig0Var.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f40726c), false);
                return;
            case 6:
                ae0 ae0Var2 = (ae0) this.f40725b;
                String str = (String) this.f40726c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ae0Var2.f37752n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                xd0 xd0Var = new xd0(ae0Var2, 2);
                if (z10) {
                    TL_account.Password password = ae0Var2.f37752n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        xd0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.r2) ae0Var2.f37757y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, xd0Var, 10);
                    return;
                }
                return;
            case 7:
                te0 te0Var = (te0) this.f40725b;
                te0Var.O.p1(false, false);
                AndroidUtilities.hideKeyboard(te0Var.O.fragmentView.findFocus());
                te0Var.O.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f40726c), true);
                TLRPC.FileLocation fileLocation = te0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new kb0(8, te0Var, fileLocation));
                    return;
                }
                return;
            case 8:
                i11 = ((org.telegram.ui.ActionBar.r2) ((te0) this.f40725b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f40726c);
                return;
            case 9:
                ue0 ue0Var = (ue0) this.f40725b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f40726c;
                ig0 ig0Var2 = ue0Var.G;
                ig0Var2.p1(false, true);
                if (tL_error2 == null) {
                    if (ue0Var.f44003r != null && ue0Var.f44004s != null && ue0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", ue0Var.f44003r);
                        bundle.putString("phoneHash", ue0Var.f44004s);
                        bundle.putString("code", ue0Var.v);
                        ig0Var2.z1(5, true, bundle, false);
                        return;
                    }
                    ig0Var2.z1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 10:
                lf0 lf0Var = (lf0) this.f40725b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f40726c);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f22369a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.wh.g(new StringBuilder("+"), lf0Var.f41110b, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f22369a.setOnDismissListener(new hf0(lf0Var, 0));
                alertDialog$Builder.p();
                return;
            case 11:
                lf0 lf0Var2 = (lf0) this.f40725b;
                lf0Var2.getClass();
                lf0Var2.f41118g0 = ((TLRPC.TL_error) this.f40726c).text;
                return;
            case 12:
                ((lf0) this.f40725b).f41134u0.t1((TLRPC.TL_auth_authorization) ((TLObject) this.f40726c), false);
                return;
            case 13:
                Runnable runnable2 = (Runnable) this.f40726c;
                xr xrVar = ((lf0) this.f40725b).f41116f;
                int i15 = 0;
                while (true) {
                    zr[] zrVarArr2 = xrVar.f45772f;
                    if (i15 < zrVarArr2.length) {
                        zrVarArr2[i15].l(0.0f);
                        i15++;
                    } else {
                        runnable2.run();
                        xrVar.e = false;
                        return;
                    }
                }
            case 14:
                ((t3) this.f40725b).run((String) this.f40726c);
                return;
            case 15:
                ArrayList arrayList = (ArrayList) this.f40726c;
                ig0 ig0Var3 = ((hg0) this.f40725b).f39882a0;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (!globalMainSettings.getBoolean("firstloginshow", true) && !ig0Var3.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                    ig0Var3.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
                    return;
                }
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var3.getParentActivity());
                int i16 = R.raw.incoming_calls;
                int i17 = org.telegram.ui.ActionBar.y6.L5;
                alertDialog$Builder2.m(i16, 46, org.telegram.ui.ActionBar.y6.x0(null, i17, false), null);
                alertDialog$Builder2.n(i17, null);
                alertDialog$Builder2.k(LocaleController.getString("Continue", R.string.Continue), null);
                String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22369a;
                e2Var.T = string;
                ig0Var3.f40156n = ig0Var3.showDialog(e2Var, true, null);
                ig0Var3.f40145c0 = true;
                return;
            case 16:
                lg0.V((lg0) this.f40725b, (org.telegram.ui.ActionBar.e2) this.f40726c);
                return;
            case 17:
                lh0 lh0Var = (lh0) this.f40725b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f40726c;
                lh0Var.f41166c0 = false;
                if (tL_error3 == null) {
                    ch0 h02 = lh0Var.h0();
                    lh0Var.f41174j0.clear();
                    lh0Var.j0(h02);
                    return;
                }
                return;
            case 18:
                lh0 lh0Var2 = ((bh0) this.f40725b).f38042a;
                ch0 h03 = lh0Var2.h0();
                lh0Var2.f41173i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f40726c));
                TLRPC.ChatFull chatFull = lh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    lh0Var2.getMessagesStorage().saveChatLinksCount(lh0Var2.f41177n, lh0Var2.d.invitesCount);
                }
                lh0Var2.j0(h03);
                return;
            case 19:
                xi0 xi0Var = (xi0) this.f40725b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f40726c;
                if (xi0Var.getParentActivity() != null) {
                    Toast.makeText(xi0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 20:
                qj0 qj0Var = (qj0) this.f40725b;
                qj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f40726c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                qj0Var.getContext().startActivity(intent);
                return;
            case 21:
                TLRPC.User user = (TLRPC.User) this.f40726c;
                ((qj0) this.f40725b).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(user.f22177id));
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.oy) this.f40725b).run((TLRPC.User) this.f40726c);
                return;
            case 23:
                zj0 zj0Var = (zj0) this.f40725b;
                TLObject tLObject = (TLObject) this.f40726c;
                ArrayList arrayList2 = zj0Var.f46289c;
                xj0[] xj0VarArr = zj0Var.f46288b;
                HashSet hashSet = zj0Var.e;
                HashSet hashSet2 = zj0Var.d;
                if (!zj0Var.h) {
                    zj0Var.f46291n = false;
                    if (!(tLObject instanceof TL_feed.TL_interestCategories)) {
                        zj0Var.f46292r = true;
                        zj0.o0(xj0VarArr[0]);
                        return;
                    }
                    TL_feed.TL_interestCategories tL_interestCategories = (TL_feed.TL_interestCategories) tLObject;
                    arrayList2.clear();
                    arrayList2.addAll(tL_interestCategories.categories);
                    if (!zj0Var.f46290f && hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(tL_interestCategories.selected);
                        hashSet.clear();
                        hashSet.addAll(tL_interestCategories.selected);
                    }
                    zj0Var.p0(false);
                    zj0.o0(xj0VarArr[0]);
                    return;
                }
                return;
            case 24:
                zj0.W((zj0) this.f40725b, (ImageView) this.f40726c);
                return;
            case 25:
                NotificationsCustomSettingsActivity.X((NotificationsCustomSettingsActivity) this.f40725b, (ArrayList) this.f40726c);
                return;
            case 26:
                ((org.telegram.ui.ActionBar.k3[]) this.f40725b)[0] = null;
                fl0.f39397a = null;
                ((boolean[]) this.f40726c)[0] = true;
                return;
            case 27:
                Runnable runnable3 = (Runnable) this.f40726c;
                for (zr zrVar : ((PasscodeActivity) this.f40725b).f35621n.f45772f) {
                    zrVar.l(0.0f);
                }
                runnable3.run();
                return;
            case 28:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f40726c;
                PasscodeActivity passcodeActivity = ((ml0) this.f40725b).f41461b;
                if (passcodeActivity.f35626y == 0) {
                    i12 = R.string.PasscodeSwitchToPassword;
                } else {
                    i12 = R.string.PasscodeSwitchToPIN;
                }
                g1Var.setText(LocaleController.getString(i12));
                if (passcodeActivity.f35626y == 0) {
                    i13 = R.drawable.msg_permissions;
                } else {
                    i13 = R.drawable.msg_pin_code;
                }
                g1Var.setIcon(i13);
                passcodeActivity.u0();
                if (passcodeActivity.o0()) {
                    passcodeActivity.h.setInputType(524417);
                    AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.f35623s, true, 0.1f, false);
                    return;
                }
                return;
            default:
                ((PasskeysActivity) this.f40725b).Z((TL_account.Passkey) this.f40726c);
                return;
        }
    }
}
