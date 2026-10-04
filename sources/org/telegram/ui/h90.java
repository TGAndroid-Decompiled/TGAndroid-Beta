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
    public final int f37011a;
    public final Object f37012b;
    public final Object f37013c;

    public h90(int i10, Object obj, Object obj2) {
        this.f37011a = i10;
        this.f37012b = obj;
        this.f37013c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f37011a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f37012b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f37013c;
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
                org.telegram.ui.Cells.c1.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) this.f37013c).text);
                org.telegram.ui.Components.e5.u0((h) this.f37012b, string, sb2.toString(), null);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f37012b;
                String str = (String) this.f37013c;
                if (!launchActivity2.f33804q0.getFragmentStack().isEmpty()) {
                    launchActivity2.f33804q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    return;
                }
                return;
            case 3:
                Pattern pattern3 = LaunchActivity.B1;
                ((LaunchActivity) this.f37012b).j0((TL_account.Password) this.f37013c);
                return;
            case 4:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f37012b;
                Runnable runnable = (Runnable) this.f37013c;
                launchActivity3.f33804q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity3.f33806r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity3.f33806r0.getView().getVisibility() == 0) {
                        launchActivity3.f33806r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity3.f33808s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity3.f33808s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.f37013c;
                if (!((LaunchActivity) this.f37012b).Q && LaunchActivity.E1) {
                    rcVar.j();
                    return;
                }
                return;
            case 6:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) this.f37012b).p0((rd1) this.f37013c);
                return;
            case 7:
                LaunchActivity launchActivity4 = (LaunchActivity) this.f37012b;
                nf.e eVar = (nf.e) this.f37013c;
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
                nf.e eVar2 = (nf.e) this.f37012b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f37013c;
                Pattern pattern5 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (b2Var != null) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 9:
                dc0 dc0Var = (dc0) this.f37012b;
                TLObject tLObject = (TLObject) this.f37013c;
                dc0Var.a();
                if (tLObject != null) {
                    dc0Var.f35740a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 10:
                ((FiltersSetupActivity) this.f37013c).W(((dc0) this.f37012b).f35740a.O());
                return;
            case 11:
                gd0 gd0Var = (gd0) this.f37012b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f37013c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new uq(gd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 12:
                gd0 gd0Var2 = (gd0) this.f37012b;
                gd0Var2.f36571c.setImageResource(R.drawable.msg_location_alert2);
                gd0Var2.e0(((LocationController.SharingLocationInfo) this.f37013c).proximityMeters);
                gd0Var2.G = false;
                return;
            case 13:
                ((EditText) this.f37012b).removeTextChangedListener((org.telegram.ui.Components.tn) this.f37013c);
                return;
            case 14:
                Runnable runnable2 = (Runnable) this.f37013c;
                be0 be0Var = ((ee0) this.f37012b).f36001a;
                int i12 = 0;
                while (true) {
                    es[] esVarArr = be0Var.f35549f;
                    if (i12 < esVarArr.length) {
                        esVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        be0Var.f35548e = false;
                        return;
                    }
                }
            case 15:
                ne0 ne0Var = (ne0) this.f37012b;
                ug0 ug0Var = ne0Var.f38960y;
                ug0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(ne0Var.f38950a);
                ug0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37013c), false);
                return;
            case 16:
                ne0 ne0Var2 = (ne0) this.f37012b;
                String str2 = (String) this.f37013c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ne0Var2.f38955n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                le0 le0Var = new le0(ne0Var2, 2);
                if (z10) {
                    TL_account.Password password = ne0Var2.f38955n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        le0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.n2) ne0Var2.f38960y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, le0Var, 10);
                    return;
                }
                return;
            case 17:
                ff0 ff0Var = (ff0) this.f37012b;
                ff0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ff0Var.O.fragmentView.findFocus());
                ff0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37013c), true);
                TLRPC.FileLocation fileLocation = ff0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new h90(18, ff0Var, fileLocation));
                    return;
                }
                return;
            case 18:
                i11 = ((org.telegram.ui.ActionBar.n2) ((ff0) this.f37012b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f37013c);
                return;
            case 19:
                gf0 gf0Var = (gf0) this.f37012b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f37013c;
                ug0 ug0Var2 = gf0Var.E;
                ug0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (gf0Var.f36635r != null && gf0Var.f36636s != null && gf0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", gf0Var.f36635r);
                        bundle.putString("phoneHash", gf0Var.f36636s);
                        bundle.putString("code", gf0Var.v);
                        ug0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    ug0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    ug0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 20:
                xf0 xf0Var = (xf0) this.f37012b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f37013c);
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f20372a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.bi.g(new StringBuilder("+"), xf0Var.f42859b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f20372a.setOnDismissListener(new tf0(xf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 21:
                xf0 xf0Var2 = (xf0) this.f37012b;
                xf0Var2.getClass();
                xf0Var2.f42865e0 = ((TLRPC.TL_error) this.f37013c).text;
                return;
            case 22:
                ((xf0) this.f37012b).f42882s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f37013c), false);
                return;
            case 23:
                Runnable runnable3 = (Runnable) this.f37013c;
                cs csVar = ((xf0) this.f37012b).f42866f;
                int i13 = 0;
                while (true) {
                    es[] esVarArr2 = csVar.f35549f;
                    if (i13 < esVarArr2.length) {
                        esVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        csVar.f35548e = false;
                        return;
                    }
                }
            case 24:
                ((t3) this.f37012b).run((String) this.f37013c);
                return;
            case 25:
                wh0 wh0Var = (wh0) this.f37012b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f37013c;
                wh0Var.f42479c0 = false;
                if (tL_error3 == null) {
                    nh0 f02 = wh0Var.f0();
                    wh0Var.f42488j0.clear();
                    wh0Var.h0(f02);
                    return;
                }
                return;
            case 26:
                wh0 wh0Var2 = ((mh0) this.f37012b).f38602a;
                nh0 f03 = wh0Var2.f0();
                wh0Var2.f42487i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f37013c));
                TLRPC.ChatFull chatFull = wh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    wh0Var2.getMessagesStorage().saveChatLinksCount(wh0Var2.f42491n, wh0Var2.d.invitesCount);
                }
                wh0Var2.h0(f03);
                return;
            case 27:
                hj0 hj0Var = (hj0) this.f37012b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f37013c;
                if (hj0Var.getParentActivity() != null) {
                    Toast.makeText(hj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 28:
                ak0 ak0Var = (ak0) this.f37012b;
                ak0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f37013c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                ak0Var.getContext().startActivity(intent);
                return;
            default:
                TLRPC.User user = (TLRPC.User) this.f37013c;
                ((ak0) this.f37012b).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f20189id));
                    return;
                }
                return;
        }
    }
}
