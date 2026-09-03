package org.telegram.ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class hb0 implements View.OnClickListener {
    public final int f37317a;
    public final Object f37318b;
    public final Object f37319c;

    public hb0(int i10, Object obj, Object obj2) {
        this.f37317a = i10;
        this.f37318b = obj;
        this.f37319c = obj2;
    }

    private final void a(View view) {
        od1 od1Var = (od1) this.f37318b;
        Context context = (Context) this.f37319c;
        if (od1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(od1Var.getParentActivity(), null);
        c3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false), 1, 20.0f);
        linearLayout.addView(textView, k7.c6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        c3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.k6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) org.telegram.ui.ActionBar.k6.F.get(i10);
            TLRPC.TL_theme tL_theme = j6Var.C;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(j6Var);
            }
        }
        pb1 pb1Var = new pb1(context, od1Var, arrayList, new ArrayList(), c3Var);
        linearLayout.addView(pb1Var, k7.c6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        pb1Var.w1(od1Var.fragmentView.getMeasuredWidth());
        od1Var.showDialog(c3Var.f21209a);
    }

    private final void b(View view) {
        long j10;
        ii1 ii1Var = (ii1) this.f37318b;
        Context context = (Context) this.f37319c;
        hg.v2 v2Var = ii1Var.J;
        if (v2Var != null) {
            v2Var.dismiss();
            ii1Var.J = null;
        }
        hg.v2 v2Var2 = new hg.v2(context, ii1Var.f37670a, null, 4, new oh.h0());
        TLRPC.User user = ii1Var.f37676c;
        long j11 = 0;
        if (user != null) {
            j10 = user.f20992id;
        } else {
            j10 = 0;
        }
        TLRPC.User user2 = ii1Var.d;
        if (user2 != null) {
            j11 = user2.f20992id;
        }
        long[] jArr = {j10, j11};
        for (int i10 = 0; i10 < 2; i10++) {
            v2Var2.f7656z0.add(Long.valueOf(jArr[i10]));
        }
        v2Var2.h0(false, true);
        v2Var2.A0 = new org.telegram.ui.Components.as(1);
        ii1Var.J = v2Var2;
        v2Var2.show();
    }

    private final void c(View view) {
        org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f37318b;
        kVar.f42567b = true;
        ((z) this.f37319c).run();
        kVar.f42574w.V2.N(true);
    }

    private final void d(View view) {
        qh.z2 z2Var = (qh.z2) this.f37318b;
        z2Var.e((MediaController.AlbumEntry) this.f37319c, false);
        z2Var.C.n();
    }

    @Override
    public final void onClick(View view) {
        int i10;
        char c3;
        char c10;
        String formatString;
        int i11;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String str;
        boolean[] zArr;
        int i19;
        c5.j jVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = null;
        CharSequence charSequence = null;
        org.telegram.ui.ActionBar.c3 c3Var = null;
        boolean z4 = false;
        switch (this.f37317a) {
            case 0:
                ob0 ob0Var = (ob0) this.f37318b;
                Runnable[] runnableArr = (Runnable[]) this.f37319c;
                if (ob0Var.f39642e == null) {
                    lb0 lb0Var = ob0Var.f39643f;
                    if (lb0Var.f23755e.h) {
                        int i20 = -ob0Var.K;
                        ob0Var.K = i20;
                        AndroidUtilities.shakeViewSpring(lb0Var, i20);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    Switch r42 = s8Var.f23755e;
                    s8Var.setChecked(!r42.h);
                    mb0 mb0Var = ob0Var.f39645r;
                    if (r42.h) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    mb0Var.setVisibility(i10);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        ob0Var.f39643f.setChecked(false);
                        ob0Var.f39643f.setCheckBoxIcon(R.drawable.permission_locked);
                        ob0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        cb0 cb0Var = new cb0(ob0Var, 0);
                        runnableArr[0] = cb0Var;
                        AndroidUtilities.runOnUIThread(cb0Var, 60L);
                        return;
                    }
                    ob0Var.f39643f.setCheckBoxIcon(0);
                    ob0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    cb0 cb0Var2 = new cb0(ob0Var, 1);
                    runnableArr[0] = cb0Var2;
                    AndroidUtilities.runOnUIThread(cb0Var2);
                    return;
                }
                return;
            case 1:
                bd0 bd0Var = (bd0) this.f37318b;
                bd0Var.r0((vc0) this.f37319c);
                tc0 tc0Var = bd0Var.F0;
                if (tc0Var != null) {
                    tc0Var.dismiss();
                    return;
                }
                return;
            case 2:
                bd0 bd0Var2 = ((yc0) this.f37318b).f43597b;
                bd0Var2.getClass();
                bd0Var2.C0.d(((ad0) this.f37319c).f35145c, bd0Var2.D0, true, 0, 0L);
                bd0Var2.finishFragment();
                return;
            case 3:
                zd0 zd0Var = (zd0) this.f37318b;
                Context context = (Context) this.f37319c;
                String string = zd0Var.f43922y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f30949a |= 256;
                    obj.f30950b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f30951c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = zd0Var.D;
                int i23 = i22 / 86400;
                int i24 = i22 % 86400;
                int i25 = i24 / 3600;
                int i26 = (i24 % 3600) / 60;
                if (i23 == 0 && i25 == 0) {
                    i26 = Math.max(1, i26);
                }
                if (i23 != 0 && i25 != 0) {
                    c3 = 0;
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i23, new Object[0]), LocaleController.formatPluralString("Hours", i25, new Object[0]));
                    c10 = 1;
                } else {
                    c3 = 0;
                    if (i25 != 0 && i26 != 0) {
                        c10 = 1;
                        formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i25, new Object[0]), LocaleController.formatPluralString("Minutes", i26, new Object[0]));
                    } else {
                        c10 = 1;
                        if (i23 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i23, new Object[0]));
                        } else if (i25 != 0) {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i23, new Object[0]));
                        } else {
                            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i26, new Object[0]));
                        }
                    }
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[c3] = spannableStringBuilder;
                charSequenceArr[c10] = formatString;
                alertDialog$Builder.f21168a.Q = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new gu(zd0Var, 17));
                l.d.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 4:
                he0 he0Var = (he0) this.f37318b;
                Context context2 = (Context) this.f37319c;
                og0 og0Var = he0Var.f37353y;
                if (og0Var.S.getTag() == null) {
                    if (he0Var.f37348n.has_recovery) {
                        og0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i11 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_auth_requestPasswordRecovery, new fe0(he0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(he0Var.f37343a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f21168a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f21168a.Q = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new gu(he0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 5:
                sf0 sf0Var = (sf0) this.f37318b;
                Context context3 = (Context) this.f37319c;
                Bundle bundle = sf0Var.f41177l0;
                if (bundle != null && (tL_auth_sentCode = sf0Var.m0) != null) {
                    sf0Var.f41181p0.g1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!sf0Var.f41162a0) {
                    qf0 qf0Var = sf0Var.v;
                    if ((qf0Var == null || qf0Var.getVisibility() == 8) && !sf0Var.f41171f0) {
                        if (sf0Var.f41167d0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = sf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = sf0Var.f41165c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            sf0Var.f41181p0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f21168a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, sf0Var.f41163b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new rs(27, sf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new hf0(sf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (sf0Var.f41181p0.S.getTag() == null) {
                            sf0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                ng0 ng0Var = (ng0) this.f37318b;
                Context context4 = (Context) this.f37319c;
                Toast toast = ng0Var.L;
                if (toast != null) {
                    toast.cancel();
                    ng0Var.L = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ng0Var.J > 0 && currentTimeMillis - ng0Var.K > 1500) {
                    i12 = 0;
                    ng0Var.J = 0;
                } else {
                    i12 = 0;
                }
                int i27 = ng0Var.J + 1;
                ng0Var.J = i27;
                ng0Var.K = currentTimeMillis;
                if (i27 >= 5) {
                    ng0Var.J = i12;
                    ng0Var.K = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ng0Var.getContext());
                    alertDialog$Builder4.f21168a.O = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new rv(ng0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i27 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i27, new Object[0]), 0);
                    ng0Var.L = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 7:
                MessageObject messageObject = (MessageObject) this.f37319c;
                bj0 bj0Var = ((zi0) this.f37318b).d;
                if (!bj0Var.a0(messageObject)) {
                    bj0Var.getOrCreateStoryViewer().G(bj0Var.getParentActivity(), messageObject.storyItem, oh.c7.a(bj0Var.f35550f));
                    return;
                }
                return;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37318b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f37319c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i14 = 144;
                } else {
                    i14 = 128;
                }
                editTextBoldCursor.setInputType(i14 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f34213s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.k6.f21805l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.k6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
                return;
            case 9:
                lo0.h0((lo0) this.f37318b, (String) this.f37319c, view);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.f37318b;
                org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) this.f37319c;
                if (photoViewer.Q4 != null) {
                    q70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.f34307j4;
                    if (p2Var instanceof xn) {
                        ((xn) p2Var).J9(photoViewer.Q4, false, true);
                    }
                    af.g.r(photoViewer.B, Uri.parse(photoViewer.Q4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.Q).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37318b;
                Activity activity = (Activity) this.f37319c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!photoViewer2.H1() && !photoViewer2.f34374r) {
                    int i28 = photoViewer2.M4;
                    if (i28 >= 0 && i28 < photoViewer2.f34255d7.size()) {
                        Object obj2 = photoViewer2.f34255d7.get(photoViewer2.M4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f34277g1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                qh.e3 e3Var = photoViewer2.f34286h1;
                                if (e3Var != null) {
                                    e3Var.e(true);
                                    photoViewer2.f34286h1 = null;
                                }
                                if (photoViewer2.B != null) {
                                    photoViewer2.f34286h1 = new qh.e3(photoViewer2.B, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i16 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i16 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i16));
                                    if (isHighQuality) {
                                        i17 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i17 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.oq(i17, 0), 0, 1, 33);
                                    photoViewer2.f34286h1.s(append);
                                    photoViewer2.f34230b0.addView(photoViewer2.f34286h1, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f34286h1.setTranslationY(photoViewer2.M0.getTranslationY());
                                    photoViewer2.f34286h1.m(0.0f, (photoViewer2.f34277g1.getWidth() / 2.0f) + photoViewer2.f34277g1.getX() + photoViewer2.E0.getX());
                                    qh.e3 e3Var2 = photoViewer2.f34286h1;
                                    e3Var2.f45272i0 = new bh(2, e3Var2);
                                    e3Var2.d = 3500L;
                                    e3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f34277g1.getTag() == null) {
                        if (photoViewer2.f34284g8) {
                            if (photoViewer2.f34304j1 == null) {
                                iu0 iu0Var = photoViewer2.f34230b0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.nq0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                iu0Var.addView((View) textView, k7.c6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f34304j1 = textView;
                            }
                            photoViewer2.f34304j1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.a21 a21Var = photoViewer2.f34304j1;
                            org.telegram.ui.Components.v61 v61Var = photoViewer2.f34277g1;
                            org.telegram.ui.Components.nq0 nq0Var = a21Var.d;
                            if (v61Var != null) {
                                a21Var.f25140a = v61Var;
                                a21Var.a();
                                a21Var.f25142c = true;
                                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                                AndroidUtilities.runOnUIThread(nq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = a21Var.f25141b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    a21Var.f25141b.cancel();
                                    a21Var.f25141b = null;
                                }
                                if (a21Var.getVisibility() != 0) {
                                    a21Var.setAlpha(0.0f);
                                    a21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = a21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    a21Var.f25141b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.Y2(true);
                    photoViewer2.p2(1);
                    return;
                }
                return;
            case 12:
                ((org.telegram.ui.Components.q70) this.f37318b).K((org.telegram.ui.Components.q70) this.f37319c);
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37318b;
                ((AlertDialog$Builder) this.f37319c).f21168a.I0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i18 = 30;
                } else if (num.intValue() == 1) {
                    i18 = 90;
                } else if (num.intValue() == 2) {
                    i18 = 182;
                } else if (num.intValue() == 3) {
                    i18 = 365;
                } else if (num.intValue() == 4) {
                    i18 = 548;
                } else if (num.intValue() == 5) {
                    i18 = 730;
                } else {
                    i18 = 0;
                }
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(privacySettingsActivity.getParentActivity(), 3, null);
                d2Var.f21243d0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new yr0(privacySettingsActivity, d2Var, setaccountttl, 2));
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.f37318b;
                profileActivity.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37319c).url);
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f37318b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f37319c;
                long j10 = profileActivity2.f34569b1;
                long j11 = profileActivity2.B1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.D2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                kq kqVar = new kq(j10, j11, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                kqVar.U0 = new bz0(profileActivity2, chat, kqVar);
                profileActivity2.presentFragment(kqVar);
                return;
            case 16:
                d21 d21Var = (d21) this.f37318b;
                Context context5 = (Context) this.f37319c;
                StringBuilder sb = new StringBuilder();
                String obj3 = d21Var.f35946a[0].getText().toString();
                String obj4 = d21Var.f35946a[3].getText().toString();
                String obj5 = d21Var.f35946a[2].getText().toString();
                String obj6 = d21Var.f35946a[1].getText().toString();
                String obj7 = d21Var.f35946a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj3)) {
                        sb.append("server=");
                        sb.append(URLEncoder.encode(obj3, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj6)) {
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("port=");
                        sb.append(URLEncoder.encode(obj6, "UTF-8"));
                    }
                    if (d21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb.length() != 0) {
                            sb.append("&");
                        }
                        sb.append("secret=");
                        sb.append(URLEncoder.encode(obj7, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj5)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("user=");
                            sb.append(URLEncoder.encode(obj5, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb.length() != 0) {
                                sb.append("&");
                            }
                            sb.append("pass=");
                            sb.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                    }
                    if (sb.length() != 0) {
                        StringBuilder l10 = e2.c.l(str);
                        l10.append(sb.toString());
                        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(context5, LocaleController.getString(R.string.ShareQrCode), l10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        si0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        d21Var.showDialog(si0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                l51 l51Var = (l51) this.f37318b;
                Context context6 = (Context) this.f37319c;
                if (l51Var.f41037w == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    vl0 vl0Var = new vl0(16, l51Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                    if (context6 == null) {
                        zArr = zArr2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21768j5, false);
                        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21733h5, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ji, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Ni, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G8, false);
                        org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false);
                        int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Qh, false);
                        org.telegram.ui.ActionBar.c3 c3Var2 = new org.telegram.ui.ActionBar.c3(context6, null);
                        c3Var2.a();
                        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(context6, null);
                        yc0Var.setTextColor(w02);
                        yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        yc0Var.setItemCount(5);
                        org.telegram.ui.Components.yc0 yc0Var2 = new org.telegram.ui.Components.yc0(context6, null);
                        yc0Var2.setItemCount(5);
                        yc0Var2.setTextColor(w02);
                        yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.yc0 yc0Var3 = new org.telegram.ui.Components.yc0(context6, null);
                        yc0Var3.setItemCount(5);
                        yc0Var3.setTextColor(w02);
                        yc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context6, yc0Var, yc0Var2, yc0Var3, 3);
                        s3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        s3Var.addView(frameLayout, k7.c6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, k7.c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new org.telegram.ui.ActionBar.s2(9));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        s3Var.addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        hg.q qVar = new hg.q(context6, 16);
                        linearLayout.addView(yc0Var, k7.c6.l(0.5f, 0, 270));
                        yc0Var.setMinValue(0);
                        yc0Var.setMaxValue(365);
                        yc0Var.setWrapSelectorWheel(false);
                        yc0Var.setFormatter(new as(10));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(yc0Var, yc0Var2, yc0Var3, 12);
                        yc0Var.setOnValueChangedListener(aVar);
                        yc0Var2.setMinValue(0);
                        yc0Var2.setMaxValue(23);
                        linearLayout.addView(yc0Var2, k7.c6.l(0.2f, 0, 270));
                        yc0Var2.setFormatter(new as(11));
                        yc0Var2.setOnValueChangedListener(aVar);
                        yc0Var3.setMinValue(0);
                        yc0Var3.setMaxValue(59);
                        yc0Var3.setValue(0);
                        yc0Var3.setFormatter(new as(12));
                        linearLayout.addView(yc0Var3, k7.c6.l(0.3f, 0, 270));
                        yc0Var3.setOnValueChangedListener(aVar);
                        if (currentTimeMillis2 > 0 && currentTimeMillis2 != 2147483646) {
                            long j12 = currentTimeMillis2 * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            zArr = zArr2;
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                yc0Var3.setValue(calendar.get(12));
                                yc0Var2.setValue(calendar.get(11));
                                yc0Var.setValue(timeInMillis);
                            }
                        } else {
                            zArr = zArr2;
                        }
                        org.telegram.ui.Components.z4.g(null, null, 0L, 0L, 0, yc0Var, yc0Var2, yc0Var3);
                        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        qVar.setGravity(17);
                        qVar.setTextColor(w04);
                        qVar.setTextSize(1, 14.0f);
                        qVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, w05, w06, w06));
                        qVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        s3Var.addView(qVar, k7.c6.t(-1, 48, 83, 16, 15, 16, 16));
                        c3Var = c3Var2;
                        qVar.setOnClickListener(new hg.e(yc0Var, yc0Var2, yc0Var3, calendar, (Object) vl0Var, c3Var2, 2));
                        c3Var.b(s3Var);
                        org.telegram.ui.ActionBar.h3 h3Var = c3Var.f21209a;
                        h3Var.show();
                        h3Var.setBackgroundColor(w03);
                        h3Var.fixNavigationBar(w03);
                    }
                    c3Var.f21209a.setOnHideListener(new hg.g(10, l51Var, zArr));
                    org.telegram.ui.ActionBar.h3 h3Var2 = c3Var.f21209a;
                    h3Var2.show();
                    l51Var.f41037w = h3Var2;
                    l51Var.c(false);
                    return;
                }
                return;
            case 18:
                k71 k71Var = (k71) this.f37318b;
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) this.f37319c;
                if (k71Var.W.g() != 0) {
                    mcVar.run(new ArrayList(k71Var.X.values()));
                    k71Var.dismiss();
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f37318b;
                ((AlertDialog$Builder) this.f37319c).f21168a.I0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i19 = 7;
                } else if (num2.intValue() == 1) {
                    i19 = 90;
                } else if (num2.intValue() == 2) {
                    i19 = 183;
                } else if (num2.intValue() == 3) {
                    i19 = 365;
                } else {
                    i19 = 0;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i19;
                sessionsActivity.v = i19;
                h81 h81Var = sessionsActivity.f34817a;
                if (h81Var != null) {
                    h81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new oh.p5(4));
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f37318b;
                editTextBoldCursor2.setText(mh.ja.M0(((Long) this.f37319c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 21:
                na1 na1Var = ((s91) this.f37318b).f41070a0;
                na1Var.getOrCreateStoryViewer().C(na1Var.getParentActivity(), ((ka1) this.f37319c).b(), na1Var.f39278w0, oh.c7.a(na1Var.P));
                return;
            case 22:
                w91 w91Var = (w91) this.f37318b;
                yf.f fVar = (yf.f) this.f37319c;
                int i29 = w91Var.f42391c;
                x91 x91Var = w91Var.d;
                org.telegram.ui.Components.t00 t00Var = w91Var.f42389a;
                if (t00Var.f31228c) {
                    ArrayList arrayList = x91Var.f42970n;
                    wf.g gVar = x91Var.f42967c;
                    int size = arrayList.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 < size) {
                            if (i30 == i29 || !((w91) arrayList.get(i30)).f42389a.f31228c || !((w91) arrayList.get(i30)).f42389a.f31227b) {
                                i30++;
                            }
                        } else {
                            z4 = true;
                        }
                    }
                    x91Var.f();
                    if (z4) {
                        AndroidUtilities.shakeView(t00Var);
                        return;
                    }
                    t00Var.setChecked(!t00Var.f31227b);
                    fVar.f50969n = t00Var.f31227b;
                    x91Var.f42966b.z();
                    if (x91Var.f42971r.f43861c > 0 && i29 < gVar.d.size()) {
                        ((yf.f) gVar.d.get(i29)).f50969n = t00Var.f31227b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                py pyVar = (py) this.f37319c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(pyVar.getParentActivity());
                alertDialog$Builder5.f21168a.O = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f21168a.Q = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new vl0(18, (va1) this.f37318b, pyVar));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder5.f21168a;
                pyVar.showDialog(d2Var2);
                TextView textView3 = (TextView) d2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
                    return;
                }
                return;
            case 24:
                a(view);
                return;
            case 25:
                b(view);
                return;
            case 26:
                qh.d dVar = (qh.d) this.f37318b;
                int[] iArr = (int[]) this.f37319c;
                if (!dVar.K && (jVar = aj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] k10 = jVar.k();
                        com.google.android.gms.common.api.internal.t0 t0Var = new a8.e(applicationContext, com.google.android.gms.common.api.i.f2658c).h;
                        m8.i0 i0Var = new m8.i0(t0Var, (String) jVar.f2317c, "/tg-wear-auth/answer", k10);
                        t0Var.f2816b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.f13541a).addOnSuccessListener(new d7(jVar, dVar, iArr, 24)).addOnFailureListener(new zi1(dVar, 0));
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        dVar.setLoading(false);
                        return;
                    }
                }
                return;
            case 27:
                c(view);
                return;
            case 28:
                d(view);
                return;
            default:
                qh.a7 a7Var = (qh.a7) this.f37318b;
                qh.l6 l6Var = (qh.l6) this.f37319c;
                org.telegram.ui.Cells.i3 i3Var = a7Var.V;
                try {
                    charSequence = ((ClipboardManager) a7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(a7Var.getContext());
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (charSequence != null) {
                    i3Var.f22957b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.f22957b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                l6Var.run();
                return;
        }
    }
}
