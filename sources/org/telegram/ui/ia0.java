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
public final class ia0 implements Runnable {
    public final int f34083a;
    public final Object f34084b;
    public final Object f34085c;

    public ia0(int i10, Object obj, Object obj2) {
        this.f34083a = i10;
        this.f34084b = obj;
        this.f34085c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f34083a) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) this.f34084b).j0((TL_account.Password) this.f34085c);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f34084b;
                Runnable runnable = (Runnable) this.f34085c;
                launchActivity.f30815q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity.f30817r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity.f30817r0.getView().getVisibility() == 0) {
                        launchActivity.f30817r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity.f30819s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity.f30819s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f34085c;
                if (!((LaunchActivity) this.f34084b).Q && LaunchActivity.E1) {
                    qcVar.j();
                    return;
                }
                return;
            case 3:
                Pattern pattern2 = LaunchActivity.B1;
                ((LaunchActivity) this.f34084b).p0((od1) this.f34085c);
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f34084b;
                nf.e eVar = (nf.e) this.f34085c;
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
                nf.e eVar2 = (nf.e) this.f34084b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f34085c;
                Pattern pattern3 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 6:
                ac0 ac0Var = (ac0) this.f34084b;
                TLObject tLObject = (TLObject) this.f34085c;
                ac0Var.a();
                if (tLObject != null) {
                    ac0Var.f31731a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 7:
                ((FiltersSetupActivity) this.f34085c).X(((ac0) this.f34084b).f31731a.O());
                return;
            case 8:
                dd0 dd0Var = (dd0) this.f34084b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f34085c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new tq(dd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 9:
                dd0 dd0Var2 = (dd0) this.f34084b;
                dd0Var2.f32584c.setImageResource(R.drawable.msg_location_alert2);
                dd0Var2.e0(((LocationController.SharingLocationInfo) this.f34085c).proximityMeters);
                dd0Var2.G = false;
                return;
            case 10:
                ((EditText) this.f34084b).removeTextChangedListener((org.telegram.ui.Components.rn) this.f34085c);
                return;
            case 11:
                Runnable runnable2 = (Runnable) this.f34085c;
                yd0 yd0Var = ((be0) this.f34084b).f32087a;
                int i12 = 0;
                while (true) {
                    bs[] bsVarArr = yd0Var.f40230f;
                    if (i12 < bsVarArr.length) {
                        bsVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        yd0Var.e = false;
                        return;
                    }
                }
            case 12:
                ke0 ke0Var = (ke0) this.f34084b;
                rg0 rg0Var = ke0Var.f34697y;
                rg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ke0Var.f34688a);
                rg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f34085c), false);
                return;
            case 13:
                ke0 ke0Var2 = (ke0) this.f34084b;
                String str = (String) this.f34085c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ke0Var2.f34692n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ie0 ie0Var = new ie0(ke0Var2, 2);
                if (z10) {
                    TL_account.Password password = ke0Var2.f34692n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ie0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) ke0Var2.f34697y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ie0Var, 10);
                    return;
                }
                return;
            case 14:
                cf0 cf0Var = (cf0) this.f34084b;
                cf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(cf0Var.O.fragmentView.findFocus());
                cf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f34085c), true);
                TLRPC.FileLocation fileLocation = cf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ia0(15, cf0Var, fileLocation));
                    return;
                }
                return;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.n2) ((cf0) this.f34084b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f34085c);
                return;
            case 16:
                df0 df0Var = (df0) this.f34084b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f34085c;
                rg0 rg0Var2 = df0Var.E;
                rg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (df0Var.f32642r != null && df0Var.f32643s != null && df0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", df0Var.f32642r);
                        bundle.putString("phoneHash", df0Var.f32643s);
                        bundle.putString("code", df0Var.v);
                        rg0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    rg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    rg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 17:
                uf0 uf0Var = (uf0) this.f34084b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f34085c);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18409a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.ul.h(new StringBuilder("+"), uf0Var.f38071b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18409a.setOnDismissListener(new qf0(uf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 18:
                uf0 uf0Var2 = (uf0) this.f34084b;
                uf0Var2.getClass();
                uf0Var2.f38076e0 = ((TLRPC.TL_error) this.f34085c).text;
                return;
            case 19:
                ((uf0) this.f34084b).f38093s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f34085c), false);
                return;
            case 20:
                Runnable runnable3 = (Runnable) this.f34085c;
                zr zrVar = ((uf0) this.f34084b).f38077f;
                int i13 = 0;
                while (true) {
                    bs[] bsVarArr2 = zrVar.f40230f;
                    if (i13 < bsVarArr2.length) {
                        bsVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        zrVar.e = false;
                        return;
                    }
                }
            case 21:
                ((t3) this.f34084b).run((String) this.f34085c);
                return;
            case 22:
                th0 th0Var = (th0) this.f34084b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f34085c;
                th0Var.f37660c0 = false;
                if (tL_error3 == null) {
                    kh0 f02 = th0Var.f0();
                    th0Var.f37668j0.clear();
                    th0Var.h0(f02);
                    return;
                }
                return;
            case 23:
                th0 th0Var2 = ((jh0) this.f34084b).f34460a;
                kh0 f03 = th0Var2.f0();
                th0Var2.f37667i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f34085c));
                TLRPC.ChatFull chatFull = th0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    th0Var2.getMessagesStorage().saveChatLinksCount(th0Var2.f37671n, th0Var2.d.invitesCount);
                }
                th0Var2.h0(f03);
                return;
            case 24:
                ej0 ej0Var = (ej0) this.f34084b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f34085c;
                if (ej0Var.getParentActivity() != null) {
                    Toast.makeText(ej0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 25:
                wj0 wj0Var = (wj0) this.f34084b;
                wj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f34085c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                wj0Var.getContext().startActivity(intent);
                return;
            case 26:
                TLRPC.User user = (TLRPC.User) this.f34085c;
                ((wj0) this.f34084b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18230id));
                    return;
                }
                return;
            case 27:
                ((dt) this.f34084b).run((TLRPC.User) this.f34085c);
                return;
            case 28:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f34084b, (ArrayList) this.f34085c);
                return;
            default:
                Runnable runnable4 = (Runnable) this.f34085c;
                for (bs bsVar : ((PasscodeActivity) this.f34084b).f30859n.f40230f) {
                    bsVar.l(0.0f);
                }
                runnable4.run();
                return;
        }
    }
}
