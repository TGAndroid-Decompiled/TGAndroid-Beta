package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class oa0 implements Runnable {
    public final int f36286a;
    public final Object f36287b;
    public final Object f36288c;

    public oa0(int i10, Object obj, Object obj2) {
        this.f36286a = i10;
        this.f36287b = obj;
        this.f36288c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f36286a) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) this.f36287b).j0((TL_account.Password) this.f36288c);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f36287b;
                Runnable runnable = (Runnable) this.f36288c;
                launchActivity.f30861q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity.f30863r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity.f30863r0.getView().getVisibility() == 0) {
                        launchActivity.f30863r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity.f30865s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity.f30865s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.f36288c;
                if (!((LaunchActivity) this.f36287b).Q && LaunchActivity.E1) {
                    ocVar.j();
                    return;
                }
                return;
            case 3:
                Pattern pattern2 = LaunchActivity.B1;
                ((LaunchActivity) this.f36287b).p0((xd1) this.f36288c);
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f36287b;
                nf.e eVar = (nf.e) this.f36288c;
                launchActivity2.P0 = null;
                launchActivity2.Q0 = null;
                launchActivity2.R0 = null;
                launchActivity2.S0 = null;
                launchActivity2.V0 = null;
                launchActivity2.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 5:
                nf.e eVar2 = (nf.e) this.f36287b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f36288c;
                Pattern pattern3 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 6:
                hc0 hc0Var = (hc0) this.f36287b;
                TLObject tLObject = (TLObject) this.f36288c;
                hc0Var.a();
                if (tLObject != null) {
                    hc0Var.f34235a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 7:
                ((FiltersSetupActivity) this.f36288c).X(((hc0) this.f36287b).f34235a.O());
                return;
            case 8:
                kd0 kd0Var = (kd0) this.f36287b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f36288c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new xq(kd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 9:
                kd0 kd0Var2 = (kd0) this.f36287b;
                kd0Var2.f35223c.setImageResource(R.drawable.msg_location_alert2);
                kd0Var2.e0(((LocationController.SharingLocationInfo) this.f36288c).proximityMeters);
                kd0Var2.G = false;
                return;
            case 10:
                ((EditText) this.f36287b).removeTextChangedListener((org.telegram.ui.Components.qn) this.f36288c);
                return;
            case 11:
                Runnable runnable2 = (Runnable) this.f36288c;
                fe0 fe0Var = ((ie0) this.f36287b).f34546a;
                int i12 = 0;
                while (true) {
                    is[] isVarArr = fe0Var.f33753f;
                    if (i12 < isVarArr.length) {
                        isVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        fe0Var.e = false;
                        return;
                    }
                }
            case 12:
                re0 re0Var = (re0) this.f36287b;
                yg0 yg0Var = re0Var.f37213y;
                yg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(re0Var.f37204a);
                yg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f36288c), false);
                return;
            case 13:
                re0 re0Var2 = (re0) this.f36287b;
                String str = (String) this.f36288c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = re0Var2.f37208n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                pe0 pe0Var = new pe0(re0Var2, 2);
                if (z10) {
                    TL_account.Password password = re0Var2.f37208n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        pe0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.o2) re0Var2.f37213y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, pe0Var, 10);
                    return;
                }
                return;
            case 14:
                jf0 jf0Var = (jf0) this.f36287b;
                jf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(jf0Var.O.fragmentView.findFocus());
                jf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f36288c), true);
                TLRPC.FileLocation fileLocation = jf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new oa0(15, jf0Var, fileLocation));
                    return;
                }
                return;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.o2) ((jf0) this.f36287b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f36288c);
                return;
            case 16:
                kf0 kf0Var = (kf0) this.f36287b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f36288c;
                yg0 yg0Var2 = kf0Var.E;
                yg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (kf0Var.f35270r != null && kf0Var.f35271s != null && kf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", kf0Var.f35270r);
                        bundle.putString("phoneHash", kf0Var.f35271s);
                        bundle.putString("code", kf0Var.v);
                        yg0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    yg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 17:
                bg0 bg0Var = (bg0) this.f36287b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f36288c);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18447a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.w1.j(new StringBuilder("+"), bg0Var.f32135b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18447a.setOnDismissListener(new xf0(bg0Var, 0));
                alertDialog$Builder.o();
                return;
            case 18:
                bg0 bg0Var2 = (bg0) this.f36287b;
                bg0Var2.getClass();
                bg0Var2.f32140e0 = ((TLRPC.TL_error) this.f36288c).text;
                return;
            case 19:
                ((bg0) this.f36287b).f32157s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f36288c), false);
                return;
            case 20:
                Runnable runnable3 = (Runnable) this.f36288c;
                fs fsVar = ((bg0) this.f36287b).f32141f;
                int i13 = 0;
                while (true) {
                    is[] isVarArr2 = fsVar.f33753f;
                    if (i13 < isVarArr2.length) {
                        isVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        fsVar.e = false;
                        return;
                    }
                }
            case 21:
                ((s3) this.f36287b).run((String) this.f36288c);
                return;
            case 22:
                ai0 ai0Var = (ai0) this.f36287b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f36288c;
                ai0Var.f31878c0 = false;
                if (tL_error3 == null) {
                    rh0 f02 = ai0Var.f0();
                    ai0Var.f31886j0.clear();
                    ai0Var.h0(f02);
                    return;
                }
                return;
            case 23:
                ai0 ai0Var2 = ((qh0) this.f36287b).f36929a;
                rh0 f03 = ai0Var2.f0();
                ai0Var2.f31885i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f36288c));
                TLRPC.ChatFull chatFull = ai0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    ai0Var2.getMessagesStorage().saveChatLinksCount(ai0Var2.f31889n, ai0Var2.d.invitesCount);
                }
                ai0Var2.h0(f03);
                return;
            case 24:
                lj0 lj0Var = (lj0) this.f36287b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f36288c;
                if (lj0Var.getParentActivity() != null) {
                    Toast.makeText(lj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 25:
                ek0 ek0Var = (ek0) this.f36287b;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f36288c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                return;
            case 26:
                TLRPC.User user = (TLRPC.User) this.f36288c;
                ((ek0) this.f36287b).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18268id));
                    return;
                }
                return;
            case 27:
                ((oj0) this.f36287b).run((TLRPC.User) this.f36288c);
                return;
            case 28:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f36287b, (ArrayList) this.f36288c);
                return;
            default:
                Runnable runnable4 = (Runnable) this.f36288c;
                for (is isVar : ((PasscodeActivity) this.f36287b).f30905n.f33753f) {
                    isVar.l(0.0f);
                }
                runnable4.run();
                return;
        }
    }
}
