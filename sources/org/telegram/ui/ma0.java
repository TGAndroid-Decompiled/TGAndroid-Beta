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
public final class ma0 implements Runnable {
    public final int f35662a;
    public final Object f35663b;
    public final Object f35664c;

    public ma0(int i10, Object obj, Object obj2) {
        this.f35662a = i10;
        this.f35663b = obj;
        this.f35664c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f35662a) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) this.f35663b).j0((TL_account.Password) this.f35664c);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) this.f35663b;
                Runnable runnable = (Runnable) this.f35664c;
                launchActivity.f30841q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity.f30843r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity.f30843r0.getView().getVisibility() == 0) {
                        launchActivity.f30843r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity.f30845s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity.f30845s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.f35664c;
                if (!((LaunchActivity) this.f35663b).Q && LaunchActivity.E1) {
                    ocVar.j();
                    return;
                }
                return;
            case 3:
                Pattern pattern2 = LaunchActivity.B1;
                ((LaunchActivity) this.f35663b).p0((wd1) this.f35664c);
                return;
            case 4:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f35663b;
                nf.e eVar = (nf.e) this.f35664c;
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
                nf.e eVar2 = (nf.e) this.f35663b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f35664c;
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
                fc0 fc0Var = (fc0) this.f35663b;
                TLObject tLObject = (TLObject) this.f35664c;
                fc0Var.a();
                if (tLObject != null) {
                    fc0Var.f33563a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 7:
                ((FiltersSetupActivity) this.f35664c).X(((fc0) this.f35663b).f33563a.O());
                return;
            case 8:
                id0 id0Var = (id0) this.f35663b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f35664c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new xq(id0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 9:
                id0 id0Var2 = (id0) this.f35663b;
                id0Var2.f34610c.setImageResource(R.drawable.msg_location_alert2);
                id0Var2.e0(((LocationController.SharingLocationInfo) this.f35664c).proximityMeters);
                id0Var2.G = false;
                return;
            case 10:
                ((EditText) this.f35663b).removeTextChangedListener((org.telegram.ui.Components.qn) this.f35664c);
                return;
            case 11:
                Runnable runnable2 = (Runnable) this.f35664c;
                de0 de0Var = ((ge0) this.f35663b).f33827a;
                int i12 = 0;
                while (true) {
                    gs[] gsVarArr = de0Var.f33081f;
                    if (i12 < gsVarArr.length) {
                        gsVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        de0Var.e = false;
                        return;
                    }
                }
            case 12:
                pe0 pe0Var = (pe0) this.f35663b;
                wg0 wg0Var = pe0Var.f36554y;
                wg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.f36545a);
                wg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35664c), false);
                return;
            case 13:
                pe0 pe0Var2 = (pe0) this.f35663b;
                String str = (String) this.f35664c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var2.f36549n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ne0 ne0Var = new ne0(pe0Var2, 2);
                if (z10) {
                    TL_account.Password password = pe0Var2.f36549n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ne0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) pe0Var2.f36554y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ne0Var, 10);
                    return;
                }
                return;
            case 14:
                hf0 hf0Var = (hf0) this.f35663b;
                hf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(hf0Var.O.fragmentView.findFocus());
                hf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35664c), true);
                TLRPC.FileLocation fileLocation = hf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ma0(15, hf0Var, fileLocation));
                    return;
                }
                return;
            case 15:
                i11 = ((org.telegram.ui.ActionBar.n2) ((hf0) this.f35663b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f35664c);
                return;
            case 16:
                if0 if0Var = (if0) this.f35663b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f35664c;
                wg0 wg0Var2 = if0Var.E;
                wg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (if0Var.f34655r != null && if0Var.f34656s != null && if0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", if0Var.f34655r);
                        bundle.putString("phoneHash", if0Var.f34656s);
                        bundle.putString("code", if0Var.v);
                        wg0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    wg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 17:
                zf0 zf0Var = (zf0) this.f35663b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f35664c);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18435a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.vl.h(new StringBuilder("+"), zf0Var.f40169b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18435a.setOnDismissListener(new vf0(zf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 18:
                zf0 zf0Var2 = (zf0) this.f35663b;
                zf0Var2.getClass();
                zf0Var2.f40174e0 = ((TLRPC.TL_error) this.f35664c).text;
                return;
            case 19:
                ((zf0) this.f35663b).f40191s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f35664c), false);
                return;
            case 20:
                Runnable runnable3 = (Runnable) this.f35664c;
                ds dsVar = ((zf0) this.f35663b).f40175f;
                int i13 = 0;
                while (true) {
                    gs[] gsVarArr2 = dsVar.f33081f;
                    if (i13 < gsVarArr2.length) {
                        gsVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        dsVar.e = false;
                        return;
                    }
                }
            case 21:
                ((s3) this.f35663b).run((String) this.f35664c);
                return;
            case 22:
                yh0 yh0Var = (yh0) this.f35663b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f35664c;
                yh0Var.f39857c0 = false;
                if (tL_error3 == null) {
                    ph0 f02 = yh0Var.f0();
                    yh0Var.f39865j0.clear();
                    yh0Var.h0(f02);
                    return;
                }
                return;
            case 23:
                yh0 yh0Var2 = ((oh0) this.f35663b).f36226a;
                ph0 f03 = yh0Var2.f0();
                yh0Var2.f39864i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f35664c));
                TLRPC.ChatFull chatFull = yh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    yh0Var2.getMessagesStorage().saveChatLinksCount(yh0Var2.f39868n, yh0Var2.d.invitesCount);
                }
                yh0Var2.h0(f03);
                return;
            case 24:
                jj0 jj0Var = (jj0) this.f35663b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f35664c;
                if (jj0Var.getParentActivity() != null) {
                    Toast.makeText(jj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 25:
                ck0 ck0Var = (ck0) this.f35663b;
                ck0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f35664c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ck0Var.getContext().startActivity(intent);
                return;
            case 26:
                TLRPC.User user = (TLRPC.User) this.f35664c;
                ((ck0) this.f35663b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18256id));
                    return;
                }
                return;
            case 27:
                ((mj0) this.f35663b).run((TLRPC.User) this.f35664c);
                return;
            case 28:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f35663b, (ArrayList) this.f35664c);
                return;
            default:
                Runnable runnable4 = (Runnable) this.f35664c;
                for (gs gsVar : ((PasscodeActivity) this.f35663b).f30885n.f33081f) {
                    gsVar.l(0.0f);
                }
                runnable4.run();
                return;
        }
    }
}
