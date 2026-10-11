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
public final class be1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public m31 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f36351a;
    public EditTextBoldCursor f36352b;
    public org.telegram.ui.ActionBar.u0 f36353c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f36354e;
    public org.telegram.ui.Cells.ga f36355f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.e9 f36356n;
    public org.telegram.ui.ActionBar.a2 f36357r;
    public org.telegram.ui.Components.ao f36358s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f36359w;
    public LinearLayout f36360x;
    public int f36361y;

    public be1(org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = g6Var;
        this.K = f6Var;
        if (f6Var != null) {
            tL_theme = f6Var.f20621r;
        } else {
            tL_theme = g6Var.F;
        }
        this.L = tL_theme;
        if (f6Var != null) {
            i10 = f6Var.f20623t;
        } else {
            i10 = g6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(be1 be1Var, int i10) {
        ConnectionsManager.getInstance(be1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(be1 be1Var, TLRPC.TL_theme tL_theme) {
        try {
            be1Var.f36357r.dismiss();
            be1Var.f36357r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.h6.D1(be1Var.J, be1Var.K, tL_theme, be1Var.currentAccount, false);
        be1Var.finishFragment();
    }

    public static void W(be1 be1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            be1Var.f36357r.dismiss();
            be1Var.f36357r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.g5.e0(be1Var.currentAccount, tL_error, be1Var, updatetheme, new Object[0]);
    }

    public static void X(be1 be1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        be1Var.f36361y = ConnectionsManager.getInstance(be1Var.currentAccount).sendRequest(createtheme, new zb0(25, be1Var, str), 2);
    }

    public static void Y(be1 be1Var) {
        org.telegram.ui.ActionBar.g6 g6Var = be1Var.J;
        TLRPC.TL_theme tL_theme = be1Var.L;
        if (!be1Var.Z(be1Var.f36351a.getText().toString(), true) || be1Var.getParentActivity() == null) {
            return;
        }
        if (be1Var.f36352b.length() == 0) {
            org.telegram.ui.Components.g5.t0(be1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (be1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(be1Var.getParentActivity(), 3, null);
            be1Var.f36357r = a2Var;
            a2Var.setOnCancelListener(new Object());
            be1Var.f36357r.show();
            String obj = be1Var.f36352b.getText().toString();
            tL_theme.title = obj;
            g6Var.f20655a = obj;
            g6Var.F.slug = be1Var.f36351a.getText().toString();
            org.telegram.ui.ActionBar.h6.s1(g6Var, true, true, true);
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
            String obj2 = be1Var.f36351a.getText().toString();
            String obj3 = be1Var.f36352b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                be1Var.finishFragment();
                return;
            }
            be1Var.f36357r = new org.telegram.ui.ActionBar.a2(be1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20103id = tL_theme.f20169id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(be1Var.currentAccount).sendRequest(updatetheme, new zb0(26, be1Var, updatetheme), 2);
            ConnectionsManager.getInstance(be1Var.currentAccount).bindRequestToGuid(sendRequest, be1Var.classGuid);
            be1Var.f36357r.setOnCancelListener(new ba(be1Var, sendRequest, 8));
            be1Var.f36357r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        m31 m31Var = this.F;
        if (m31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m31Var);
            this.F = null;
            this.E = null;
            if (this.f36361y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36361y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f21007p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f21007p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.h6.f21007p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.h6.f21007p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.h6.f21136w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.h6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                m31 m31Var2 = new m31(15, this, str);
                this.F = m31Var2;
                AndroidUtilities.runOnUIThread(m31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.h6.f21007p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f36354e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20750b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20750b7));
                return;
            }
        }
        this.f36354e.setVisibility(0);
        this.f36354e.setText(str);
        this.f36354e.setTag(Integer.valueOf(i10));
        this.f36354e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.h6.f20750b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 4));
        this.f36353c = this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f36360x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f36360x.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        linearLayout2.addView(this.f36360x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f36360x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36352b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36352b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f36352b;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f36352b.setMaxLines(1);
        this.f36352b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f36352b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f36352b.setBackgroundDrawable(null);
        this.f36352b.setPadding(0, 0, 0, 0);
        this.f36352b.setSingleLine(true);
        this.f36352b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f36352b.setInputType(163872);
        this.f36352b.setImeOptions(6);
        this.f36352b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f36352b.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f36352b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36352b.setCursorWidth(1.5f);
        this.f36360x.addView(this.f36352b, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f36352b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final be1 f44049b;

            {
                this.f44049b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        be1 be1Var = this.f44049b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(be1Var.f36352b);
                            return true;
                        }
                        be1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f44049b.f36353c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(context, 27);
        this.f36358s = aoVar;
        this.f36360x.addView(aoVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f36360x.addView(linearLayout4, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f36359w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f36359w.setTextSize(1, 18.0f);
        this.f36359w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f36359w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f36359w.setMaxLines(1);
        this.f36359w.setLines(1);
        this.f36359w.setEnabled(false);
        this.f36359w.setBackgroundDrawable(null);
        this.f36359w.setPadding(0, 0, 0, 0);
        this.f36359w.setSingleLine(true);
        this.f36359w.setInputType(163840);
        this.f36359w.setImeOptions(6);
        linearLayout4.addView(this.f36359w, w7.x5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f36351a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f36351a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f36351a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f36351a.setMaxLines(1);
        this.f36351a.setLines(1);
        this.f36351a.setBackgroundDrawable(null);
        this.f36351a.setPadding(0, 0, 0, 0);
        this.f36351a.setSingleLine(true);
        this.f36351a.setInputType(163872);
        this.f36351a.setImeOptions(6);
        this.f36351a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f36351a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f36351a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36351a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f36351a, w7.x5.n(-1, 50));
        this.f36351a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final be1 f44049b;

            {
                this.f44049b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        be1 be1Var = this.f44049b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(be1Var.f36352b);
                            return true;
                        }
                        be1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f44049b.f36353c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f36351a.addTextChangedListener(new ae1(this));
        if (z10) {
            this.f36351a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f36354e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.h6.f20750b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i13, i14));
        this.f36354e.setVisibility(8);
        this.f36354e.setBottomPadding(0);
        linearLayout2.addView(this.f36354e, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.hw(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
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
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, this.parentLayout, 1);
            this.f36355f = gaVar;
            linearLayout2.addView(gaVar, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.h = caVar;
            caVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.x5.n(-1, -2));
            this.h.setOnClickListener(new uy0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f36356n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f36356n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f36356n, w7.x5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f36352b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f36352b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f36351a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f36351a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.a2 a2Var;
        org.telegram.ui.ActionBar.a2 a2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.f6 f6Var = this.K;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var2 == g6Var && f6Var2 == f6Var && (a2Var2 = this.f36357r) != null) {
                try {
                    a2Var2.dismiss();
                    this.f36357r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.h6.t(g6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var3 == g6Var && f6Var3 == f6Var && (a2Var = this.f36357r) != null) {
                try {
                    a2Var.dismiss();
                    this.f36357r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        LinearLayout linearLayout = this.f36360x;
        int i10 = org.telegram.ui.ActionBar.h6.f20786d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f20750b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36356n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36356n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36354e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36354e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21007p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36354e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36354e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21136w6));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f20877i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f36351a;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f20914k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f20932l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36351a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36352b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36352b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36352b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36359w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36359w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.ao aoVar = this.f36358s;
        Paint paint = org.telegram.ui.ActionBar.h6.f20908k0;
        int i15 = org.telegram.ui.ActionBar.h6.f20787d7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(aoVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36358s, 1, null, org.telegram.ui.ActionBar.h6.f20908k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20948m3, org.telegram.ui.ActionBar.h6.f21023q3}, null, org.telegram.ui.ActionBar.h6.f21049ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20968n3, org.telegram.ui.ActionBar.h6.f21042r3}, null, org.telegram.ui.ActionBar.h6.f20792dc));
        org.telegram.ui.Cells.ga gaVar = this.f36355f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f20948m3.A;
        int i16 = org.telegram.ui.ActionBar.h6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, org.telegram.ui.ActionBar.h6.f21023q3.A, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20986o3, org.telegram.ui.ActionBar.h6.f21060s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20986o3, org.telegram.ui.ActionBar.h6.f21060s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20986o3, org.telegram.ui.ActionBar.h6.f21060s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20986o3, org.telegram.ui.ActionBar.h6.f21060s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21004p3, org.telegram.ui.ActionBar.h6.f21079t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        org.telegram.ui.Cells.ga gaVar2 = this.f36355f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f20986o3.A;
        int i17 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, org.telegram.ui.ActionBar.h6.f21060s3.A, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20828fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21186z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21069sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20734ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20791db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20736ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20827fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20976nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21068sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20995od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f36355f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nb));
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
            this.f36351a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36351a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f36351a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36351a);
        }
    }
}
