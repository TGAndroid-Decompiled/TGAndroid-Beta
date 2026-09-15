package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ae1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public nb1 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f31793a;
    public EditTextBoldCursor f31794b;
    public org.telegram.ui.ActionBar.v0 f31795c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 e;
    public org.telegram.ui.Cells.ja f31796f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.e9 f31797n;
    public org.telegram.ui.ActionBar.b2 f31798r;
    public org.telegram.ui.Components.kn f31799s;
    public org.telegram.ui.Cells.l4 v;
    public EditTextBoldCursor f31800w;
    public LinearLayout f31801x;
    public int f31802y;

    public ae1(org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = h6Var;
        this.K = g6Var;
        if (g6Var != null) {
            tL_theme = g6Var.f18706r;
        } else {
            tL_theme = h6Var.F;
        }
        this.L = tL_theme;
        if (g6Var != null) {
            i10 = g6Var.f18708t;
        } else {
            i10 = h6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(ae1 ae1Var, int i10) {
        ConnectionsManager.getInstance(ae1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(ae1 ae1Var, TLRPC.TL_theme tL_theme) {
        try {
            ae1Var.f31798r.dismiss();
            ae1Var.f31798r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.i6.C1(ae1Var.J, ae1Var.K, tL_theme, ae1Var.currentAccount, false);
        ae1Var.finishFragment();
    }

    public static void W(ae1 ae1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ae1Var.f31798r.dismiss();
            ae1Var.f31798r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.c5.f0(ae1Var.currentAccount, tL_error, ae1Var, updatetheme, new Object[0]);
    }

    public static void X(ae1 ae1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ae1Var.f31802y = ConnectionsManager.getInstance(ae1Var.currentAccount).sendRequest(createtheme, new bc0(25, ae1Var, str), 2);
    }

    public static void Y(ae1 ae1Var) {
        org.telegram.ui.ActionBar.h6 h6Var = ae1Var.J;
        TLRPC.TL_theme tL_theme = ae1Var.L;
        if (!ae1Var.Z(ae1Var.f31793a.getText().toString(), true) || ae1Var.getParentActivity() == null) {
            return;
        }
        if (ae1Var.f31794b.length() == 0) {
            org.telegram.ui.Components.c5.u0(ae1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (ae1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ae1Var.getParentActivity(), 3, null);
            ae1Var.f31798r = b2Var;
            b2Var.setOnCancelListener(new Object());
            ae1Var.f31798r.show();
            String obj = ae1Var.f31794b.getText().toString();
            tL_theme.title = obj;
            h6Var.f18729a = obj;
            h6Var.F.slug = ae1Var.f31793a.getText().toString();
            org.telegram.ui.ActionBar.i6.r1(h6Var, true, true, true);
        } else {
            String str2 = tL_theme.slug;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = tL_theme.title;
            if (str4 != null) {
                str3 = str4;
            }
            String obj2 = ae1Var.f31793a.getText().toString();
            String obj3 = ae1Var.f31794b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                ae1Var.finishFragment();
                return;
            }
            ae1Var.f31798r = new org.telegram.ui.ActionBar.b2(ae1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f18183id = tL_theme.f18249id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(ae1Var.currentAccount).sendRequest(updatetheme, new bc0(26, ae1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ae1Var.currentAccount).bindRequestToGuid(sendRequest, ae1Var.classGuid);
            ae1Var.f31798r.setOnCancelListener(new ba(ae1Var, sendRequest, 8));
            ae1Var.f31798r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        nb1 nb1Var = this.F;
        if (nb1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nb1Var);
            this.F = null;
            this.E = null;
            if (this.f31802y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f31802y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.i6.f19184w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.i6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                nb1 nb1Var2 = new nb1(2, this, str);
                this.F = nb1Var2;
                AndroidUtilities.runOnUIThread(nb1Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.c5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.i6.f19056p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f18800b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.i6.f18800b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        int i10 = 3;
        this.actionBar.setActionBarMenuOnItemClick(new v81(this, 3));
        this.f31795c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f31801x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f31801x.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        linearLayout2.addView(this.f31801x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.v = l4Var;
        l4Var.setText(LocaleController.getString(R.string.Info));
        this.f31801x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f31794b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f31794b;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f31794b;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f31794b.setMaxLines(1);
        this.f31794b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f31794b;
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f31794b.setBackgroundDrawable(null);
        this.f31794b.setPadding(0, 0, 0, 0);
        this.f31794b.setSingleLine(true);
        this.f31794b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f31794b.setInputType(163872);
        this.f31794b.setImeOptions(6);
        this.f31794b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f31794b.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f31794b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f31794b.setCursorWidth(1.5f);
        this.f31801x.addView(this.f31794b, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f31794b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ae1 f38848b;

            {
                this.f38848b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ae1 ae1Var = this.f38848b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ae1Var.f31794b);
                            return true;
                        }
                        ae1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f38848b.f31795c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, 27);
        this.f31799s = knVar;
        this.f31801x.addView(knVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f31801x.addView(linearLayout4, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f31800w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f31800w.setTextSize(1, 18.0f);
        this.f31800w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f31800w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f31800w.setMaxLines(1);
        this.f31800w.setLines(1);
        this.f31800w.setEnabled(false);
        this.f31800w.setBackgroundDrawable(null);
        this.f31800w.setPadding(0, 0, 0, 0);
        this.f31800w.setSingleLine(true);
        this.f31800w.setInputType(163840);
        this.f31800w.setImeOptions(6);
        linearLayout4.addView(this.f31800w, w7.x5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f31793a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f31793a.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f31793a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f31793a.setMaxLines(1);
        this.f31793a.setLines(1);
        this.f31793a.setBackgroundDrawable(null);
        this.f31793a.setPadding(0, 0, 0, 0);
        this.f31793a.setSingleLine(true);
        this.f31793a.setInputType(163872);
        this.f31793a.setImeOptions(6);
        this.f31793a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f31793a.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f31793a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f31793a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f31793a, w7.x5.n(-1, 50));
        this.f31793a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ae1 f38848b;

            {
                this.f38848b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ae1 ae1Var = this.f38848b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ae1Var.f31794b);
                            return true;
                        }
                        ae1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f38848b.f31795c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f31793a.addTextChangedListener(new zd1(this));
        if (z10) {
            this.f31793a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.i6.f18800b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.qv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.x5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, this.parentLayout, 1);
            this.f31796f = jaVar;
            linearLayout2.addView(jaVar, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.h = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.x5.n(-1, -2));
            this.h.setOnClickListener(new vy0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f31797n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f31797n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f31797n, w7.x5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f31794b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f31794b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f31793a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f31793a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (h6Var2 == h6Var && g6Var2 == g6Var && (b2Var2 = this.f31798r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f31798r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.i6.t(h6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (h6Var3 == h6Var && g6Var3 == g6Var && (b2Var = this.f31798r) != null) {
                try {
                    b2Var.dismiss();
                    this.f31798r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f18780a7));
        LinearLayout linearLayout = this.f31801x;
        int i10 = org.telegram.ui.ActionBar.i6.f18836d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19113s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19168v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19132t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.f18800b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31797n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31797n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19056p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19184w6));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f18926i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f31793a;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f18964k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f18982l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31793a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31794b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31794b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31794b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31800w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31800w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.kn knVar = this.f31799s;
        Paint paint = org.telegram.ui.ActionBar.i6.f18958k0;
        int i15 = org.telegram.ui.ActionBar.i6.f18837d7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(knVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31799s, 1, null, org.telegram.ui.ActionBar.i6.f18958k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f18998m3, org.telegram.ui.ActionBar.i6.f19071q3}, null, org.telegram.ui.ActionBar.i6.f19096ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19018n3, org.telegram.ui.ActionBar.i6.f19089r3}, null, org.telegram.ui.ActionBar.i6.f18842dc));
        org.telegram.ui.Cells.ja jaVar = this.f31796f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.f18998m3.f18665y;
        int i16 = org.telegram.ui.ActionBar.i6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, org.telegram.ui.ActionBar.i6.f19071q3.f18665y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19035o3, org.telegram.ui.ActionBar.i6.f19108s3}, null, org.telegram.ui.ActionBar.i6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19035o3, org.telegram.ui.ActionBar.i6.f19108s3}, null, org.telegram.ui.ActionBar.i6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19035o3, org.telegram.ui.ActionBar.i6.f19108s3}, null, org.telegram.ui.ActionBar.i6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19035o3, org.telegram.ui.ActionBar.i6.f19108s3}, null, org.telegram.ui.ActionBar.i6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19053p3, org.telegram.ui.ActionBar.i6.f19127t3}, null, org.telegram.ui.ActionBar.i6.Ba));
        org.telegram.ui.Cells.ja jaVar2 = this.f31796f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.f19035o3.f18665y;
        int i17 = org.telegram.ui.ActionBar.i6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, org.telegram.ui.ActionBar.i6.f19108s3.f18665y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f18877fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f19234z3}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f19117sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f18784ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f18841db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f18786ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f18876fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f19026nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f19116sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f19044od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f31796f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nb));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.I) {
            this.f31793a.requestFocus();
            AndroidUtilities.showKeyboard(this.f31793a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f31793a.requestFocus();
            AndroidUtilities.showKeyboard(this.f31793a);
        }
    }
}
