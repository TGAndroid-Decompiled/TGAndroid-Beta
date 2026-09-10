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
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
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
public final class h90 implements Runnable {
    public final int f33329a;
    public final Object f33330b;
    public final Object f33331c;

    public h90(int i10, Object obj, Object obj2) {
        this.f33329a = i10;
        this.f33330b = obj;
        this.f33331c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f33329a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f33330b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f33331c;
                Pattern pattern = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity.O);
                long j3 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j3, j3, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.em.l(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f33331c).text);
                org.telegram.ui.Components.d5.u0((h) this.f33330b, string, sb2.toString(), null);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f33330b;
                String str = (String) this.f33331c;
                if (!launchActivity2.f29957q0.getFragmentStack().isEmpty()) {
                    launchActivity2.f29957q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    return;
                }
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.B1;
                ((LaunchActivity) this.f33330b).j0((TL_account.Password) this.f33331c);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f33330b;
                Runnable runnable = (Runnable) this.f33331c;
                launchActivity3.f29957q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity3.f29959r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity3.f29959r0.getView().getVisibility() == 0) {
                        launchActivity3.f29959r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity3.f29961s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity3.f29961s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.pc pcVar = (org.telegram.ui.Components.pc) this.f33331c;
                if (!((LaunchActivity) this.f33330b).Q && LaunchActivity.E1) {
                    pcVar.j();
                    return;
                }
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f33330b).p0((ae1) this.f33331c);
                return;
            case 7:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f33330b;
                nf.e eVar = (nf.e) this.f33331c;
                launchActivity4.P0 = null;
                launchActivity4.Q0 = null;
                launchActivity4.R0 = null;
                launchActivity4.S0 = null;
                launchActivity4.V0 = null;
                launchActivity4.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 8:
                nf.e eVar2 = (nf.e) this.f33330b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f33331c;
                Pattern pattern5 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (d2Var != null) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 9:
                fc0 fc0Var = (fc0) this.f33330b;
                TLObject tLObject = (TLObject) this.f33331c;
                fc0Var.a();
                if (tLObject != null) {
                    fc0Var.f32778a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 10:
                ((FiltersSetupActivity) this.f33331c).X(((fc0) this.f33330b).f32778a.O());
                return;
            case 11:
                id0 id0Var = (id0) this.f33330b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f33331c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new zq(id0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 12:
                id0 id0Var2 = (id0) this.f33330b;
                id0Var2.f33618c.setImageResource(R.drawable.msg_location_alert2);
                id0Var2.e0(((LocationController.SharingLocationInfo) this.f33331c).proximityMeters);
                id0Var2.G = false;
                return;
            case 13:
                ((EditText) this.f33330b).removeTextChangedListener((og.x) this.f33331c);
                return;
            case 14:
                Runnable runnable2 = (Runnable) this.f33331c;
                de0 de0Var = ((ge0) this.f33330b).f33070a;
                int i12 = 0;
                while (true) {
                    hs[] hsVarArr = de0Var.f32906f;
                    if (i12 < hsVarArr.length) {
                        hsVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        de0Var.e = false;
                        return;
                    }
                }
            case 15:
                pe0 pe0Var = (pe0) this.f33330b;
                xg0 xg0Var = pe0Var.f35807y;
                xg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(pe0Var.f35798a);
                xg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33331c), false);
                return;
            case 16:
                pe0 pe0Var2 = (pe0) this.f33330b;
                String str2 = (String) this.f33331c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = pe0Var2.f35802n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ne0 ne0Var = new ne0(pe0Var2, 2);
                if (z10) {
                    TL_account.Password password = pe0Var2.f35802n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ne0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.p2) pe0Var2.f35807y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ne0Var, 10);
                    return;
                }
                return;
            case 17:
                hf0 hf0Var = (hf0) this.f33330b;
                hf0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(hf0Var.O.fragmentView.findFocus());
                hf0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33331c), true);
                TLRPC.FileLocation fileLocation = hf0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new h90(18, hf0Var, fileLocation));
                    return;
                }
                return;
            case 18:
                i11 = ((org.telegram.ui.ActionBar.p2) ((hf0) this.f33330b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f33331c);
                return;
            case 19:
                if0 if0Var = (if0) this.f33330b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f33331c;
                xg0 xg0Var2 = if0Var.E;
                xg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (if0Var.f33667r != null && if0Var.f33668s != null && if0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", if0Var.f33667r);
                        bundle.putString("phoneHash", if0Var.f33668s);
                        bundle.putString("code", if0Var.v);
                        xg0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    xg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 20:
                zf0 zf0Var = (zf0) this.f33330b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f33331c);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f17528a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.a2.j(new StringBuilder("+"), zf0Var.f39283b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f17528a.setOnDismissListener(new vf0(zf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 21:
                zf0 zf0Var2 = (zf0) this.f33330b;
                zf0Var2.getClass();
                zf0Var2.f39288e0 = ((TLRPC.TL_error) this.f33331c).text;
                return;
            case 22:
                ((zf0) this.f33330b).f39305s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33331c), false);
                return;
            case 23:
                Runnable runnable3 = (Runnable) this.f33331c;
                fs fsVar = ((zf0) this.f33330b).f39289f;
                int i13 = 0;
                while (true) {
                    hs[] hsVarArr2 = fsVar.f32906f;
                    if (i13 < hsVarArr2.length) {
                        hsVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        fsVar.e = false;
                        return;
                    }
                }
            case 24:
                ((u3) this.f33330b).run((String) this.f33331c);
                return;
            case 25:
                zh0 zh0Var = (zh0) this.f33330b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f33331c;
                zh0Var.f39327c0 = false;
                if (tL_error3 == null) {
                    qh0 f02 = zh0Var.f0();
                    zh0Var.f39335j0.clear();
                    zh0Var.h0(f02);
                    return;
                }
                return;
            case 26:
                zh0 zh0Var2 = ((ph0) this.f33330b).f35841a;
                qh0 f03 = zh0Var2.f0();
                zh0Var2.f39334i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f33331c));
                TLRPC.ChatFull chatFull = zh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    zh0Var2.getMessagesStorage().saveChatLinksCount(zh0Var2.f39338n, zh0Var2.d.invitesCount);
                }
                zh0Var2.h0(f03);
                return;
            case 27:
                kj0 kj0Var = (kj0) this.f33330b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f33331c;
                if (kj0Var.getParentActivity() != null) {
                    Toast.makeText(kj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 28:
                ek0 ek0Var = (ek0) this.f33330b;
                ek0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f33331c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ek0Var.getContext().startActivity(intent);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f33331c;
                ((ek0) this.f33330b).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f17342id));
                    return;
                }
                return;
        }
    }
}
