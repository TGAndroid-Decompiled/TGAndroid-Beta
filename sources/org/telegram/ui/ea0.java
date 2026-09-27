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
public final class ea0 implements Runnable {
    public final int f33184a;
    public final Object f33185b;
    public final Object f33186c;

    public ea0(int i10, Object obj, Object obj2) {
        this.f33184a = i10;
        this.f33185b = obj;
        this.f33186c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        int i10;
        int i11;
        switch (this.f33184a) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) this.f33185b;
                String str = (String) this.f33186c;
                if (!launchActivity.f31132q0.getFragmentStack().isEmpty()) {
                    launchActivity.f31132q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str).getQueryParameter("ref")));
                    return;
                }
                return;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                ((LaunchActivity) this.f33185b).j0((TL_account.Password) this.f33186c);
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f33185b;
                Runnable runnable = (Runnable) this.f33186c;
                launchActivity2.f31132q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity2.f31134r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity2.f31134r0.getView().getVisibility() == 0) {
                        launchActivity2.f31134r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity2.f31136s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity2.f31136s0.getView().setVisibility(4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f33186c;
                if (!((LaunchActivity) this.f33185b).Q && LaunchActivity.E1) {
                    qcVar.j();
                    return;
                }
                return;
            case 4:
                Pattern pattern2 = LaunchActivity.B1;
                ((LaunchActivity) this.f33185b).p0((pd1) this.f33186c);
                return;
            case 5:
                LaunchActivity launchActivity3 = (LaunchActivity) this.f33185b;
                nf.e eVar = (nf.e) this.f33186c;
                launchActivity3.P0 = null;
                launchActivity3.Q0 = null;
                launchActivity3.R0 = null;
                launchActivity3.S0 = null;
                launchActivity3.V0 = null;
                launchActivity3.T0 = null;
                if (eVar != null) {
                    eVar.b();
                    return;
                }
                return;
            case 6:
                nf.e eVar2 = (nf.e) this.f33185b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.f33186c;
                Pattern pattern3 = LaunchActivity.B1;
                if (eVar2 != null) {
                    eVar2.b();
                }
                if (c2Var != null) {
                    c2Var.dismiss();
                    return;
                }
                return;
            case 7:
                cc0 cc0Var = (cc0) this.f33185b;
                TLObject tLObject = (TLObject) this.f33186c;
                cc0Var.a();
                if (tLObject != null) {
                    cc0Var.f32654a.j0((TL_account.Password) tLObject);
                    return;
                }
                return;
            case 8:
                ((FiltersSetupActivity) this.f33186c).X(((cc0) this.f33185b).f32654a.O());
                return;
            case 9:
                fd0 fd0Var = (fd0) this.f33185b;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) this.f33186c;
                if (gLSurfaceView.getWidth() != 0 && gLSurfaceView.getHeight() != 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getHeight() * gLSurfaceView.getWidth() * 4);
                    GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    Matrix matrix = new Matrix();
                    matrix.preScale(1.0f, -1.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
                    createBitmap.recycle();
                    AndroidUtilities.runOnUIThread(new tq(fd0Var, createBitmap2, gLSurfaceView, 21));
                    return;
                }
                return;
            case 10:
                fd0 fd0Var2 = (fd0) this.f33185b;
                fd0Var2.f33490c.setImageResource(R.drawable.msg_location_alert2);
                fd0Var2.e0(((LocationController.SharingLocationInfo) this.f33186c).proximityMeters);
                fd0Var2.G = false;
                return;
            case 11:
                ((EditText) this.f33185b).removeTextChangedListener((org.telegram.ui.Components.sn) this.f33186c);
                return;
            case 12:
                Runnable runnable2 = (Runnable) this.f33186c;
                ae0 ae0Var = ((de0) this.f33185b).f32941a;
                int i12 = 0;
                while (true) {
                    ds[] dsVarArr = ae0Var.f32431f;
                    if (i12 < dsVarArr.length) {
                        dsVarArr[i12].l(0.0f);
                        i12++;
                    } else {
                        runnable2.run();
                        ae0Var.e = false;
                        return;
                    }
                }
            case 13:
                me0 me0Var = (me0) this.f33185b;
                tg0 tg0Var = me0Var.f35676y;
                tg0Var.k1(false, false);
                AndroidUtilities.hideKeyboard(me0Var.f35667a);
                tg0Var.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33186c), false);
                return;
            case 14:
                me0 me0Var2 = (me0) this.f33185b;
                String str2 = (String) this.f33186c;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = me0Var2.f35671n.current_algo;
                boolean z10 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
                if (z10) {
                    bArr = SRPHelper.getX(AndroidUtilities.getStringBytes(str2), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    bArr = null;
                }
                ke0 ke0Var = new ke0(me0Var2, 2);
                if (z10) {
                    TL_account.Password password = me0Var2.f35671n;
                    TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (startCheck == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "PASSWORD_HASH_INVALID";
                        ke0Var.run(null, tL_error);
                        return;
                    }
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = startCheck;
                    i10 = ((org.telegram.ui.ActionBar.o2) me0Var2.f35676y).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkPassword, ke0Var, 10);
                    return;
                }
                return;
            case 15:
                ef0 ef0Var = (ef0) this.f33185b;
                ef0Var.O.k1(false, false);
                AndroidUtilities.hideKeyboard(ef0Var.O.fragmentView.findFocus());
                ef0Var.O.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33186c), true);
                TLRPC.FileLocation fileLocation = ef0Var.N;
                if (fileLocation != null) {
                    Utilities.cacheClearQueue.postRunnable(new ea0(16, ef0Var, fileLocation));
                    return;
                }
                return;
            case 16:
                i11 = ((org.telegram.ui.ActionBar.o2) ((ef0) this.f33185b).O).currentAccount;
                MessagesController.getInstance(i11).uploadAndApplyUserAvatar((TLRPC.FileLocation) this.f33186c);
                return;
            case 17:
                ff0 ff0Var = (ff0) this.f33185b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f33186c;
                tg0 tg0Var2 = ff0Var.E;
                tg0Var2.k1(false, true);
                if (tL_error2 == null) {
                    if (ff0Var.f33541r != null && ff0Var.f33542s != null && ff0Var.v != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("phoneFormated", ff0Var.f33541r);
                        bundle.putString("phoneHash", ff0Var.f33542s);
                        bundle.putString("code", ff0Var.v);
                        tg0Var2.u1(5, true, bundle, false);
                        return;
                    }
                    tg0Var2.u1(0, true, null, true);
                    return;
                } else if (tL_error2.text.equals("2FA_RECENT_CONFIRM")) {
                    tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                    return;
                }
            case 18:
                wf0 wf0Var = (wf0) this.f33185b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Activity) this.f33186c);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.CancelLinkSuccessTitle);
                alertDialog$Builder.f18655a.T = LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, org.telegram.messenger.qk.h(new StringBuilder("+"), wf0Var.f39260b, gf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder.f18655a.setOnDismissListener(new sf0(wf0Var, 0));
                alertDialog$Builder.o();
                return;
            case 19:
                wf0 wf0Var2 = (wf0) this.f33185b;
                wf0Var2.getClass();
                wf0Var2.f39265e0 = ((TLRPC.TL_error) this.f33186c).text;
                return;
            case 20:
                ((wf0) this.f33185b).f39282s0.o1((TLRPC.TL_auth_authorization) ((TLObject) this.f33186c), false);
                return;
            case 21:
                Runnable runnable3 = (Runnable) this.f33186c;
                bs bsVar = ((wf0) this.f33185b).f39266f;
                int i13 = 0;
                while (true) {
                    ds[] dsVarArr2 = bsVar.f32431f;
                    if (i13 < dsVarArr2.length) {
                        dsVarArr2[i13].l(0.0f);
                        i13++;
                    } else {
                        runnable3.run();
                        bsVar.e = false;
                        return;
                    }
                }
            case 22:
                ((u3) this.f33185b).run((String) this.f33186c);
                return;
            case 23:
                vh0 vh0Var = (vh0) this.f33185b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f33186c;
                vh0Var.f38587c0 = false;
                if (tL_error3 == null) {
                    mh0 f02 = vh0Var.f0();
                    vh0Var.f38595j0.clear();
                    vh0Var.h0(f02);
                    return;
                }
                return;
            case 24:
                vh0 vh0Var2 = ((lh0) this.f33185b).f35352a;
                mh0 f03 = vh0Var2.f0();
                vh0Var2.f38594i0.add(0, (TLRPC.TL_chatInviteExported) ((TLObject) this.f33186c));
                TLRPC.ChatFull chatFull = vh0Var2.d;
                if (chatFull != null) {
                    chatFull.invitesCount++;
                    vh0Var2.getMessagesStorage().saveChatLinksCount(vh0Var2.f38598n, vh0Var2.d.invitesCount);
                }
                vh0Var2.h0(f03);
                return;
            case 25:
                gj0 gj0Var = (gj0) this.f33185b;
                TL_stats.TL_statsGraphError tL_statsGraphError = (TL_stats.TL_statsGraphError) this.f33186c;
                if (gj0Var.getParentActivity() != null) {
                    Toast.makeText(gj0Var.getParentActivity(), tL_statsGraphError.error, 1).show();
                    return;
                }
                return;
            case 26:
                yj0 yj0Var = (yj0) this.f33185b;
                yj0Var.getClass();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("sms:+" + ((String) this.f33186c)));
                intent.putExtra("sms_body", LocaleController.formatString(R.string.InviteText2, "https://telegram.org/dl"));
                yj0Var.getContext().startActivity(intent);
                return;
            case 27:
                TLRPC.User user = (TLRPC.User) this.f33186c;
                ((yj0) this.f33185b).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(user.f18476id));
                    return;
                }
                return;
            case 28:
                ((et) this.f33185b).run((TLRPC.User) this.f33186c);
                return;
            default:
                NotificationsCustomSettingsActivity.W((NotificationsCustomSettingsActivity) this.f33185b, (ArrayList) this.f33186c);
                return;
        }
    }
}
