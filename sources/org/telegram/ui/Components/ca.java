package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sa1;
public final class ca implements View.OnClickListener {
    public final int f25157a;
    public final Object f25158b;
    public final Object f25159c;

    public ca(int i10, Object obj, Object obj2) {
        this.f25157a = i10;
        this.f25158b = obj;
        this.f25159c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        ps psVar;
        s4.b1 T;
        long j10;
        int i11 = this.f25157a;
        int i12 = -1;
        s4.b1 b1Var = null;
        int i13 = 0;
        Object obj = this.f25159c;
        Object obj2 = this.f25158b;
        switch (i11) {
            case 0:
                da daVar = (da) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        pf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f25422n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f25422n.document)) {
                            FileLoader.getInstance(daVar.f25424s).loadFile(daVar.f25422n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.r(daVar.getContext(), daVar.f25422n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                kd kdVar = (kd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                i80 i80Var = kdVar.X0;
                if (i80Var != null && i80Var.D()) {
                    kdVar.X0.u();
                    kdVar.X0 = null;
                    return;
                }
                kdVar.f27849d1.e(true);
                i80 F = i80.F(frameLayout, new ci.b(), kdVar.V0);
                kdVar.X0 = F;
                F.f27185s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                kdVar.X0.k();
                for (int i14 : kdVar.f27848c1) {
                    if (i14 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i14 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                    }
                    kdVar.X0.c(0, formatPluralString, new e2(kdVar, i14, 3), false);
                    if (kdVar.f27847b1 == i14) {
                        kdVar.X0.L();
                    }
                }
                kdVar.X0.Z();
                return;
            case 2:
                ol olVar = (ol) obj2;
                ql qlVar = (ql) obj;
                rl rlVar = olVar.f29064b;
                ti tiVar = rlVar.f28173b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) tiVar.f30546f0;
                if (qnVar.c()) {
                    parentActivity = rlVar.getParentActivity();
                    f5.L(parentActivity, qnVar.a(), new q2(8, olVar, qlVar), rlVar.f28172a);
                    return;
                }
                f5.Z(tiVar.M1, tiVar.l1() + 1, tiVar.p1(), new org.telegram.ui.ActionBar.j3(26, olVar, qlVar));
                return;
            case 3:
                fo foVar = ((co) obj2).d;
                sa1 sa1Var = foVar.f26313s;
                View F2 = sa1Var.F((bo) obj);
                if (F2 != null) {
                    b1Var = sa1Var.T(F2);
                }
                if (b1Var != null && (b10 = b1Var.b() - foVar.f26315t0) >= 0 && b10 < foVar.K.length) {
                    fo.R(foVar, b10);
                    return;
                }
                return;
            case 4:
                oo ooVar = (oo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                org.telegram.ui.qn qnVar2 = ooVar.G;
                if (ooVar.T) {
                    qnVar2.showDialog(f5.U(ooVar.getContext(), qnVar2.h, d6Var).f20605a);
                    return;
                }
                ko koVar = ooVar.e;
                if (qnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = qnVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (ooVar.f29085a.f17384f && qnVar2.getParentActivity() != null && qnVar2.fragmentView != null && qnVar2.Z7 != null) {
                            if (qnVar2.f40789o2 == null) {
                                r40 r40Var = new r40(7, qnVar2.getParentActivity(), qnVar2.f40673ea, true);
                                qnVar2.f40789o2 = r40Var;
                                r40Var.setAlpha(0.0f);
                                qnVar2.f40789o2.setVisibility(4);
                                qnVar2.f40789o2.setShowingDuration(4000L);
                                qnVar2.X0.addView(qnVar2.f40789o2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i15 = qnVar2.Z7.ttl_period;
                            if (i15 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i15 / 86400, new Object[0]);
                            } else if (i15 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            } else if (i15 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                            }
                            qnVar2.f40789o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            qnVar2.f40789o2.f(qnVar2.f40613a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = qnVar2.Z7;
                    TLRPC.UserFull userFull = qnVar2.f40619a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    p8 p8Var = new p8(ooVar.getContext(), null, new lo(ooVar, r5), true, 0, ooVar.f29091d0);
                    p8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = p8Var.f29257a;
                    mo moVar = new mo(ooVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {moVar};
                    moVar.e = true;
                    moVar.f21577c = 220;
                    moVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(koVar, 0, (int) (ooVar.getX() + koVar.getX()), (int) koVar.getY());
                    qnVar2.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 5:
                wp.o((wp) obj2, (org.telegram.ui.qn) obj);
                return;
            case 6:
                xr.Q((xr) obj2, (TLRPC.Peer) obj);
                return;
            case 7:
                fs fsVar = (fs) obj2;
                String str = (String) obj;
                if (fsVar.f26400b == null && (view2 = fsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        fsVar.f26400b = (EditText) findFocus;
                    }
                }
                if (fsVar.f26400b != null) {
                    try {
                        fsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = fsVar.f26400b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = fsVar.f26400b.getText();
                    if (fsVar.f26400b.getSelectionEnd() == fsVar.f26400b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + fsVar.f26400b.getSelectionStart();
                    }
                    if (fsVar.f26400b.getSelectionStart() != -1 && fsVar.f26400b.getSelectionEnd() != -1) {
                        EditText editText2 = fsVar.f26400b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), fsVar.f26400b.getSelectionEnd(), str));
                        EditText editText3 = fsVar.f26400b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        fsVar.f26400b.setText(str);
                        EditText editText4 = fsVar.f26400b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = fsVar.f26400b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ps psVar2 = (ps) obj2;
                os osVar = (os) obj;
                psVar2.K();
                osVar.f29131f = !osVar.f29131f;
                osVar.f29134j.X.N(true);
                psVar2.u();
                return;
            case 9:
                ((ps) obj2).B0 = !psVar.B0;
                ((u61) obj).N(true);
                return;
            case 10:
                ((nt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.n2) obj).presentFragment(new org.telegram.ui.c7());
                return;
            case 11:
                aw.p((aw) obj2, (a6) obj);
                return;
            case 12:
                kz kzVar = (kz) obj2;
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) obj;
                tz tzVar = kzVar.v;
                ax axVar = tzVar.D0;
                if (axVar.indexOfChild(n8Var) != -1 && (T = axVar.T(n8Var)) != null) {
                    if (T.b() == tzVar.f30733f1) {
                        if (tzVar.f30739h1 != null) {
                            uy uyVar = tzVar.f30776t1;
                            if (uyVar != null) {
                                uyVar.y(tzVar.J1.f20277id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(tzVar.f30723c1).edit();
                        String str2 = "group_hide_stickers_" + tzVar.J1.f20277id;
                        TLRPC.StickerSet stickerSet = tzVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f20303id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        tzVar.X(false);
                        kz kzVar2 = tzVar.f30793y0;
                        if (kzVar2 != null) {
                            kzVar2.l();
                            return;
                        }
                        return;
                    } else if (kzVar.h.get(T.b()) == tzVar.f30745j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.f27982c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new tv(kzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 13:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.Q0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                int i16 = 0;
                while (true) {
                    if (i16 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i16]) {
                            i12 = i16;
                        } else {
                            i16++;
                        }
                    }
                }
                int i17 = i12 + 1;
                if (i17 < 3) {
                    i13 = i17;
                }
                float f7 = fArr[i13];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    s40 s40Var = s40.v;
                    if (s40Var.c()) {
                        s40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            c20 c20Var = new c20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = c20Var;
                            c20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                            fragmentContextView.B0.setText(LocaleController.getString(R.string.SpeedHint));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                return;
            case 14:
                k20 k20Var = (k20) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = k20Var.F.indexOf(t0Var.getFilter());
                if (k20Var.I != indexOf) {
                    k20Var.I = indexOf;
                    k20Var.f();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21715a.f17384f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.o0 filter = t0Var.getFilter();
                    k20Var.g(filter);
                    j20 j20Var = k20Var.H;
                    if (j20Var != null) {
                        ((org.telegram.ui.hx) j20Var).g(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 15:
                ((z2) obj).run(Long.valueOf(((p20) obj2).d));
                return;
            case 16:
                ((org.telegram.ui.rp) obj).run();
                ((f40) obj2).dismiss();
                return;
            case 17:
                ((i80) obj2).u();
                ((org.telegram.ui.yb0) obj).run();
                return;
            case 18:
                i80 i80Var2 = (i80) obj2;
                ((org.telegram.ui.fv) obj).run();
                if (i80Var2.J) {
                    i80Var2.u();
                    return;
                }
                return;
            case 19:
                r80.n((r80) obj2, (p80) obj);
                return;
            case 20:
                jf0.n((jf0) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 21:
                bj0 bj0Var = (bj0) obj2;
                org.telegram.ui.xu xuVar = (org.telegram.ui.xu) obj;
                if (bj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, bj0Var.getValue());
                    org.telegram.ui.nc0 nc0Var = (org.telegram.ui.nc0) xuVar.f43274c;
                    TLRPC.User user = (TLRPC.User) xuVar.f43273b;
                    if (nc0Var.getLocationController().getSharingLocationInfo(nc0Var.f39505e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20605a;
                        b2Var2.R = string2;
                        b2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.b2(nc0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        nc0Var.showDialog(b2Var2);
                    } else {
                        nc0Var.R.L = true;
                        nc0Var.f39502c.setImageResource(R.drawable.msg_location_alert2);
                        nc0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        nc0Var.getLocationController().setProximityLocation(nc0Var.f39505e0, max, true);
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        bj0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                gj0 gj0Var = (gj0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(gj0Var.f26589b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, gj0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 23:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            case 24:
                ai.y9 y9Var = (ai.y9) obj2;
                y9Var.e = !y9Var.e;
                ((org.telegram.messenger.wj) obj).run();
                y9Var.j(true);
                return;
            case 25:
                org.telegram.ui.et.q().v(((my0) obj2).f28628r.m0);
                org.telegram.ui.et.q().y((org.telegram.ui.Cells.e8) obj);
                return;
            case 26:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 27:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            case 28:
                e51 e51Var = (e51) obj2;
                e51Var.f25740k0 = false;
                e51Var.K();
                ((u61) obj).N(true);
                e51Var.u();
                return;
            default:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                ImageView imageView = ((z41) obj2).f32839s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(bs.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
