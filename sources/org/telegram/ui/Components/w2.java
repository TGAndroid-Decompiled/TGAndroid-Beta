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
import org.telegram.ui.qb1;
public final class w2 implements View.OnClickListener {
    public final int f32612a;
    public final Object f32613b;
    public final Object f32614c;

    public w2(int i10, Object obj, Object obj2) {
        this.f32612a = i10;
        this.f32613b = obj;
        this.f32614c = obj2;
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
        gs gsVar;
        f2.m1 T;
        long j10;
        int i11 = this.f32612a;
        int i12 = -1;
        f2.m1 m1Var = null;
        boolean z4 = false;
        Object obj = this.f32614c;
        Object obj2 = this.f32613b;
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
                ((q70) obj).u();
                c8Var.t0(7);
                return;
            case 3:
                v90 v90Var = (v90) obj;
                c8 c8Var2 = ((t7) obj2).C;
                int h02 = c8.h0(c8Var2);
                LaunchActivity launchActivity = c8Var2.D0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(v90Var.getText().toString())) {
                    String charSequence = v90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof org.telegram.ui.py) {
                        org.telegram.ui.py pyVar = (org.telegram.ui.py) launchActivity.O().getLastFragment();
                        int totalDialogsCount = pyVar.getMessagesController().getTotalDialogsCount();
                        if (!pyVar.f40194i2 && (totalDialogsCount > 10 || pyVar.H)) {
                            if (!pyVar.f40184g2) {
                                pyVar.f40266x = 3;
                                pyVar.U.f26132r.setText(charSequence);
                                pyVar.U.f26132r.setSelection(charSequence.length());
                            } else {
                                pyVar.U.f26132r.setText(charSequence);
                                pyVar.U.f26132r.setSelection(charSequence.length());
                                org.telegram.ui.yx yxVar = pyVar.f40276z0;
                                if (yxVar != null && (L = yxVar.L(3)) >= 0 && pyVar.f40276z0.getTabsView().getCurrentTabId() != L) {
                                    pyVar.f40276z0.getTabsView().d(L, L);
                                }
                            }
                            c8Var2.dismiss();
                            return;
                        }
                    }
                    org.telegram.ui.py pyVar2 = new org.telegram.ui.py(null);
                    pyVar2.f40204k2 = charSequence;
                    pyVar2.f40266x = 3;
                    launchActivity.q0(pyVar2, false, false);
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
                        af.g.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        af.g.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(v9Var.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = v9Var.f31837n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) v9Var.getContext(), v9Var.f31837n.document)) {
                            FileLoader.getInstance(v9Var.f31839s).loadFile(v9Var.f31837n.document, "update", 3, 1);
                            v9Var.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        af.g.s(v9Var.getContext(), v9Var.f31837n.url);
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
                q70 q70Var = bdVar.U0;
                if (q70Var != null && q70Var.D()) {
                    bdVar.U0.u();
                    bdVar.U0 = null;
                    return;
                }
                bdVar.f25578a1.e(true);
                q70 F = q70.F(frameLayout, new oh.b(), bdVar.S0);
                bdVar.U0 = F;
                F.f30333s = 0;
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
                zk zkVar = (zk) obj2;
                bl blVar = (bl) obj;
                cl clVar = zkVar.f33961b;
                mi miVar = clVar.f26590b;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) miVar.f29058c0;
                if (xnVar.c()) {
                    parentActivity = clVar.getParentActivity();
                    z4.M(parentActivity, xnVar.a(), new o1(11, zkVar, blVar), clVar.f26589a);
                    return;
                }
                z4.a0(miVar.G1, miVar.j1() + 1, miVar.n1(), new xk(0, zkVar, blVar));
                return;
            case 8:
                rn rnVar = ((pn) obj2).d;
                qb1 qb1Var = rnVar.f30842s;
                View F2 = qb1Var.F((on) obj);
                if (F2 != null) {
                    m1Var = qb1Var.T(F2);
                }
                if (m1Var != null && (b10 = m1Var.b() - rnVar.f30839q0) >= 0 && b10 < rnVar.H.length) {
                    rn.O(rnVar, b10);
                    return;
                }
                return;
            case 9:
                ao aoVar = (ao) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                org.telegram.ui.xn xnVar2 = aoVar.D;
                if (aoVar.Q) {
                    xnVar2.showDialog(z4.V(aoVar.getContext(), xnVar2.h, g6Var).f21168a);
                    return;
                }
                wn wnVar = aoVar.f25309e;
                if (xnVar2.getParentActivity() != null) {
                    TLRPC.Chat chat = xnVar2.f43143e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (aoVar.f25302a.f50542f && xnVar2.getParentActivity() != null && xnVar2.fragmentView != null && xnVar2.W7 != null) {
                            if (xnVar2.f43232l2 == null) {
                                m40 m40Var = new m40(7, xnVar2.getParentActivity(), xnVar2.f43114ba, true);
                                xnVar2.f43232l2 = m40Var;
                                m40Var.setAlpha(0.0f);
                                xnVar2.f43232l2.setVisibility(4);
                                xnVar2.f43232l2.setShowingDuration(4000L);
                                xnVar2.U0.addView(xnVar2.f43232l2, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                            xnVar2.f43232l2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            xnVar2.f43232l2.f(xnVar2.X0.getTimeItem(), true);
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
                    h8 h8Var = new h8(aoVar.getContext(), null, new xn(aoVar, r3), true, 0, aoVar.f25303a0);
                    h8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h8Var.f27407a;
                    yn ynVar = new yn(aoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.p1[] p1VarArr = {ynVar};
                    ynVar.f22220e = true;
                    ynVar.f22219c = 220;
                    ynVar.setOutsideTouchable(true);
                    p1VarArr[0].setClippingEnabled(true);
                    p1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    p1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    p1VarArr[0].setInputMethodMode(2);
                    p1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    p1VarArr[0].showAtLocation(wnVar, 0, (int) (aoVar.getX() + wnVar.getX()), (int) wnVar.getY());
                    xnVar2.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 10:
                mp.n((mp) obj2, (org.telegram.ui.xn) obj);
                return;
            case 11:
                lr.P((lr) obj2, (TLRPC.Peer) obj);
                return;
            case 12:
                ur urVar = (ur) obj2;
                String str = (String) obj;
                if (urVar.f31676b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f31676b = (EditText) findFocus;
                    }
                }
                if (urVar.f31676b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.f31676b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.f31676b.getText();
                    if (urVar.f31676b.getSelectionEnd() == urVar.f31676b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + urVar.f31676b.getSelectionStart();
                    }
                    if (urVar.f31676b.getSelectionStart() != -1 && urVar.f31676b.getSelectionEnd() != -1) {
                        EditText editText2 = urVar.f31676b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), urVar.f31676b.getSelectionEnd(), str));
                        EditText editText3 = urVar.f31676b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        urVar.f31676b.setText(str);
                        EditText editText4 = urVar.f31676b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = urVar.f31676b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                gs gsVar2 = (gs) obj2;
                fs fsVar = (fs) obj;
                gsVar2.I();
                fsVar.f26991f = !fsVar.f26991f;
                fsVar.f26994j.U.N(true);
                gsVar2.s();
                return;
            case 14:
                ((gs) obj2).f27265y0 = !gsVar.f27265y0;
                ((w51) obj).N(true);
                return;
            case 15:
                ((dt) obj2).dismiss();
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new org.telegram.ui.b7());
                return;
            case 16:
                ov.o((ov) obj2, (u5) obj);
                return;
            case 17:
                dz dzVar = (dz) obj2;
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) obj;
                mz mzVar = dzVar.v;
                rw rwVar = mzVar.A0;
                if (rwVar.indexOfChild(m8Var) != -1 && (T = rwVar.T(m8Var)) != null) {
                    if (T.b() == mzVar.f29274c1) {
                        if (mzVar.f29281e1 != null) {
                            my myVar = mzVar.f29317q1;
                            if (myVar != null) {
                                myVar.y(mzVar.G1.f20846id);
                                return;
                            }
                            return;
                        }
                        SharedPreferences.Editor edit = MessagesController.getEmojiSettings(mzVar.Z0).edit();
                        String str2 = "group_hide_stickers_" + mzVar.G1.f20846id;
                        TLRPC.StickerSet stickerSet = mzVar.G1.stickerset;
                        if (stickerSet != null) {
                            j10 = stickerSet.f20872id;
                        } else {
                            j10 = 0;
                        }
                        edit.putLong(str2, j10).apply();
                        mzVar.Z(false);
                        dz dzVar2 = mzVar.f29333v0;
                        if (dzVar2 != null) {
                            dzVar2.l();
                            return;
                        }
                        return;
                    } else if (dzVar.h.get(T.b()) == mzVar.f29288g1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dzVar.f26375c);
                        String string = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new hv(dzVar, 2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        d2Var.show();
                        TextView textView = (TextView) d2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
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
                if (currentTimeMillis - fragmentContextView.f24907y0 > 300) {
                    int i17 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i17 > 2) {
                        i17 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i17).apply();
                    if (i17 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.ej ejVar = new org.telegram.ui.ej(6, 2, fragmentContextView.getContext(), null, true);
                        fragmentContextView.f24905x0 = ejVar;
                        ejVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.f24905x0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.f24905x0, marginLayoutParams);
                        fragmentContextView.f24905x0.f(fragmentContextView.C, true);
                    }
                }
                fragmentContextView.f24907y0 = currentTimeMillis;
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
                    if (!v0Var.f22320a.f50542f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    uf.e0 filter = v0Var.getFilter();
                    d20Var.g(filter);
                    c20 c20Var = d20Var.E;
                    if (c20Var != null) {
                        ((org.telegram.ui.ux) c20Var).d(filter);
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
                ((org.telegram.ui.aq) obj).run();
                ((a40) obj2).dismiss();
                return;
            case 22:
                ((q70) obj2).u();
                ((org.telegram.ui.ov0) obj).run();
                return;
            case 23:
                q70 q70Var2 = (q70) obj2;
                ((org.telegram.ui.qv) obj).run();
                if (q70Var2.J) {
                    q70Var2.u();
                    return;
                }
                return;
            case 24:
                a80.m((a80) obj2, (y70) obj);
                return;
            case 25:
                ue0.m((ue0) obj2, (org.telegram.ui.ActionBar.g6) obj);
                return;
            case 26:
                ni0 ni0Var = (ni0) obj2;
                org.telegram.ui.rs rsVar = (org.telegram.ui.rs) obj;
                if (ni0Var.G.getTag() == null) {
                    int max = (int) Math.max(1.0f, ni0Var.getValue());
                    org.telegram.ui.bd0 bd0Var = (org.telegram.ui.bd0) rsVar.f40932b;
                    TLRPC.User user = (TLRPC.User) rsVar.f40933c;
                    if (bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35471b0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bd0Var.getParentActivity());
                        String string2 = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new e3.d(bd0Var, user, max, 10));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        bd0Var.showDialog(d2Var2);
                    } else {
                        bd0Var.O.I = true;
                        bd0Var.f35472c.setImageResource(R.drawable.msg_location_alert2);
                        bd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        bd0Var.getLocationController().setProximityLocation(bd0Var.f35471b0, max, true);
                        z4 = true;
                    }
                    if (z4) {
                        ni0Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                si0 si0Var = (si0) obj2;
                Context context = (Context) obj;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(si0Var.f31063b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, si0Var.getTitleView().getText()), 500);
                        return;
                    } catch (ActivityNotFoundException e6) {
                        e6.printStackTrace();
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
                mh.l7 l7Var = (mh.l7) obj2;
                l7Var.f14401e = !l7Var.f14401e;
                ((lh.o3) obj).run();
                l7Var.i(true);
                return;
        }
    }

    public w2(w8 w8Var, boolean[] zArr) {
        this.f32612a = 4;
        this.f32614c = w8Var;
        this.f32613b = zArr;
    }
}
