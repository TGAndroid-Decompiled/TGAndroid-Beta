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
import org.telegram.ui.rb1;
public final class w2 implements View.OnClickListener {
    public final int f30116a;
    public final Object f30117b;
    public final Object f30118c;

    public w2(int i10, Object obj, Object obj2) {
        this.f30116a = i10;
        this.f30117b = obj;
        this.f30118c = obj2;
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
        ds dsVar;
        f2.l1 T;
        long j10;
        int i11 = this.f30116a;
        int i12 = -1;
        f2.l1 l1Var = null;
        boolean z4 = false;
        Object obj = this.f30118c;
        Object obj2 = this.f30117b;
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
                ((p70) obj).u();
                c8Var.t0(7);
                return;
            case 3:
                u90 u90Var = (u90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                int h02 = c8.h0(c8Var2);
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(u90Var.getText().toString())) {
                    String charSequence = u90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.qy) {
                        org.telegram.ui.qy qyVar = (org.telegram.ui.qy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = qyVar.getMessagesController().getTotalDialogsCount();
                        if (!qyVar.f37565i2 && (totalDialogsCount > 10 || qyVar.H)) {
                            if (!qyVar.f37555g2) {
                                qyVar.f37637x = 3;
                                qyVar.U.f24117r.setText(charSequence);
                                qyVar.U.f24117r.setSelection(charSequence.length());
                            } else {
                                qyVar.U.f24117r.setText(charSequence);
                                qyVar.U.f24117r.setSelection(charSequence.length());
                                org.telegram.ui.zx zxVar = qyVar.f37647z0;
                                if (zxVar != null && (L = zxVar.L(3)) >= 0 && qyVar.f37647z0.getTabsView().getCurrentTabId() != L) {
                                    qyVar.f37647z0.getTabsView().d(L, L);
                                }
                            }
                            c8Var2.dismiss();
                            return;
                        }
                    }
                    org.telegram.ui.qy qyVar2 = new org.telegram.ui.qy(null);
                    qyVar2.f37575k2 = charSequence;
                    qyVar2.f37637x = 3;
                    launchActivity.q0(qyVar2, false, false);
                    c8Var2.dismiss();
                    return;
                }
                return;
            case 4:
                w8 w8Var = (w8) obj;
                ((boolean[]) obj2)[0] = true;
                w8Var.G.v1(w8Var.V);
                w8Var.P.dismiss();
                return;
            case 5:
                v9 v9Var = (v9) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        ze.d.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        ze.d.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(v9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = v9Var.f29414n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) v9Var.getContext(), v9Var.f29414n.document)) {
                            FileLoader.getInstance(v9Var.f29416s).loadFile(v9Var.f29414n.document, "update", 3, 1);
                            v9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        ze.d.s(v9Var.getContext(), v9Var.f29414n.url);
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
                p70 p70Var = bdVar.U0;
                if (p70Var != null && p70Var.D()) {
                    bdVar.U0.u();
                    bdVar.U0 = null;
                    return;
                }
                bdVar.f23631a1.e(true);
                p70 F = p70.F(frameLayout, new nh.b(), bdVar.S0);
                bdVar.U0 = F;
                F.f27777s = 0;
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
                    bdVar.U0.c(0, formatPluralString, new ah.b(bdVar, i13, 27), false);
                    if (bdVar.Y0 == i13) {
                        bdVar.U0.L();
                    }
                }
                bdVar.U0.Z();
                return;
            case 7:
                xk xkVar = (xk) obj2;
                zk zkVar = (zk) obj;
                al alVar = xkVar.f30655b;
                li liVar = alVar.f24282b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) liVar.f26685c0;
                if (znVar.c()) {
                    parentActivity = alVar.getParentActivity();
                    z4.M(parentActivity, znVar.a(), new o1(11, xkVar, zkVar), alVar.f24281a);
                    return;
                }
                z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new vk(0, xkVar, zkVar));
                return;
            case 8:
                pn pnVar = ((nn) obj2).d;
                rb1 rb1Var = pnVar.f27960s;
                View F2 = rb1Var.F((mn) obj);
                if (F2 != null) {
                    l1Var = rb1Var.T(F2);
                }
                if (l1Var != null && (b10 = l1Var.b() - pnVar.f27957q0) >= 0 && b10 < pnVar.H.length) {
                    pn.O(pnVar, b10);
                    return;
                }
                return;
            case 9:
                yn ynVar = (yn) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                org.telegram.ui.zn znVar2 = ynVar.D;
                if (ynVar.Q) {
                    znVar2.showDialog(z4.V(ynVar.getContext(), znVar2.h, f6Var).f19478a);
                    return;
                }
                un unVar = ynVar.e;
                if (znVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = znVar2.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (ynVar.f31055a.f46961f && znVar2.getParentActivity() != null && znVar2.fragmentView != null && znVar2.W7 != null) {
                            if (znVar2.f40651l2 == null) {
                                l40 l40Var = new l40(7, znVar2.getParentActivity(), znVar2.f40534ba, true);
                                znVar2.f40651l2 = l40Var;
                                l40Var.setAlpha(0.0f);
                                znVar2.f40651l2.setVisibility(4);
                                znVar2.f40651l2.setShowingDuration(4000L);
                                znVar2.U0.addView(znVar2.f40651l2, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                            }
                            int i14 = znVar2.W7.ttl_period;
                            if (i14 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i14 / 86400, new Object[0]);
                            } else if (i14 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i14 / 3600, new Object[0]);
                            } else if (i14 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i14 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i14, new Object[0]);
                            }
                            znVar2.f40651l2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            znVar2.f40651l2.f(znVar2.X0.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = znVar2.W7;
                    TLRPC.UserFull userFull = znVar2.X7;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    h8 h8Var = new h8(ynVar.getContext(), null, new vn(ynVar, r3), true, 0, ynVar.f31056a0);
                    h8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.f25333a;
                    wn wnVar = new wn(ynVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.p1[] p1VarArr = {wnVar};
                    wnVar.e = true;
                    wnVar.f20492c = 220;
                    wnVar.setOutsideTouchable(true);
                    p1VarArr[0].setClippingEnabled(true);
                    p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    p1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1VarArr[0].setInputMethodMode(2);
                    p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    p1VarArr[0].showAtLocation(unVar, 0, (int) (ynVar.getX() + unVar.getX()), (int) unVar.getY());
                    znVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 10:
                jp.n((jp) obj2, (org.telegram.ui.zn) obj);
                return;
            case 11:
                ir.P((ir) obj2, (TLRPC.Peer) obj);
                return;
            case 12:
                rr rrVar = (rr) obj2;
                String str = (String) obj;
                if (rrVar.f28569b == null && (view2 = rrVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        rrVar.f28569b = (EditText) findFocus;
                    }
                }
                if (rrVar.f28569b != null) {
                    try {
                        rrVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = rrVar.f28569b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = rrVar.f28569b.getText();
                    if (rrVar.f28569b.getSelectionEnd() == rrVar.f28569b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + rrVar.f28569b.getSelectionStart();
                    }
                    if (rrVar.f28569b.getSelectionStart() != -1 && rrVar.f28569b.getSelectionEnd() != -1) {
                        EditText editText2 = rrVar.f28569b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), rrVar.f28569b.getSelectionEnd(), str));
                        EditText editText3 = rrVar.f28569b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        rrVar.f28569b.setText(str);
                        EditText editText4 = rrVar.f28569b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = rrVar.f28569b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ds dsVar2 = (ds) obj2;
                cs csVar = (cs) obj;
                dsVar2.I();
                csVar.f24021f = !csVar.f24021f;
                csVar.f24024j.U.N(true);
                dsVar2.s();
                return;
            case 14:
                ((ds) obj2).f24371y0 = !dsVar.f24371y0;
                ((w51) obj).N(true);
                return;
            case 15:
                ((at) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.d7());
                return;
            case 16:
                lv.o((lv) obj2, (u5) obj);
                return;
            case 17:
                bz bzVar = (bz) obj2;
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) obj;
                kz kzVar = bzVar.v;
                pw pwVar = kzVar.A0;
                if (pwVar.indexOfChild(l8Var) != -1 && (T = pwVar.T(l8Var)) != null) {
                    if (T.b() == kzVar.f26430c1) {
                        if (kzVar.f26436e1 != null) {
                            ky kyVar = kzVar.f26472q1;
                            if (kyVar != null) {
                                kyVar.y(kzVar.G1.f19160id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(kzVar.Z0).edit();
                        String str2 = "group_hide_stickers_" + kzVar.G1.f19160id;
                        TLRPC.StickerSet stickerSet = kzVar.G1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f19186id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        kzVar.Z(false);
                        bz bzVar2 = kzVar.f26488v0;
                        if (bzVar2 != null) {
                            bzVar2.l();
                            return;
                        }
                        return;
                    } else if (bzVar.h.get(T.b()) == kzVar.f26443g1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.f23771c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new ev(bzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
                if (currentTimeMillis - fragmentContextView.f23029y0 > 300) {
                    int i17 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i17 > 2) {
                        i17 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i17).apply();
                    if (i17 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.gj gjVar = new org.telegram.ui.gj(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.f23027x0 = gjVar;
                        gjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.f23027x0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.f23027x0, marginLayoutParams);
                        fragmentContextView.f23027x0.f(fragmentContextView.C, true);
                    }
                }
                fragmentContextView.f23029y0 = currentTimeMillis;
                return;
            case 19:
                d20 d20Var = (d20) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = d20Var.C.indexOf(v0Var.getFilter());
                if (d20Var.F != indexOf) {
                    d20Var.F = indexOf;
                    d20Var.f();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f20581a.f46961f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    tf.e0 filter = v0Var.getFilter();
                    d20Var.g(filter);
                    c20 c20Var = d20Var.E;
                    if (c20Var != null) {
                        ((org.telegram.ui.vx) c20Var).d(filter);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 20:
                ((v2) obj).run(Long.valueOf(((i20) obj2).d));
                return;
            case 21:
                ((org.telegram.ui.bq) obj).run();
                ((z30) obj2).dismiss();
                return;
            case 22:
                ((p70) obj2).u();
                ((org.telegram.ui.ov0) obj).run();
                return;
            case 23:
                p70 p70Var2 = (p70) obj2;
                ((org.telegram.ui.rv) obj).run();
                if (p70Var2.J) {
                    p70Var2.u();
                    return;
                }
                return;
            case 24:
                z70.m((z70) obj2, (x70) obj);
                return;
            case 25:
                te0.m((te0) obj2, (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 26:
                mi0 mi0Var = (mi0) obj2;
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) obj;
                if (mi0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, mi0Var.getValue());
                    org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) ssVar.f38303b;
                    TLRPC.User user = (TLRPC.User) ssVar.f38304c;
                    if (cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f33086b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cd0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(cd0Var, user, max, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        cd0Var.showDialog(d2Var2);
                    } else {
                        cd0Var.O.I = true;
                        cd0Var.f33087c.setImageResource(R.drawable.msg_location_alert2);
                        cd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        cd0Var.getLocationController().setProximityLocation(cd0Var.f33086b0, max, true);
                        z4 = true;
                    }
                    if (z4) {
                        mi0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ri0 ri0Var = (ri0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ri0Var.f28475b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ri0Var.getTitleView().getText()), 500);
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
                ((kh.n3) obj).run();
                l7Var.i(true);
                return;
        }
    }

    public w2(w8 w8Var, boolean[] zArr) {
        this.f30116a = 4;
        this.f30118c = w8Var;
        this.f30117b = zArr;
    }
}
