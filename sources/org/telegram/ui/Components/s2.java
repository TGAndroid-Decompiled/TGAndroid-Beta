package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.va1;
public final class s2 implements View.OnClickListener {
    public final int f32337a;
    public final Object f32338b;
    public final Object f32339c;

    public s2(int i9, Object obj, Object obj2) {
        this.f32337a = i9;
        this.f32338b = obj;
        this.f32339c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int L;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i9;
        String formatPluralString2;
        int length;
        View view2;
        wr wrVar;
        f2.q1 T;
        long j10;
        int i10 = this.f32337a;
        int i11 = -1;
        f2.q1 q1Var = null;
        boolean z10 = false;
        Object obj = this.f32339c;
        Object obj2 = this.f32338b;
        switch (i10) {
            case 0:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f22702a.H0.run();
                ((org.telegram.ui.bu) obj).onClick(null, intValue);
                return;
            case 1:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f22713a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 2:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 3:
                c8.E((c8) obj2, (float[]) obj);
                return;
            case 4:
                c8 c8Var = (c8) obj2;
                c8Var.getClass();
                ((x60) obj).u();
                c8Var.s0(7);
                return;
            case 5:
                a90 a90Var = (a90) obj;
                c8 c8Var2 = ((t7) obj2).B;
                int g02 = c8.g0(c8Var2);
                LaunchActivity launchActivity = c8Var2.C0;
                if (MessagesController.getInstance(g02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(a90Var.getText().toString())) {
                    String charSequence = a90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.dy) {
                        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = dyVar.getMessagesController().getTotalDialogsCount();
                        if (!dyVar.f37668h2 && (totalDialogsCount > 10 || dyVar.G)) {
                            if (!dyVar.f37658f2) {
                                dyVar.f37744x = 3;
                                dyVar.T.f30664r.setText(charSequence);
                                dyVar.T.f30664r.setSelection(charSequence.length());
                            } else {
                                dyVar.T.f30664r.setText(charSequence);
                                dyVar.T.f30664r.setSelection(charSequence.length());
                                org.telegram.ui.mx mxVar = dyVar.f37750y0;
                                if (mxVar != null && (L = mxVar.L(3)) >= 0 && dyVar.f37750y0.getTabsView().getCurrentTabId() != L) {
                                    dyVar.f37750y0.getTabsView().d(L, L);
                                }
                            }
                            c8Var2.dismiss();
                            return;
                        }
                    }
                    org.telegram.ui.dy dyVar2 = new org.telegram.ui.dy(null);
                    dyVar2.f37678j2 = charSequence;
                    dyVar2.f37744x = 3;
                    launchActivity.q0(dyVar2, false, false);
                    c8Var2.dismiss();
                    return;
                }
                return;
            case 6:
                w8 w8Var = (w8) obj2;
                ((boolean[]) obj)[0] = true;
                w8Var.F.w1(w8Var.U);
                w8Var.O.dismiss();
                return;
            case 7:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ve.e.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        ve.e.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(v9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = v9Var.f33332n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) v9Var.getContext(), v9Var.f33332n.document)) {
                            FileLoader.getInstance(v9Var.f33334s).loadFile(v9Var.f33332n.document, "update", 3, 1);
                            v9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        ve.e.s(v9Var.getContext(), v9Var.f33332n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                ad adVar = (ad) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                x60 x60Var = adVar.T0;
                if (x60Var != null && x60Var.D()) {
                    adVar.T0.u();
                    adVar.T0 = null;
                    return;
                }
                adVar.Z0.e(true);
                x60 F = x60.F(frameLayout, new ih.b(), adVar.R0);
                adVar.T0 = F;
                F.f34580s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                adVar.T0.k();
                for (int i12 : adVar.Y0) {
                    if (i12 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i12 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i12, new Object[0]);
                    }
                    adVar.T0.c(0, formatPluralString, new bg.c2(adVar, i12, 29), false);
                    if (adVar.X0 == i12) {
                        adVar.T0.L();
                    }
                }
                adVar.T0.Z();
                return;
            case 9:
                uk ukVar = (uk) obj2;
                wk wkVar = (wk) obj;
                xk xkVar = ukVar.f33085b;
                ki kiVar = xkVar.f27493b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) kiVar.f30099b0;
                if (qnVar.c()) {
                    parentActivity = xkVar.getParentActivity();
                    y4.M(parentActivity, qnVar.a(), new g1(12, ukVar, wkVar), xkVar.f27492a);
                    return;
                }
                y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new org.telegram.ui.df(15, ukVar, wkVar));
                return;
            case 10:
                jn jnVar = ((hn) obj2).d;
                va1 va1Var = jnVar.f29791s;
                View F2 = va1Var.F((gn) obj);
                if (F2 != null) {
                    q1Var = va1Var.T(F2);
                }
                if (q1Var != null && (b10 = q1Var.b() - jnVar.f29787p0) >= 0 && b10 < jnVar.G.length) {
                    jn.N(jnVar, b10);
                    return;
                }
                return;
            case 11:
                tn tnVar = (tn) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj;
                org.telegram.ui.qn qnVar2 = tnVar.C;
                if (tnVar.P) {
                    qnVar2.showDialog(y4.V(tnVar.getContext(), qnVar2.h, b6Var).f22702a);
                    return;
                }
                pn pnVar = tnVar.f32731e;
                if (qnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = qnVar2.f41890e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (tnVar.f32724a.f47776f && qnVar2.getParentActivity() != null && qnVar2.fragmentView != null && qnVar2.V7 != null) {
                            if (qnVar2.f41968k2 == null) {
                                s30 s30Var = new s30(7, qnVar2.getParentActivity(), qnVar2.f41848aa, true);
                                qnVar2.f41968k2 = s30Var;
                                s30Var.setAlpha(0.0f);
                                qnVar2.f41968k2.setVisibility(4);
                                qnVar2.f41968k2.setShowingDuration(4000L);
                                qnVar2.T0.addView(qnVar2.f41968k2, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i13 = qnVar2.V7.ttl_period;
                            if (i13 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i13 / 86400, new Object[0]);
                            } else if (i13 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]);
                            } else if (i13 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i13 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i13, new Object[0]);
                            }
                            qnVar2.f41968k2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            qnVar2.f41968k2.f(qnVar2.W0.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = qnVar2.V7;
                    TLRPC.UserFull userFull = qnVar2.W7;
                    if (userFull != null) {
                        i9 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i9 = chatFull.ttl_period;
                    } else {
                        i9 = 0;
                    }
                    h8 h8Var = new h8(tnVar.getContext(), null, new qn(tnVar, r3), true, 0, tnVar.W);
                    h8Var.b(i9);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.f28988a;
                    rn rnVar = new rn(tnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.o1[] o1VarArr = {rnVar};
                    rnVar.f23690e = true;
                    rnVar.f23689c = 220;
                    rnVar.setOutsideTouchable(true);
                    o1VarArr[0].setClippingEnabled(true);
                    o1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    o1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    o1VarArr[0].setInputMethodMode(2);
                    o1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    o1VarArr[0].showAtLocation(pnVar, 0, (int) (tnVar.getX() + pnVar.getX()), (int) pnVar.getY());
                    qnVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 12:
                cp.n((cp) obj2, (org.telegram.ui.qn) obj);
                return;
            case 13:
                cr.O((cr) obj2, (TLRPC.Peer) obj);
                return;
            case 14:
                kr krVar = (kr) obj2;
                String str = (String) obj;
                if (krVar.f30227b == null && (view2 = krVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        krVar.f30227b = (EditText) findFocus;
                    }
                }
                if (krVar.f30227b != null) {
                    try {
                        krVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = krVar.f30227b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = krVar.f30227b.getText();
                    if (krVar.f30227b.getSelectionEnd() == krVar.f30227b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + krVar.f30227b.getSelectionStart();
                    }
                    if (krVar.f30227b.getSelectionStart() != -1 && krVar.f30227b.getSelectionEnd() != -1) {
                        EditText editText2 = krVar.f30227b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), krVar.f30227b.getSelectionEnd(), str));
                        EditText editText3 = krVar.f30227b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        krVar.f30227b.setText(str);
                        EditText editText4 = krVar.f30227b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = krVar.f30227b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                wr wrVar2 = (wr) obj2;
                vr vrVar = (vr) obj;
                wrVar2.I();
                vrVar.f33981f = !vrVar.f33981f;
                vrVar.f33984j.T.N(true);
                wrVar2.s();
                return;
            case 16:
                ((wr) obj2).f34344x0 = !wrVar.f34344x0;
                ((z41) obj).N(true);
                return;
            case 17:
                ((ss) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.y6());
                return;
            case 18:
                dv.o((dv) obj2, (t5) obj);
                return;
            case 19:
                ny nyVar = (ny) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                wy wyVar = nyVar.v;
                fw fwVar = wyVar.f34466z0;
                if (fwVar.indexOfChild(m8Var) != -1 && (T = fwVar.T(m8Var)) != null) {
                    if (T.b() == wyVar.f34388b1) {
                        if (wyVar.f34395d1 != null) {
                            wx wxVar = wyVar.f34432p1;
                            if (wxVar != null) {
                                wxVar.y(wyVar.F1.f22381id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(wyVar.Y0).edit();
                        String str2 = "group_hide_stickers_" + wyVar.F1.f22381id;
                        TLRPC.StickerSet stickerSet = wyVar.F1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f22407id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        wyVar.Y(false);
                        ny nyVar2 = wyVar.f34448u0;
                        if (nyVar2 != null) {
                            nyVar2.l();
                            return;
                        }
                        return;
                    } else if (nyVar.h.get(T.b()) == wyVar.f34403f1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.f31212c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new wu(nyVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 20:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.I0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.R);
                int i14 = 0;
                while (true) {
                    if (i14 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i14]) {
                            i11 = i14;
                        } else {
                            i14++;
                        }
                    }
                }
                int i15 = i11 + 1;
                if (i15 >= 3) {
                    i15 = 0;
                }
                float f10 = fArr[i15];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.R, f10);
                fragmentContextView.l(playbackSpeed, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.f26406x0 > 300) {
                    int i16 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i16 > 2) {
                        i16 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i16).apply();
                    if (i16 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.wi wiVar = new org.telegram.ui.wi(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.f26404w0 = wiVar;
                        wiVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.f26404w0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.f26404w0, marginLayoutParams);
                        fragmentContextView.f26404w0.f(fragmentContextView.B, true);
                    }
                }
                fragmentContextView.f26406x0 = currentTimeMillis;
                return;
            case 21:
                m10 m10Var = (m10) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = m10Var.B.indexOf(v0Var.getFilter());
                if (m10Var.E != indexOf) {
                    m10Var.E = indexOf;
                    m10Var.f();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23839a.f47776f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    of.m0 filter = v0Var.getFilter();
                    m10Var.g(filter);
                    l10 l10Var = m10Var.D;
                    if (l10Var != null) {
                        ((org.telegram.ui.ix) l10Var).e(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 22:
                ((v2) obj).run(Long.valueOf(((r10) obj2).d));
                return;
            case 23:
                ((org.telegram.ui.qp) obj).run();
                ((g30) obj2).dismiss();
                return;
            case 24:
                ((x60) obj2).u();
                ((org.telegram.ui.r90) obj).run();
                return;
            case 25:
                x60 x60Var2 = (x60) obj2;
                ((org.telegram.ui.gv) obj).run();
                if (x60Var2.J) {
                    x60Var2.u();
                    return;
                }
                return;
            case 26:
                g70.m((g70) obj2, (e70) obj);
                return;
            case 27:
                wd0.m((wd0) obj2, (org.telegram.ui.ActionBar.b6) obj);
                return;
            case 28:
                qh0 qh0Var = (qh0) obj2;
                org.telegram.ui.yr yrVar = (org.telegram.ui.yr) obj;
                if (qh0Var.F.getTag() == null) {
                    int max = (int) Math.max(1.0f, qh0Var.getValue());
                    org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) yrVar.f44934b;
                    TLRPC.User user = (TLRPC.User) yrVar.f44935c;
                    if (pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f41442a0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new c3.e(pc0Var, user, max, 11));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        pc0Var.showDialog(c2Var2);
                    } else {
                        pc0Var.N.H = true;
                        pc0Var.f41445c.setImageResource(R.drawable.msg_location_alert2);
                        pc0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        pc0Var.getLocationController().setProximityLocation(pc0Var.f41442a0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        qh0Var.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                wh0 wh0Var = (wh0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(wh0Var.f34228b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, wh0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
        }
    }
}
