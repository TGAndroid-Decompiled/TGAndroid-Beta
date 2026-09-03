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
public final class ib0 implements View.OnClickListener {
    public final int f34891a;
    public final Object f34892b;
    public final Object f34893c;

    public ib0(int i10, Object obj, Object obj2) {
        this.f34891a = i10;
        this.f34892b = obj;
        this.f34893c = obj2;
    }

    private final void a(View view) {
        od1 od1Var = (od1) this.f34892b;
        Context context = (Context) this.f34893c;
        if (od1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(od1Var.getParentActivity(), null);
        b3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false), 1, 20.0f);
        linearLayout.addView(textView, k7.b6.t(-1, -2, 51, 22, 12, 22, 4));
        textView.setOnTouchListener(new oh.d(2));
        b3Var.b(linearLayout);
        ArrayList arrayList = new ArrayList();
        int size = org.telegram.ui.ActionBar.j6.F.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i10);
            TLRPC.TL_theme tL_theme = i6Var.C;
            if (tL_theme == null || tL_theme.document != null) {
                arrayList.add(i6Var);
            }
        }
        qb1 qb1Var = new qb1(context, od1Var, arrayList, new ArrayList(), b3Var);
        linearLayout.addView(qb1Var, k7.b6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        qb1Var.w1(od1Var.fragmentView.getMeasuredWidth());
        od1Var.showDialog(b3Var.f19500a);
    }

    private final void b(View view) {
        long j10;
        ii1 ii1Var = (ii1) this.f34892b;
        Context context = (Context) this.f34893c;
        gg.v2 v2Var = ii1Var.J;
        if (v2Var != null) {
            v2Var.dismiss();
            ii1Var.J = null;
        }
        gg.v2 v2Var2 = new gg.v2(context, ii1Var.f34944a, null, 4, new nh.i0());
        TLRPC.User user = ii1Var.f34950c;
        long j11 = 0;
        if (user != null) {
            j10 = user.f19306id;
        } else {
            j10 = 0;
        }
        TLRPC.User user2 = ii1Var.d;
        if (user2 != null) {
            j11 = user2.f19306id;
        }
        long[] jArr = {j10, j11};
        for (int i10 = 0; i10 < 2; i10++) {
            v2Var2.f6787z0.add(Long.valueOf(jArr[i10]));
        }
        v2Var2.h0(false, true);
        v2Var2.A0 = new org.telegram.ui.Components.xr(1);
        ii1Var.J = v2Var2;
        v2Var2.show();
    }

    private final void c(View view) {
        org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f34892b;
        kVar.f39497b = true;
        ((a0) this.f34893c).run();
        kVar.f39503w.V2.N(true);
    }

    private final void d(View view) {
        ph.a3 a3Var = (ph.a3) this.f34892b;
        a3Var.e((MediaController.AlbumEntry) this.f34893c, false);
        a3Var.C.n();
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
        org.telegram.ui.ActionBar.b3 b3Var = null;
        boolean z4 = false;
        switch (this.f34891a) {
            case 0:
                pb0 pb0Var = (pb0) this.f34892b;
                Runnable[] runnableArr = (Runnable[]) this.f34893c;
                if (pb0Var.e == null) {
                    mb0 mb0Var = pb0Var.f37063f;
                    if (mb0Var.e.h) {
                        int i20 = -pb0Var.K;
                        pb0Var.K = i20;
                        AndroidUtilities.shakeViewSpring(mb0Var, i20);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    Switch r32 = r8Var.e;
                    r8Var.setChecked(!r32.h);
                    nb0 nb0Var = pb0Var.f37065r;
                    if (r32.h) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    nb0Var.setVisibility(i10);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r32.h) {
                        pb0Var.f37063f.setChecked(false);
                        pb0Var.f37063f.setCheckBoxIcon(R.drawable.permission_locked);
                        pb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        db0 db0Var = new db0(pb0Var, 0);
                        runnableArr[0] = db0Var;
                        AndroidUtilities.runOnUIThread(db0Var, 60L);
                        return;
                    }
                    pb0Var.f37063f.setCheckBoxIcon(0);
                    pb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    db0 db0Var2 = new db0(pb0Var, 1);
                    runnableArr[0] = db0Var2;
                    AndroidUtilities.runOnUIThread(db0Var2);
                    return;
                }
                return;
            case 1:
                cd0 cd0Var = (cd0) this.f34892b;
                cd0Var.r0((wc0) this.f34893c);
                uc0 uc0Var = cd0Var.F0;
                if (uc0Var != null) {
                    uc0Var.dismiss();
                    return;
                }
                return;
            case 2:
                cd0 cd0Var2 = ((zc0) this.f34892b).f40444b;
                cd0Var2.getClass();
                cd0Var2.C0.b(((bd0) this.f34893c).f32851c, cd0Var2.D0, true, 0, 0L);
                cd0Var2.finishFragment();
                return;
            case 3:
                ae0 ae0Var = (ae0) this.f34892b;
                Context context = (Context) this.f34893c;
                String string = ae0Var.f32570y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28632a |= 256;
                    obj.f28633b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28634c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = ae0Var.D;
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
                alertDialog$Builder.f19478a.Q = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new hu(ae0Var, 17));
                kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 4:
                je0 je0Var = (je0) this.f34892b;
                Context context2 = (Context) this.f34893c;
                pg0 pg0Var = je0Var.f35261y;
                if (pg0Var.S.getTag() == null) {
                    if (je0Var.f35256n.has_recovery) {
                        pg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i11 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_auth_requestPasswordRecovery, new ge0(je0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(je0Var.f35252a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new hu(je0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 5:
                tf0 tf0Var = (tf0) this.f34892b;
                Context context3 = (Context) this.f34893c;
                Bundle bundle = tf0Var.f38499l0;
                if (bundle != null && (tL_auth_sentCode = tf0Var.m0) != null) {
                    tf0Var.f38503p0.g1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!tf0Var.f38485a0) {
                    rf0 rf0Var = tf0Var.v;
                    if ((rf0Var == null || rf0Var.getVisibility() == 8) && !tf0Var.f38493f0) {
                        if (tf0Var.f38490d0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = tf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = tf0Var.f38488c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            tf0Var.f38503p0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f19478a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f19478a.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, tf0Var.f38486b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new ss(27, tf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new if0(tf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (tf0Var.f38503p0.S.getTag() == null) {
                            tf0Var.x();
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
                og0 og0Var = (og0) this.f34892b;
                Context context4 = (Context) this.f34893c;
                Toast toast = og0Var.L;
                if (toast != null) {
                    toast.cancel();
                    og0Var.L = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (og0Var.J > 0 && currentTimeMillis - og0Var.K > 1500) {
                    i12 = 0;
                    og0Var.J = 0;
                } else {
                    i12 = 0;
                }
                int i27 = og0Var.J + 1;
                og0Var.J = i27;
                og0Var.K = currentTimeMillis;
                if (i27 >= 5) {
                    og0Var.J = i12;
                    og0Var.K = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(og0Var.getContext());
                    alertDialog$Builder4.f19478a.O = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new sv(og0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i27 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i27, new Object[0]), 0);
                    og0Var.L = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 7:
                MessageObject messageObject = (MessageObject) this.f34893c;
                cj0 cj0Var = ((aj0) this.f34892b).d;
                if (!cj0Var.a0(messageObject)) {
                    cj0Var.getOrCreateStoryViewer().G(cj0Var.getParentActivity(), messageObject.storyItem, nh.c7.a(cj0Var.f33172f));
                    return;
                }
                return;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34892b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f34893c;
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
                ImageView imageView = passcodeActivity.f31662s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.j6.f20024l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                return;
            case 9:
                lo0.h0((lo0) this.f34892b, (String) this.f34893c, view);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.f34892b;
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.f34893c;
                if (photoViewer.Q4 != null) {
                    p70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.f31755j4;
                    if (p2Var instanceof zn) {
                        ((zn) p2Var).J9(photoViewer.Q4, false, true);
                    }
                    ze.d.r(photoViewer.B, Uri.parse(photoViewer.Q4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.Q).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f34892b;
                Activity activity = (Activity) this.f34893c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!photoViewer2.H1() && !photoViewer2.f31822r) {
                    int i28 = photoViewer2.M4;
                    if (i28 >= 0 && i28 < photoViewer2.f31704d7.size()) {
                        Object obj2 = photoViewer2.f31704d7.get(photoViewer2.M4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31725g1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ph.f3 f3Var = photoViewer2.f31734h1;
                                if (f3Var != null) {
                                    f3Var.e(true);
                                    photoViewer2.f31734h1 = null;
                                }
                                if (photoViewer2.B != null) {
                                    photoViewer2.f31734h1 = new ph.f3(photoViewer2.B, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.lq(i17, 0), 0, 1, 33);
                                    photoViewer2.f31734h1.s(append);
                                    photoViewer2.f31679b0.addView(photoViewer2.f31734h1, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31734h1.setTranslationY(photoViewer2.M0.getTranslationY());
                                    photoViewer2.f31734h1.m(0.0f, (photoViewer2.f31725g1.getWidth() / 2.0f) + photoViewer2.f31725g1.getX() + photoViewer2.E0.getX());
                                    ph.f3 f3Var2 = photoViewer2.f31734h1;
                                    f3Var2.f41662i0 = new dh(2, f3Var2);
                                    f3Var2.d = 3500L;
                                    f3Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31725g1.getTag() == null) {
                        if (photoViewer2.f31732g8) {
                            if (photoViewer2.f31752j1 == null) {
                                iu0 iu0Var = photoViewer2.f31679b0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.nq0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                iu0Var.addView((View) textView, k7.b6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f31752j1 = textView;
                            }
                            photoViewer2.f31752j1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.a21 a21Var = photoViewer2.f31752j1;
                            org.telegram.ui.Components.u61 u61Var = photoViewer2.f31725g1;
                            org.telegram.ui.Components.nq0 nq0Var = a21Var.d;
                            if (u61Var != null) {
                                a21Var.f23300a = u61Var;
                                a21Var.a();
                                a21Var.f23302c = true;
                                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                                AndroidUtilities.runOnUIThread(nq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = a21Var.f23301b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    a21Var.f23301b.cancel();
                                    a21Var.f23301b = null;
                                }
                                if (a21Var.getVisibility() != 0) {
                                    a21Var.setAlpha(0.0f);
                                    a21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = a21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    a21Var.f23301b = listener;
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
                ((org.telegram.ui.Components.p70) this.f34892b).K((org.telegram.ui.Components.p70) this.f34893c);
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34892b;
                ((AlertDialog$Builder) this.f34893c).f19478a.I0.run();
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
                d2Var.f19565d0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new yr0(privacySettingsActivity, d2Var, setaccountttl, 2));
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.f34892b;
                profileActivity.getClass();
                org.telegram.ui.Components.ic.e();
                ze.d.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f34893c).url);
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f34892b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f34893c;
                long j10 = profileActivity2.f32011b1;
                long j11 = profileActivity2.B1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.D2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                lq lqVar = new lq(j10, j11, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                lqVar.U0 = new bz0(profileActivity2, chat, lqVar);
                profileActivity2.presentFragment(lqVar);
                return;
            case 16:
                d21 d21Var = (d21) this.f34892b;
                Context context5 = (Context) this.f34893c;
                StringBuilder sb = new StringBuilder();
                String obj3 = d21Var.f33303a[0].getText().toString();
                String obj4 = d21Var.f33303a[3].getText().toString();
                String obj5 = d21Var.f33303a[2].getText().toString();
                String obj6 = d21Var.f33303a[1].getText().toString();
                String obj7 = d21Var.f33303a[4].getText().toString();
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
                        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context5, LocaleController.getString(R.string.ShareQrCode), l10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ri0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        d21Var.showDialog(ri0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                l51 l51Var = (l51) this.f34892b;
                Context context6 = (Context) this.f34893c;
                if (l51Var.f38399w == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    vl0 vl0Var = new vl0(16, l51Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.z4.f31242a;
                    if (context6 == null) {
                        zArr = zArr2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context6, null);
                        b3Var2.a();
                        org.telegram.ui.Components.xc0 xc0Var = new org.telegram.ui.Components.xc0(context6, null);
                        xc0Var.setTextColor(w02);
                        xc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        xc0Var.setItemCount(5);
                        org.telegram.ui.Components.xc0 xc0Var2 = new org.telegram.ui.Components.xc0(context6, null);
                        xc0Var2.setItemCount(5);
                        xc0Var2.setTextColor(w02);
                        xc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.xc0 xc0Var3 = new org.telegram.ui.Components.xc0(context6, null);
                        xc0Var3.setItemCount(5);
                        xc0Var3.setTextColor(w02);
                        xc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context6, xc0Var, xc0Var2, xc0Var3, 3);
                        s3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context6);
                        s3Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView2 = new TextView(context6);
                        textView2.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView2.setTextColor(w02);
                        textView2.setTextSize(1, 20.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView2, k7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView2.setOnTouchListener(new oh.d(10));
                        LinearLayout linearLayout = new LinearLayout(context6);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        s3Var.addView(linearLayout, k7.b6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        gg.q qVar = new gg.q(context6, 16);
                        linearLayout.addView(xc0Var, k7.b6.l(0.5f, 0, 270));
                        xc0Var.setMinValue(0);
                        xc0Var.setMaxValue(365);
                        xc0Var.setWrapSelectorWheel(false);
                        xc0Var.setFormatter(new bs(10));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(xc0Var, xc0Var2, xc0Var3, 12);
                        xc0Var.setOnValueChangedListener(aVar);
                        xc0Var2.setMinValue(0);
                        xc0Var2.setMaxValue(23);
                        linearLayout.addView(xc0Var2, k7.b6.l(0.2f, 0, 270));
                        xc0Var2.setFormatter(new bs(11));
                        xc0Var2.setOnValueChangedListener(aVar);
                        xc0Var3.setMinValue(0);
                        xc0Var3.setMaxValue(59);
                        xc0Var3.setValue(0);
                        xc0Var3.setFormatter(new bs(12));
                        linearLayout.addView(xc0Var3, k7.b6.l(0.3f, 0, 270));
                        xc0Var3.setOnValueChangedListener(aVar);
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
                                xc0Var3.setValue(calendar.get(12));
                                xc0Var2.setValue(calendar.get(11));
                                xc0Var.setValue(timeInMillis);
                            }
                        } else {
                            zArr = zArr2;
                        }
                        org.telegram.ui.Components.z4.g(null, null, 0L, 0L, 0, xc0Var, xc0Var2, xc0Var3);
                        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        qVar.setGravity(17);
                        qVar.setTextColor(w04);
                        qVar.setTextSize(1, 14.0f);
                        qVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        qVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        qVar.setOnClickListener(new gg.e(xc0Var, xc0Var2, xc0Var3, calendar, (Object) vl0Var, b3Var2, 2));
                        b3Var2.b(s3Var);
                        org.telegram.ui.ActionBar.g3 g3Var = b3Var2.f19500a;
                        g3Var.show();
                        g3Var.setBackgroundColor(w03);
                        g3Var.fixNavigationBar(w03);
                        b3Var = b3Var2;
                    }
                    b3Var.f19500a.setOnHideListener(new gg.g(10, l51Var, zArr));
                    org.telegram.ui.ActionBar.g3 g3Var2 = b3Var.f19500a;
                    g3Var2.show();
                    l51Var.f38399w = g3Var2;
                    l51Var.c(false);
                    return;
                }
                return;
            case 18:
                l71 l71Var = (l71) this.f34892b;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f34893c;
                if (l71Var.W.g() != 0) {
                    lcVar.run(new ArrayList(l71Var.X.values()));
                    l71Var.dismiss();
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f34892b;
                ((AlertDialog$Builder) this.f34893c).f19478a.I0.run();
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
                i81 i81Var = sessionsActivity.f32255a;
                if (i81Var != null) {
                    i81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new nh.p5(4));
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f34892b;
                editTextBoldCursor2.setText(lh.ja.M0(((Long) this.f34893c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 21:
                oa1 oa1Var = ((t91) this.f34892b).f38430a0;
                oa1Var.getOrCreateStoryViewer().C(oa1Var.getParentActivity(), ((la1) this.f34893c).b(), oa1Var.f36740w0, nh.c7.a(oa1Var.P));
                return;
            case 22:
                x91 x91Var = (x91) this.f34892b;
                xf.f fVar = (xf.f) this.f34893c;
                int i29 = x91Var.f39945c;
                y91 y91Var = x91Var.d;
                org.telegram.ui.Components.t00 t00Var = x91Var.f39943a;
                if (t00Var.f28853c) {
                    ArrayList arrayList = y91Var.f40193n;
                    vf.g gVar = y91Var.f40191c;
                    int size = arrayList.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 < size) {
                            if (i30 == i29 || !((x91) arrayList.get(i30)).f39943a.f28853c || !((x91) arrayList.get(i30)).f39943a.f28852b) {
                                i30++;
                            }
                        } else {
                            z4 = true;
                        }
                    }
                    y91Var.f();
                    if (z4) {
                        AndroidUtilities.shakeView(t00Var);
                        return;
                    }
                    t00Var.setChecked(true ^ t00Var.f28852b);
                    fVar.f47055n = t00Var.f28852b;
                    y91Var.f40190b.z();
                    if (y91Var.f40194r.f32528c > 0 && i29 < gVar.d.size()) {
                        ((xf.f) gVar.d.get(i29)).f47055n = t00Var.f28852b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                qy qyVar = (qy) this.f34893c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(qyVar.getParentActivity());
                alertDialog$Builder5.f19478a.O = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f19478a.Q = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new vl0(18, (wa1) this.f34892b, qyVar));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder5.f19478a;
                qyVar.showDialog(d2Var2);
                TextView textView3 = (TextView) d2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
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
                ph.d dVar = (ph.d) this.f34892b;
                int[] iArr = (int[]) this.f34893c;
                if (!dVar.K && (jVar = zi1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] n10 = jVar.n();
                        com.google.android.gms.common.api.internal.t0 t0Var = new a8.e(applicationContext, com.google.android.gms.common.api.i.f2713c).h;
                        m8.i0 i0Var = new m8.i0(t0Var, (String) jVar.f2154c, "/tg-wear-auth/answer", n10);
                        t0Var.f2860b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.f13807a).addOnSuccessListener(new f7(jVar, dVar, iArr, 24)).addOnFailureListener(new yi1(dVar, 0));
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
                ph.c7 c7Var = (ph.c7) this.f34892b;
                ph.e6 e6Var = (ph.e6) this.f34893c;
                org.telegram.ui.Cells.h3 h3Var = c7Var.V;
                try {
                    charSequence = ((ClipboardManager) c7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(c7Var.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    h3Var.f21132b.setText(charSequence.toString());
                    org.telegram.ui.Cells.f3 f3Var3 = h3Var.f21132b;
                    f3Var3.setSelection(0, f3Var3.getText().length());
                }
                e6Var.run();
                return;
        }
    }
}
