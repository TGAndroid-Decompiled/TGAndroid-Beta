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
import org.telegram.ui.wa1;
public final class aa implements View.OnClickListener {
    public final int f24681a;
    public final Object f24682b;
    public final Object f24683c;

    public aa(int i10, Object obj, Object obj2) {
        this.f24681a = i10;
        this.f24682b = obj;
        this.f24683c = obj2;
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
        ns nsVar;
        s4.b1 T;
        long j10;
        int i11 = this.f24681a;
        int i12 = -1;
        s4.b1 b1Var = null;
        int i13 = 0;
        Object obj = this.f24683c;
        Object obj2 = this.f24682b;
        switch (i11) {
            case 0:
                ba baVar = (ba) obj2;
                LaunchActivity launchActivity = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(launchActivity, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        pf.d.r(launchActivity, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(baVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = baVar.f24946n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) baVar.getContext(), baVar.f24946n.document)) {
                            FileLoader.getInstance(baVar.f24948s).loadFile(baVar.f24946n.document, "update", 3, 1);
                            baVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.r(baVar.getContext(), baVar.f24946n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                id idVar = (id) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                h80 h80Var = idVar.X0;
                if (h80Var != null && h80Var.D()) {
                    idVar.X0.u();
                    idVar.X0 = null;
                    return;
                }
                idVar.f27401d1.e(true);
                h80 F = h80.F(frameLayout, new ci.b(), idVar.V0);
                idVar.X0 = F;
                F.f26929s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                idVar.X0.k();
                for (int i14 : idVar.f27400c1) {
                    if (i14 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i14 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                    }
                    idVar.X0.c(0, formatPluralString, new c2(idVar, i14, 3), false);
                    if (idVar.f27399b1 == i14) {
                        idVar.X0.L();
                    }
                }
                idVar.X0.Z();
                return;
            case 2:
                pl.V((pl) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 3:
                ml mlVar = (ml) obj2;
                ol olVar = (ol) obj;
                pl plVar = mlVar.f28621b;
                ri riVar = plVar.f27704b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) riVar.f30146f0;
                if (snVar.c()) {
                    parentActivity = plVar.getParentActivity();
                    d5.L(parentActivity, snVar.a(), new o2(9, mlVar, olVar), plVar.f27703a);
                    return;
                }
                d5.Z(riVar.M1, riVar.o1() + 1, riVar.s1(), new org.telegram.ui.ActionBar.m3(26, mlVar, olVar));
                return;
            case 4:
                co coVar = ((ao) obj2).d;
                wa1 wa1Var = coVar.f25392s;
                View F2 = wa1Var.F((zn) obj);
                if (F2 != null) {
                    b1Var = wa1Var.T(F2);
                }
                if (b1Var != null && (b10 = b1Var.b() - coVar.f25394t0) >= 0 && b10 < coVar.K.length) {
                    co.R(coVar, b10);
                    return;
                }
                return;
            case 5:
                mo moVar = (mo) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.sn snVar2 = moVar.G;
                if (moVar.T) {
                    snVar2.showDialog(d5.U(moVar.getContext(), snVar2.h, g6Var).f20679a);
                    return;
                }
                io ioVar = moVar.e;
                if (snVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = snVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (moVar.f28630a.f17447f && snVar2.getParentActivity() != null && snVar2.fragmentView != null && snVar2.f41589l8 != null) {
                            if (snVar2.A2 == null) {
                                p40 p40Var = new p40(7, snVar2.getParentActivity(), snVar2.f41651qa, true);
                                snVar2.A2 = p40Var;
                                p40Var.setAlpha(0.0f);
                                snVar2.A2.setVisibility(4);
                                snVar2.A2.setShowingDuration(4000L);
                                snVar2.f41558j1.addView(snVar2.A2, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i15 = snVar2.f41589l8.ttl_period;
                            if (i15 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i15 / 86400, new Object[0]);
                            } else if (i15 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i15 / 3600, new Object[0]);
                            } else if (i15 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i15 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                            }
                            snVar2.A2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            snVar2.A2.f(snVar2.f41594m1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = snVar2.f41589l8;
                    TLRPC.UserFull userFull = snVar2.f41601m8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    n8 n8Var = new n8(moVar.getContext(), null, new jo(moVar, r5), true, 0, moVar.f28636d0);
                    n8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n8Var.f28825a;
                    ko koVar = new ko(moVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {koVar};
                    koVar.e = true;
                    koVar.f21632c = 220;
                    koVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(ioVar, 0, (int) (moVar.getX() + ioVar.getX()), (int) ioVar.getY());
                    snVar2.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 6:
                up.n((up) obj2, (org.telegram.ui.sn) obj);
                return;
            case 7:
                vr.P((vr) obj2, (TLRPC.Peer) obj);
                return;
            case 8:
                ds dsVar = (ds) obj2;
                String str = (String) obj;
                if (dsVar.f25822b == null && (view2 = dsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        dsVar.f25822b = (EditText) findFocus;
                    }
                }
                if (dsVar.f25822b != null) {
                    try {
                        dsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = dsVar.f25822b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = dsVar.f25822b.getText();
                    if (dsVar.f25822b.getSelectionEnd() == dsVar.f25822b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + dsVar.f25822b.getSelectionStart();
                    }
                    if (dsVar.f25822b.getSelectionStart() != -1 && dsVar.f25822b.getSelectionEnd() != -1) {
                        EditText editText2 = dsVar.f25822b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), dsVar.f25822b.getSelectionEnd(), str));
                        EditText editText3 = dsVar.f25822b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        dsVar.f25822b.setText(str);
                        EditText editText4 = dsVar.f25822b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = dsVar.f25822b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ns nsVar2 = (ns) obj2;
                ms msVar = (ms) obj;
                nsVar2.J();
                msVar.f28690f = !msVar.f28690f;
                msVar.f28693j.X.N(true);
                nsVar2.t();
                return;
            case 10:
                ((ns) obj2).B0 = !nsVar.B0;
                ((a71) obj).N(true);
                return;
            case 11:
                ((lt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new org.telegram.ui.c7());
                return;
            case 12:
                yv.p((yv) obj2, (y5) obj);
                return;
            case 13:
                iz izVar = (iz) obj2;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) obj;
                rz rzVar = izVar.v;
                yw ywVar = rzVar.D0;
                if (ywVar.indexOfChild(o8Var) != -1 && (T = ywVar.T(o8Var)) != null) {
                    if (T.b() == rzVar.f30320f1) {
                        if (rzVar.f30326h1 != null) {
                            sy syVar = rzVar.f30363t1;
                            if (syVar != null) {
                                syVar.y(rzVar.J1.f20345id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(rzVar.f30310c1).edit();
                        String str2 = "group_hide_stickers_" + rzVar.J1.f20345id;
                        TLRPC.StickerSet stickerSet = rzVar.J1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f20371id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        rzVar.X(false);
                        iz izVar2 = rzVar.f30380y0;
                        if (izVar2 != null) {
                            izVar2.l();
                            return;
                        }
                        return;
                    } else if (izVar.h.get(T.b()) == rzVar.f30332j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(izVar.f27515c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new rv(izVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 14:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.W0;
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
                    q40 q40Var = q40.v;
                    if (q40Var.c()) {
                        q40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            a20 a20Var = new a20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = a20Var;
                            a20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
            case 15:
                i20 i20Var = (i20) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = i20Var.F.indexOf(t0Var.getFilter());
                if (i20Var.I != indexOf) {
                    i20Var.I = indexOf;
                    i20Var.e();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21844a.f17447f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.o0 filter = t0Var.getFilter();
                    i20Var.f(filter);
                    h20 h20Var = i20Var.H;
                    if (h20Var != null) {
                        ((org.telegram.ui.jx) h20Var).f(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 16:
                ((x2) obj).run(Long.valueOf(((n20) obj2).d));
                return;
            case 17:
                ((org.telegram.ui.tp) obj).run();
                ((d40) obj2).dismiss();
                return;
            case 18:
                ((h80) obj2).u();
                ((org.telegram.ui.dc0) obj).run();
                return;
            case 19:
                h80 h80Var2 = (h80) obj2;
                ((org.telegram.ui.hv) obj).run();
                if (h80Var2.J) {
                    h80Var2.u();
                    return;
                }
                return;
            case 20:
                q80.m((q80) obj2, (o80) obj);
                return;
            case 21:
                lf0.m((lf0) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 22:
                dj0 dj0Var = (dj0) obj2;
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) obj;
                if (dj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, dj0Var.getValue());
                    org.telegram.ui.rc0 rc0Var = (org.telegram.ui.rc0) ksVar.f39027b;
                    TLRPC.User user = (TLRPC.User) ksVar.f39028c;
                    if (rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f41099e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rc0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                        c2Var2.R = string2;
                        c2Var2.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.b2(rc0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        rc0Var.showDialog(c2Var2);
                    } else {
                        rc0Var.R.L = true;
                        rc0Var.f41096c.setImageResource(R.drawable.msg_location_alert2);
                        rc0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        rc0Var.getLocationController().setProximityLocation(rc0Var.f41099e0, max, true);
                        i13 = 1;
                    }
                    if (i13 != 0) {
                        dj0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ij0 ij0Var = (ij0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ij0Var.f27432b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ij0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 24:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            case 25:
                ai.y9 y9Var = (ai.y9) obj2;
                y9Var.e = !y9Var.e;
                ((org.telegram.messenger.yj) obj).run();
                y9Var.j(true);
                return;
            case 26:
                org.telegram.ui.ht.o().t(((oy0) obj2).f29433r.m0);
                org.telegram.ui.ht.o().w((org.telegram.ui.Cells.e8) obj);
                return;
            case 27:
                AndroidUtilities.addToClipboard((CharSequence) obj2);
                ((Runnable) obj).run();
                return;
            case 28:
                boolean[] zArr = (boolean[]) obj;
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                j51 j51Var = (j51) obj2;
                j51Var.f27574k0 = false;
                j51Var.J();
                ((a71) obj).N(true);
                j51Var.t();
                return;
        }
    }
}
