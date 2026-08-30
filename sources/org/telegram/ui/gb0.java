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
public final class gb0 implements View.OnClickListener {
    public final int f34564a;
    public final Object f34565b;
    public final Object f34566c;

    public gb0(int i10, Object obj, Object obj2) {
        this.f34564a = i10;
        this.f34565b = obj;
        this.f34566c = obj2;
    }

    private final void a(View view) {
        hd1 hd1Var = (hd1) this.f34565b;
        Context context = (Context) this.f34566c;
        if (hd1Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(hd1Var.getParentActivity(), null);
        b3Var.a();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ChooseTheme));
        org.telegram.messenger.y3.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false), 1, 20.0f);
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
        ib1 ib1Var = new ib1(context, hd1Var, arrayList, new ArrayList(), b3Var);
        linearLayout.addView(ib1Var, k7.b6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
        ib1Var.x1(hd1Var.fragmentView.getMeasuredWidth());
        hd1Var.showDialog(b3Var.f19525a);
    }

    private final void b(View view) {
        long j10;
        ai1 ai1Var = (ai1) this.f34565b;
        Context context = (Context) this.f34566c;
        gg.v2 v2Var = ai1Var.J;
        if (v2Var != null) {
            v2Var.dismiss();
            ai1Var.J = null;
        }
        gg.v2 v2Var2 = new gg.v2(context, ai1Var.f32598a, null, 4, new nh.i0());
        TLRPC.User user = ai1Var.f32604c;
        long j11 = 0;
        if (user != null) {
            j10 = user.f19331id;
        } else {
            j10 = 0;
        }
        TLRPC.User user2 = ai1Var.d;
        if (user2 != null) {
            j11 = user2.f19331id;
        }
        long[] jArr = {j10, j11};
        for (int i10 = 0; i10 < 2; i10++) {
            v2Var2.f6800z0.add(Long.valueOf(jArr[i10]));
        }
        v2Var2.h0(false, true);
        v2Var2.A0 = new org.telegram.ui.Components.yr(1);
        ai1Var.J = v2Var2;
        v2Var2.show();
    }

    private final void c(View view) {
        org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.f34565b;
        kVar.f39547b = true;
        ((z) this.f34566c).run();
        kVar.f39553w.V2.N(true);
    }

    private final void d(View view) {
        ph.a3 a3Var = (ph.a3) this.f34565b;
        a3Var.e((MediaController.AlbumEntry) this.f34566c, false);
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
        switch (this.f34564a) {
            case 0:
                nb0 nb0Var = (nb0) this.f34565b;
                Runnable[] runnableArr = (Runnable[]) this.f34566c;
                if (nb0Var.e == null) {
                    kb0 kb0Var = nb0Var.f36565f;
                    if (kb0Var.e.h) {
                        int i20 = -nb0Var.K;
                        nb0Var.K = i20;
                        AndroidUtilities.shakeViewSpring(kb0Var, i20);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    Switch r32 = s8Var.e;
                    s8Var.setChecked(!r32.h);
                    lb0 lb0Var = nb0Var.f36567r;
                    if (r32.h) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    lb0Var.setVisibility(i10);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r32.h) {
                        nb0Var.f36565f.setChecked(false);
                        nb0Var.f36565f.setCheckBoxIcon(R.drawable.permission_locked);
                        nb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        bb0 bb0Var = new bb0(nb0Var, 0);
                        runnableArr[0] = bb0Var;
                        AndroidUtilities.runOnUIThread(bb0Var, 60L);
                        return;
                    }
                    nb0Var.f36565f.setCheckBoxIcon(0);
                    nb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    bb0 bb0Var2 = new bb0(nb0Var, 1);
                    runnableArr[0] = bb0Var2;
                    AndroidUtilities.runOnUIThread(bb0Var2);
                    return;
                }
                return;
            case 1:
                ad0 ad0Var = (ad0) this.f34565b;
                ad0Var.r0((uc0) this.f34566c);
                sc0 sc0Var = ad0Var.F0;
                if (sc0Var != null) {
                    sc0Var.dismiss();
                    return;
                }
                return;
            case 2:
                ad0 ad0Var2 = ((xc0) this.f34565b).f39896b;
                ad0Var2.getClass();
                ad0Var2.C0.d(((zc0) this.f34566c).f40766c, ad0Var2.D0, true, 0, 0L);
                ad0Var2.finishFragment();
                return;
            case 3:
                yd0 yd0Var = (yd0) this.f34565b;
                Context context = (Context) this.f34566c;
                String string = yd0Var.f40491y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28583a |= 256;
                    obj.f28584b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28585c = i21;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i21, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i22 = yd0Var.D;
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
                alertDialog$Builder.f19503a.Q = AndroidUtilities.formatSpannable(replaceTags, charSequenceArr);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new fu(yd0Var, 17));
                kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 4:
                he0 he0Var = (he0) this.f34565b;
                Context context2 = (Context) this.f34566c;
                ng0 ng0Var = he0Var.f34844y;
                if (ng0Var.S.getTag() == null) {
                    if (he0Var.f34839n.has_recovery) {
                        ng0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i11 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_auth_requestPasswordRecovery, new ee0(he0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(he0Var.f34835a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f19503a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f19503a.Q = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new fu(he0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 5:
                rf0 rf0Var = (rf0) this.f34565b;
                Context context3 = (Context) this.f34566c;
                Bundle bundle = rf0Var.f38030l0;
                if (bundle != null && (tL_auth_sentCode = rf0Var.m0) != null) {
                    rf0Var.f38034p0.g1(bundle, tL_auth_sentCode, true);
                    return;
                } else if (!rf0Var.f38016a0) {
                    pf0 pf0Var = rf0Var.v;
                    if ((pf0Var == null || pf0Var.getVisibility() == 8) && !rf0Var.f38024f0) {
                        if (rf0Var.f38021d0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = rf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = rf0Var.f38019c;
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
                            rf0Var.f38034p0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f19503a.O = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, rf0Var.f38017b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new qs(27, rf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new gf0(rf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (rf0Var.f38034p0.S.getTag() == null) {
                            rf0Var.x();
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
                mg0 mg0Var = (mg0) this.f34565b;
                Context context4 = (Context) this.f34566c;
                Toast toast = mg0Var.L;
                if (toast != null) {
                    toast.cancel();
                    mg0Var.L = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (mg0Var.J > 0 && currentTimeMillis - mg0Var.K > 1500) {
                    i12 = 0;
                    mg0Var.J = 0;
                } else {
                    i12 = 0;
                }
                int i27 = mg0Var.J + 1;
                mg0Var.J = i27;
                mg0Var.K = currentTimeMillis;
                if (i27 >= 5) {
                    mg0Var.J = i12;
                    mg0Var.K = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mg0Var.getContext());
                    alertDialog$Builder4.f19503a.O = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new qv(mg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i27 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i27, new Object[0]), 0);
                    mg0Var.L = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 7:
                MessageObject messageObject = (MessageObject) this.f34566c;
                aj0 aj0Var = ((yi0) this.f34565b).d;
                if (!aj0Var.a0(messageObject)) {
                    aj0Var.getOrCreateStoryViewer().G(aj0Var.getParentActivity(), messageObject.storyItem, nh.c7.a(aj0Var.f32651f));
                    return;
                }
                return;
            case 8:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f34565b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f34566c;
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
                ImageView imageView = passcodeActivity.f31688s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.j6.f20049l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                return;
            case 9:
                jo0.h0((jo0) this.f34565b, (String) this.f34566c, view);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) this.f34565b;
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.f34566c;
                if (photoViewer.Q4 != null) {
                    o70Var.u();
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.f31781j4;
                    if (p2Var instanceof xn) {
                        ((xn) p2Var).J9(photoViewer.Q4, false, true);
                    }
                    af.g.r(photoViewer.B, Uri.parse(photoViewer.Q4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.Q).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f34565b;
                Activity activity = (Activity) this.f34566c;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!photoViewer2.H1() && !photoViewer2.f31848r) {
                    int i28 = photoViewer2.M4;
                    if (i28 >= 0 && i28 < photoViewer2.f31730d7.size()) {
                        Object obj2 = photoViewer2.f31730d7.get(photoViewer2.M4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31751g1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ph.f3 f3Var = photoViewer2.f31760h1;
                                if (f3Var != null) {
                                    f3Var.e(true);
                                    photoViewer2.f31760h1 = null;
                                }
                                if (photoViewer2.B != null) {
                                    photoViewer2.f31760h1 = new ph.f3(photoViewer2.B, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.mq(i17, 0), 0, 1, 33);
                                    photoViewer2.f31760h1.t(append);
                                    photoViewer2.f31705b0.addView(photoViewer2.f31760h1, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31760h1.setTranslationY(photoViewer2.M0.getTranslationY());
                                    photoViewer2.f31760h1.n(0.0f, (photoViewer2.f31751g1.getWidth() / 2.0f) + photoViewer2.f31751g1.getX() + photoViewer2.E0.getX());
                                    ph.f3 f3Var2 = photoViewer2.f31760h1;
                                    f3Var2.f41617i0 = new bh(2, f3Var2);
                                    f3Var2.d = 3500L;
                                    f3Var2.v();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31751g1.getTag() == null) {
                        if (photoViewer2.f31758g8) {
                            if (photoViewer2.f31778j1 == null) {
                                bu0 bu0Var = photoViewer2.f31705b0;
                                ?? textView = new TextView(activity);
                                textView.d = new org.telegram.ui.Components.nq0(textView, 17);
                                textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView.setTextColor(-1);
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView.setGravity(16);
                                bu0Var.addView((View) textView, k7.b6.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView.setVisibility(8);
                                photoViewer2.f31778j1 = textView;
                            }
                            photoViewer2.f31778j1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.a21 a21Var = photoViewer2.f31778j1;
                            org.telegram.ui.Components.u61 u61Var = photoViewer2.f31751g1;
                            org.telegram.ui.Components.nq0 nq0Var = a21Var.d;
                            if (u61Var != null) {
                                a21Var.f23272a = u61Var;
                                a21Var.a();
                                a21Var.f23274c = true;
                                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                                AndroidUtilities.runOnUIThread(nq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = a21Var.f23273b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    a21Var.f23273b.cancel();
                                    a21Var.f23273b = null;
                                }
                                if (a21Var.getVisibility() != 0) {
                                    a21Var.setAlpha(0.0f);
                                    a21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = a21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    a21Var.f23273b = listener;
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
                ((org.telegram.ui.Components.o70) this.f34565b).K((org.telegram.ui.Components.o70) this.f34566c);
                return;
            case 13:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f34565b;
                ((AlertDialog$Builder) this.f34566c).f19503a.I0.run();
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
                d2Var.f19590d0 = false;
                d2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new rr0(privacySettingsActivity, d2Var, setaccountttl, 2));
                return;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.f34565b;
                profileActivity.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f34566c).url);
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.f34565b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f34566c;
                long j10 = profileActivity2.f32037b1;
                long j11 = profileActivity2.B1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity2.D2;
                if (channelParticipant != null) {
                    tL_chatBannedRights = channelParticipant.banned_rights;
                }
                jq jqVar = new jq(j10, j11, null, tL_chatBannedRights2, tL_chatBannedRights, "", 1, true, false, null);
                jqVar.U0 = new uy0(profileActivity2, chat, jqVar);
                profileActivity2.presentFragment(jqVar);
                return;
            case 16:
                w11 w11Var = (w11) this.f34565b;
                Context context5 = (Context) this.f34566c;
                StringBuilder sb = new StringBuilder();
                String obj3 = w11Var.f39299a[0].getText().toString();
                String obj4 = w11Var.f39299a[3].getText().toString();
                String obj5 = w11Var.f39299a[2].getText().toString();
                String obj6 = w11Var.f39299a[1].getText().toString();
                String obj7 = w11Var.f39299a[4].getText().toString();
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
                    if (w11Var.v == 1) {
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
                        org.telegram.ui.Components.qi0 qi0Var = new org.telegram.ui.Components.qi0(context5, LocaleController.getString(R.string.ShareQrCode), l10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        qi0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        w11Var.showDialog(qi0Var);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                e51 e51Var = (e51) this.f34565b;
                Context context6 = (Context) this.f34566c;
                if (e51Var.f36209w == null) {
                    boolean[] zArr2 = new boolean[1];
                    long currentTimeMillis2 = System.currentTimeMillis() / 1000;
                    tl0 tl0Var = new tl0(16, e51Var, zArr2);
                    Pattern pattern = org.telegram.ui.Components.z4.f31230a;
                    if (context6 == null) {
                        zArr = zArr2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19977h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.b3 b3Var2 = new org.telegram.ui.ActionBar.b3(context6, null);
                        b3Var2.a();
                        org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(context6, null);
                        wc0Var.setTextColor(w02);
                        wc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        wc0Var.setItemCount(5);
                        org.telegram.ui.Components.wc0 wc0Var2 = new org.telegram.ui.Components.wc0(context6, null);
                        wc0Var2.setItemCount(5);
                        wc0Var2.setTextColor(w02);
                        wc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.wc0 wc0Var3 = new org.telegram.ui.Components.wc0(context6, null);
                        wc0Var3.setItemCount(5);
                        wc0Var3.setTextColor(w02);
                        wc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.s3 s3Var = new org.telegram.ui.Components.s3(context6, wc0Var, wc0Var2, wc0Var3, 3);
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
                        linearLayout.addView(wc0Var, k7.b6.l(0.5f, 0, 270));
                        wc0Var.setMinValue(0);
                        wc0Var.setMaxValue(365);
                        wc0Var.setWrapSelectorWheel(false);
                        wc0Var.setFormatter(new zr(10));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(wc0Var, wc0Var2, wc0Var3, 12);
                        wc0Var.setOnValueChangedListener(aVar);
                        wc0Var2.setMinValue(0);
                        wc0Var2.setMaxValue(23);
                        linearLayout.addView(wc0Var2, k7.b6.l(0.2f, 0, 270));
                        wc0Var2.setFormatter(new zr(11));
                        wc0Var2.setOnValueChangedListener(aVar);
                        wc0Var3.setMinValue(0);
                        wc0Var3.setMaxValue(59);
                        wc0Var3.setValue(0);
                        wc0Var3.setFormatter(new zr(12));
                        linearLayout.addView(wc0Var3, k7.b6.l(0.3f, 0, 270));
                        wc0Var3.setOnValueChangedListener(aVar);
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
                                wc0Var3.setValue(calendar.get(12));
                                wc0Var2.setValue(calendar.get(11));
                                wc0Var.setValue(timeInMillis);
                            }
                        } else {
                            zArr = zArr2;
                        }
                        org.telegram.ui.Components.z4.g(null, null, 0L, 0L, 0, wc0Var, wc0Var2, wc0Var3);
                        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        qVar.setGravity(17);
                        qVar.setTextColor(w04);
                        qVar.setTextSize(1, 14.0f);
                        qVar.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        qVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        qVar.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        s3Var.addView(qVar, k7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        qVar.setOnClickListener(new gg.e(wc0Var, wc0Var2, wc0Var3, calendar, (Object) tl0Var, b3Var2, 2));
                        b3Var2.b(s3Var);
                        org.telegram.ui.ActionBar.g3 g3Var = b3Var2.f19525a;
                        g3Var.show();
                        g3Var.setBackgroundColor(w03);
                        g3Var.fixNavigationBar(w03);
                        b3Var = b3Var2;
                    }
                    b3Var.f19525a.setOnHideListener(new gg.g(10, e51Var, zArr));
                    org.telegram.ui.ActionBar.g3 g3Var2 = b3Var.f19525a;
                    g3Var2.show();
                    e51Var.f36209w = g3Var2;
                    e51Var.c(false);
                    return;
                }
                return;
            case 18:
                e71 e71Var = (e71) this.f34565b;
                org.telegram.ui.Components.lc lcVar = (org.telegram.ui.Components.lc) this.f34566c;
                if (e71Var.W.g() != 0) {
                    lcVar.run(new ArrayList(e71Var.X.values()));
                    e71Var.dismiss();
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity = (SessionsActivity) this.f34565b;
                ((AlertDialog$Builder) this.f34566c).f19503a.I0.run();
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
                a81 a81Var = sessionsActivity.f32281a;
                if (a81Var != null) {
                    a81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new nh.p5(4));
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f34565b;
                editTextBoldCursor2.setText(lh.ja.M0(((Long) this.f34566c).longValue()));
                editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                return;
            case 21:
                ga1 ga1Var = ((l91) this.f34565b).f36009a0;
                ga1Var.getOrCreateStoryViewer().C(ga1Var.getParentActivity(), ((da1) this.f34566c).b(), ga1Var.f34556w0, nh.c7.a(ga1Var.P));
                return;
            case 22:
                p91 p91Var = (p91) this.f34565b;
                xf.f fVar = (xf.f) this.f34566c;
                int i29 = p91Var.f37250c;
                q91 q91Var = p91Var.d;
                org.telegram.ui.Components.s00 s00Var = p91Var.f37248a;
                if (s00Var.f28575c) {
                    ArrayList arrayList = q91Var.f37683n;
                    vf.g gVar = q91Var.f37681c;
                    int size = arrayList.size();
                    int i30 = 0;
                    while (true) {
                        if (i30 < size) {
                            if (i30 == i29 || !((p91) arrayList.get(i30)).f37248a.f28575c || !((p91) arrayList.get(i30)).f37248a.f28574b) {
                                i30++;
                            }
                        } else {
                            z4 = true;
                        }
                    }
                    q91Var.f();
                    if (z4) {
                        AndroidUtilities.shakeView(s00Var);
                        return;
                    }
                    s00Var.setChecked(true ^ s00Var.f28574b);
                    fVar.f46959n = s00Var.f28574b;
                    q91Var.f37680b.z();
                    if (q91Var.f37684r.f38231c > 0 && i29 < gVar.d.size()) {
                        ((xf.f) gVar.d.get(i29)).f46959n = s00Var.f28574b;
                        gVar.z();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                oy oyVar = (oy) this.f34566c;
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(oyVar.getParentActivity());
                alertDialog$Builder5.f19503a.O = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder5.f19503a.Q = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder5.k(LocaleController.getString(R.string.CacheClear), new tl0(18, (oa1) this.f34565b, oyVar));
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder5.f19503a;
                oyVar.showDialog(d2Var2);
                TextView textView3 = (TextView) d2Var2.d(-1);
                if (textView3 != null) {
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
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
                ph.d dVar = (ph.d) this.f34565b;
                int[] iArr = (int[]) this.f34566c;
                if (!dVar.K && (jVar = ri1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l11 = jVar.l();
                        com.google.android.gms.common.api.internal.t0 t0Var = new a8.e(applicationContext, com.google.android.gms.common.api.i.f2730c).h;
                        m8.i0 i0Var = new m8.i0(t0Var, (String) jVar.f2131c, "/tg-wear-auth/answer", l11);
                        t0Var.f2877b.d(0, i0Var);
                        b6.m.n(i0Var, m8.k0.f13823a).addOnSuccessListener(new d7(jVar, dVar, iArr, 24)).addOnFailureListener(new qi1(dVar, 0));
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
                ph.d7 d7Var = (ph.d7) this.f34565b;
                ph.f6 f6Var = (ph.f6) this.f34566c;
                org.telegram.ui.Cells.i3 i3Var = d7Var.V;
                try {
                    charSequence = ((ClipboardManager) d7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(d7Var.getContext());
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (charSequence != null) {
                    i3Var.f21199b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var3 = i3Var.f21199b;
                    g3Var3.setSelection(0, g3Var3.getText().length());
                }
                f6Var.run();
                return;
        }
    }
}
