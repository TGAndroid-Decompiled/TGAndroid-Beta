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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jb1;
public final class w2 implements View.OnClickListener {
    public final int f30166a;
    public final Object f30167b;
    public final Object f30168c;

    public w2(int i10, Object obj, Object obj2) {
        this.f30166a = i10;
        this.f30167b = obj;
        this.f30168c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int L;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        es esVar;
        f2.l1 T;
        long j10;
        int i11 = this.f30166a;
        int i12 = -1;
        f2.l1 l1Var = null;
        boolean z4 = false;
        Object obj = this.f30168c;
        Object obj2 = this.f30167b;
        switch (i11) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 1:
                c8.E((c8) obj2, (float[]) obj);
                return;
            case 2:
                c8 c8Var = (c8) obj2;
                c8Var.getClass();
                ((o70) obj).u();
                c8Var.t0(7);
                return;
            case 3:
                t90 t90Var = (t90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                int h02 = c8.h0(c8Var2);
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(t90Var.getText().toString())) {
                    String charSequence = t90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.oy) {
                        org.telegram.ui.oy oyVar = (org.telegram.ui.oy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = oyVar.getMessagesController().getTotalDialogsCount();
                        if (!oyVar.f37047i2 && (totalDialogsCount > 10 || oyVar.H)) {
                            if (!oyVar.f37037g2) {
                                oyVar.f37119x = 3;
                                oyVar.U.f23815r.setText(charSequence);
                                oyVar.U.f23815r.setSelection(charSequence.length());
                            } else {
                                oyVar.U.f23815r.setText(charSequence);
                                oyVar.U.f23815r.setSelection(charSequence.length());
                                org.telegram.ui.xx xxVar = oyVar.f37129z0;
                                if (xxVar != null && (L = xxVar.L(3)) >= 0 && oyVar.f37129z0.getTabsView().getCurrentTabId() != L) {
                                    oyVar.f37129z0.getTabsView().d(L, L);
                                }
                            }
                            c8Var2.dismiss();
                            return;
                        }
                    }
                    org.telegram.ui.oy oyVar2 = new org.telegram.ui.oy(null);
                    oyVar2.f37057k2 = charSequence;
                    oyVar2.f37119x = 3;
                    launchActivity.q0(oyVar2, false, false);
                    c8Var2.dismiss();
                    return;
                }
                return;
            case 4:
                w8 w8Var = (w8) obj;
                ((boolean[]) obj2)[0] = true;
                w8Var.G.w1(w8Var.V);
                w8Var.P.dismiss();
                return;
            case 5:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        af.g.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        af.g.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(v9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = v9Var.f29395n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) v9Var.getContext(), v9Var.f29395n.document)) {
                            FileLoader.getInstance(v9Var.f29397s).loadFile(v9Var.f29395n.document, "update", 3, 1);
                            v9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        af.g.s(v9Var.getContext(), v9Var.f29395n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                bd bdVar = (bd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                o70 o70Var = bdVar.U0;
                if (o70Var != null && o70Var.D()) {
                    bdVar.U0.u();
                    bdVar.U0 = null;
                    return;
                }
                bdVar.f23641a1.e(true);
                o70 F = o70.F(frameLayout, new nh.b(), bdVar.S0);
                bdVar.U0 = F;
                F.f27489s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                bdVar.U0.k();
                for (int i13 : bdVar.Z0) {
                    if (i13 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i13 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i13, new Object[0]);
                    }
                    bdVar.U0.c(0, formatPluralString, new af.b(bdVar, i13, 28), false);
                    if (bdVar.Y0 == i13) {
                        bdVar.U0.L();
                    }
                }
                bdVar.U0.Z();
                return;
            case 7:
                xk xkVar = (xk) obj2;
                zk zkVar = (zk) obj;
                al alVar = xkVar.f30687b;
                li liVar = alVar.f24278b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) liVar.f26689c0;
                if (xnVar.c()) {
                    parentActivity = alVar.getParentActivity();
                    z4.M(parentActivity, xnVar.a(), new o1(11, xkVar, zkVar), alVar.f24277a);
                    return;
                }
                z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new vk(0, xkVar, zkVar));
                return;
            case 8:
                qn qnVar = ((on) obj2).d;
                jb1 jb1Var = qnVar.f28188s;
                View F2 = jb1Var.F((nn) obj);
                if (F2 != null) {
                    l1Var = jb1Var.T(F2);
                }
                if (l1Var != null && (b10 = l1Var.b() - qnVar.f28185q0) >= 0 && b10 < qnVar.H.length) {
                    qn.O(qnVar, b10);
                    return;
                }
                return;
            case 9:
                zn znVar = (zn) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.xn xnVar2 = znVar.D;
                if (znVar.Q) {
                    xnVar2.showDialog(z4.V(znVar.getContext(), xnVar2.h, f6Var).f19503a);
                    return;
                }
                vn vnVar = znVar.e;
                if (xnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = xnVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (znVar.f31384a.f46893f && xnVar2.getParentActivity() != null && xnVar2.fragmentView != null && xnVar2.W7 != null) {
                            if (xnVar2.f40085l2 == null) {
                                k40 k40Var = new k40(7, xnVar2.getParentActivity(), xnVar2.f39968ba, true);
                                xnVar2.f40085l2 = k40Var;
                                k40Var.setAlpha(0.0f);
                                xnVar2.f40085l2.setVisibility(4);
                                xnVar2.f40085l2.setShowingDuration(4000L);
                                xnVar2.U0.addView(xnVar2.f40085l2, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i14 = xnVar2.W7.ttl_period;
                            if (i14 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i14 / 86400, new Object[0]);
                            } else if (i14 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i14 / 3600, new Object[0]);
                            } else if (i14 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i14 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                            }
                            xnVar2.f40085l2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            xnVar2.f40085l2.f(xnVar2.X0.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = xnVar2.W7;
                    TLRPC.UserFull userFull = xnVar2.X7;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    h8 h8Var = new h8(znVar.getContext(), null, new wn(znVar, r3), true, 0, znVar.f31385a0);
                    h8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.f25346a;
                    xn xnVar3 = new xn(znVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.p1[] p1VarArr = {xnVar3};
                    xnVar3.e = true;
                    xnVar3.f20517c = 220;
                    xnVar3.setOutsideTouchable(true);
                    p1VarArr[0].setClippingEnabled(true);
                    p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    p1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1VarArr[0].setInputMethodMode(2);
                    p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    p1VarArr[0].showAtLocation(vnVar, 0, (int) (znVar.getX() + vnVar.getX()), (int) vnVar.getY());
                    xnVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 10:
                kp.n((kp) obj2, (org.telegram.ui.xn) obj);
                return;
            case 11:
                jr.P((jr) obj2, (TLRPC.Peer) obj);
                return;
            case 12:
                sr srVar = (sr) obj2;
                String str = (String) obj;
                if (srVar.f28803b == null && (view2 = srVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        srVar.f28803b = (EditText) findFocus;
                    }
                }
                if (srVar.f28803b != null) {
                    try {
                        srVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = srVar.f28803b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = srVar.f28803b.getText();
                    if (srVar.f28803b.getSelectionEnd() == srVar.f28803b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + srVar.f28803b.getSelectionStart();
                    }
                    if (srVar.f28803b.getSelectionStart() != -1 && srVar.f28803b.getSelectionEnd() != -1) {
                        EditText editText2 = srVar.f28803b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), srVar.f28803b.getSelectionEnd(), str));
                        EditText editText3 = srVar.f28803b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        srVar.f28803b.setText(str);
                        EditText editText4 = srVar.f28803b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = srVar.f28803b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                es esVar2 = (es) obj2;
                ds dsVar = (ds) obj;
                esVar2.I();
                dsVar.f24358f = !dsVar.f24358f;
                dsVar.f24361j.U.N(true);
                esVar2.s();
                return;
            case 14:
                ((es) obj2).f24663y0 = !esVar.f24663y0;
                ((w51) obj).N(true);
                return;
            case 15:
                ((bt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.b7());
                return;
            case 16:
                mv.o((mv) obj2, (u5) obj);
                return;
            case 17:
                bz bzVar = (bz) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                kz kzVar = bzVar.v;
                pw pwVar = kzVar.A0;
                if (pwVar.indexOfChild(m8Var) != -1 && (T = pwVar.T(m8Var)) != null) {
                    if (T.b() == kzVar.f26418c1) {
                        if (kzVar.f26424e1 != null) {
                            ky kyVar = kzVar.f26460q1;
                            if (kyVar != null) {
                                kyVar.y(kzVar.G1.f19185id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(kzVar.Z0).edit();
                        String str2 = "group_hide_stickers_" + kzVar.G1.f19185id;
                        TLRPC.StickerSet stickerSet = kzVar.G1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f19211id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        kzVar.Z(false);
                        bz bzVar2 = kzVar.f26476v0;
                        if (bzVar2 != null) {
                            bzVar2.l();
                            return;
                        }
                        return;
                    } else if (bzVar.h.get(T.b()) == kzVar.f26431g1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.f23764c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new fv(bzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 18:
                FragmentContextView fragmentContextView = (FragmentContextView) obj2;
                float[] fArr = (float[]) obj;
                float[] fArr2 = FragmentContextView.J0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.S);
                int i15 = 0;
                while (true) {
                    if (i15 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i15]) {
                            i12 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                int i16 = i12 + 1;
                if (i16 >= 3) {
                    i16 = 0;
                }
                float f10 = fArr[i16];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.S, f10);
                fragmentContextView.l(playbackSpeed, f10, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.f23056y0 > 300) {
                    int i17 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i17 > 2) {
                        i17 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i17).apply();
                    if (i17 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.ej ejVar = new org.telegram.ui.ej(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.f23054x0 = ejVar;
                        ejVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.f23054x0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.f23054x0, marginLayoutParams);
                        fragmentContextView.f23054x0.f(fragmentContextView.C, true);
                    }
                }
                fragmentContextView.f23056y0 = currentTimeMillis;
                return;
            case 19:
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = c20Var.C.indexOf(v0Var.getFilter());
                if (c20Var.F != indexOf) {
                    c20Var.F = indexOf;
                    c20Var.f();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f20606a.f46893f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    tf.e0 filter = v0Var.getFilter();
                    c20Var.g(filter);
                    b20 b20Var = c20Var.E;
                    if (b20Var != null) {
                        ((org.telegram.ui.tx) b20Var).d(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                ((v2) obj).run(Long.valueOf(((h20) obj2).d));
                return;
            case 21:
                ((org.telegram.ui.zp) obj).run();
                ((y30) obj2).dismiss();
                return;
            case 22:
                ((o70) obj2).u();
                ((org.telegram.ui.hv0) obj).run();
                return;
            case 23:
                o70 o70Var2 = (o70) obj2;
                ((org.telegram.ui.pv) obj).run();
                if (o70Var2.J) {
                    o70Var2.u();
                    return;
                }
                return;
            case 24:
                y70.m((y70) obj2, (w70) obj);
                return;
            case 25:
                se0.m((se0) obj2, (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 26:
                li0 li0Var = (li0) obj2;
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) obj;
                if (li0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, li0Var.getValue());
                    org.telegram.ui.ad0 ad0Var = (org.telegram.ui.ad0) qsVar.f37835b;
                    TLRPC.User user = (TLRPC.User) qsVar.f37836c;
                    if (ad0Var.getLocationController().getSharingLocationInfo(ad0Var.f32524b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ad0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(ad0Var, user, max, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        ad0Var.showDialog(d2Var2);
                    } else {
                        ad0Var.O.I = true;
                        ad0Var.f32525c.setImageResource(R.drawable.msg_location_alert2);
                        ad0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        ad0Var.getLocationController().setProximityLocation(ad0Var.f32524b0, max, true);
                        z4 = true;
                    }
                    if (z4) {
                        li0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                qi0 qi0Var = (qi0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(qi0Var.f28137b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, qi0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                return;
            case 28:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) obj2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(268435456);
                ((Context) obj).startActivity(createChooser);
                return;
            default:
                lh.l7 l7Var = (lh.l7) obj2;
                l7Var.e = !l7Var.e;
                ((kh.o3) obj).run();
                l7Var.i(true);
                return;
        }
    }

    public w2(w8 w8Var, boolean[] zArr) {
        this.f30166a = 4;
        this.f30168c = w8Var;
        this.f30167b = zArr;
    }
}
