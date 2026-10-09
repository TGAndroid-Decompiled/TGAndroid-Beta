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
public final class ce1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public n31 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f36632a;
    public EditTextBoldCursor f36633b;
    public org.telegram.ui.ActionBar.v0 f36634c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f36635e;
    public org.telegram.ui.Cells.ga f36636f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.e9 f36637n;
    public org.telegram.ui.ActionBar.b2 f36638r;
    public org.telegram.ui.Components.ao f36639s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f36640w;
    public LinearLayout f36641x;
    public int f36642y;

    public ce1(org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = h6Var;
        this.K = g6Var;
        if (g6Var != null) {
            tL_theme = g6Var.f20668r;
        } else {
            tL_theme = h6Var.F;
        }
        this.L = tL_theme;
        if (g6Var != null) {
            i10 = g6Var.f20670t;
        } else {
            i10 = h6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(ce1 ce1Var, int i10) {
        ConnectionsManager.getInstance(ce1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(ce1 ce1Var, TLRPC.TL_theme tL_theme) {
        try {
            ce1Var.f36638r.dismiss();
            ce1Var.f36638r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.i6.D1(ce1Var.J, ce1Var.K, tL_theme, ce1Var.currentAccount, false);
        ce1Var.finishFragment();
    }

    public static void W(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ce1Var.f36638r.dismiss();
            ce1Var.f36638r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.g5.e0(ce1Var.currentAccount, tL_error, ce1Var, updatetheme, new Object[0]);
    }

    public static void X(ce1 ce1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ce1Var.f36642y = ConnectionsManager.getInstance(ce1Var.currentAccount).sendRequest(createtheme, new ac0(25, ce1Var, str), 2);
    }

    public static void Y(ce1 ce1Var) {
        org.telegram.ui.ActionBar.h6 h6Var = ce1Var.J;
        TLRPC.TL_theme tL_theme = ce1Var.L;
        if (!ce1Var.Z(ce1Var.f36632a.getText().toString(), true) || ce1Var.getParentActivity() == null) {
            return;
        }
        if (ce1Var.f36633b.length() == 0) {
            org.telegram.ui.Components.g5.t0(ce1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (ce1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ce1Var.getParentActivity(), 3, null);
            ce1Var.f36638r = b2Var;
            b2Var.setOnCancelListener(new Object());
            ce1Var.f36638r.show();
            String obj = ce1Var.f36633b.getText().toString();
            tL_theme.title = obj;
            h6Var.f20703a = obj;
            h6Var.F.slug = ce1Var.f36632a.getText().toString();
            org.telegram.ui.ActionBar.i6.s1(h6Var, true, true, true);
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
            String obj2 = ce1Var.f36632a.getText().toString();
            String obj3 = ce1Var.f36633b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                ce1Var.finishFragment();
                return;
            }
            ce1Var.f36638r = new org.telegram.ui.ActionBar.b2(ce1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20109id = tL_theme.f20175id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(ce1Var.currentAccount).sendRequest(updatetheme, new ac0(26, ce1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ce1Var.currentAccount).bindRequestToGuid(sendRequest, ce1Var.classGuid);
            ce1Var.f36638r.setOnCancelListener(new ca(ce1Var, sendRequest, 8));
            ce1Var.f36638r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        n31 n31Var = this.F;
        if (n31Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n31Var);
            this.F = null;
            this.E = null;
            if (this.f36642y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36642y, true);
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
                        a0(org.telegram.ui.ActionBar.i6.f21018p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.i6.f21018p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.i6.f21018p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.i6.f21018p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.i6.f21146w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.i6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                n31 n31Var2 = new n31(16, this, str);
                this.F = n31Var2;
                AndroidUtilities.runOnUIThread(n31Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.i6.f21018p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f36635e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20761b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
                return;
            }
        }
        this.f36635e.setVisibility(0);
        this.f36635e.setText(str);
        this.f36635e.setTag(Integer.valueOf(i10));
        this.f36635e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.i6.f20761b7));
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
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 4));
        this.f36634c = this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f36641x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f36641x.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        linearLayout2.addView(this.f36641x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f36641x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36633b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36633b;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f36633b;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f36633b.setMaxLines(1);
        this.f36633b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f36633b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f36633b.setBackgroundDrawable(null);
        this.f36633b.setPadding(0, 0, 0, 0);
        this.f36633b.setSingleLine(true);
        this.f36633b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f36633b.setInputType(163872);
        this.f36633b.setImeOptions(6);
        this.f36633b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f36633b.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f36633b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36633b.setCursorWidth(1.5f);
        this.f36641x.addView(this.f36633b, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f36633b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce1 f44321b;

            {
                this.f44321b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ce1 ce1Var = this.f44321b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ce1Var.f36633b);
                            return true;
                        }
                        ce1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f44321b.f36634c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(context, 27);
        this.f36639s = aoVar;
        this.f36641x.addView(aoVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f36641x.addView(linearLayout4, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f36640w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f36640w.setTextSize(1, 18.0f);
        this.f36640w.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        this.f36640w.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f36640w.setMaxLines(1);
        this.f36640w.setLines(1);
        this.f36640w.setEnabled(false);
        this.f36640w.setBackgroundDrawable(null);
        this.f36640w.setPadding(0, 0, 0, 0);
        this.f36640w.setSingleLine(true);
        this.f36640w.setInputType(163840);
        this.f36640w.setImeOptions(6);
        linearLayout4.addView(this.f36640w, w7.x5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f36632a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f36632a.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        this.f36632a.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f36632a.setMaxLines(1);
        this.f36632a.setLines(1);
        this.f36632a.setBackgroundDrawable(null);
        this.f36632a.setPadding(0, 0, 0, 0);
        this.f36632a.setSingleLine(true);
        this.f36632a.setInputType(163872);
        this.f36632a.setImeOptions(6);
        this.f36632a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f36632a.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
        this.f36632a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36632a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f36632a, w7.x5.n(-1, 50));
        this.f36632a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce1 f44321b;

            {
                this.f44321b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ce1 ce1Var = this.f44321b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ce1Var.f36633b);
                            return true;
                        }
                        ce1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f44321b.f36634c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f36632a.addTextChangedListener(new be1(this));
        if (z10) {
            this.f36632a.setOnFocusChangeListener(new pd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f36635e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.i6.f20761b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, i13, i14));
        this.f36635e.setVisibility(8);
        this.f36635e.setBottomPadding(0);
        linearLayout2.addView(this.f36635e, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.gw(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.K6, false));
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
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, this.parentLayout, 1);
            this.f36636f = gaVar;
            linearLayout2.addView(gaVar, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.h = caVar;
            caVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.x5.n(-1, -2));
            this.h.setOnClickListener(new vy0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f36637n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f36637n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f36637n, w7.x5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f36633b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f36633b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f36632a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f36632a;
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
            if (h6Var2 == h6Var && g6Var2 == g6Var && (b2Var2 = this.f36638r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f36638r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.i6.t(h6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (h6Var3 == h6Var && g6Var3 == g6Var && (b2Var = this.f36638r) != null) {
                try {
                    b2Var.dismiss();
                    this.f36638r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        LinearLayout linearLayout = this.f36641x;
        int i10 = org.telegram.ui.ActionBar.i6.f20797d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.f20761b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36637n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36637n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36635e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36635e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21018p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36635e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36635e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21146w6));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f36632a;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f20925k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f20943l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36632a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36633b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36633b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36633b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36640w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36640w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.ao aoVar = this.f36639s;
        Paint paint = org.telegram.ui.ActionBar.i6.f20919k0;
        int i15 = org.telegram.ui.ActionBar.i6.f20798d7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(aoVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36639s, 1, null, org.telegram.ui.ActionBar.i6.f20919k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20959m3, org.telegram.ui.ActionBar.i6.f21034q3}, null, org.telegram.ui.ActionBar.i6.f21059ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20979n3, org.telegram.ui.ActionBar.i6.f21052r3}, null, org.telegram.ui.ActionBar.i6.f20803dc));
        org.telegram.ui.Cells.ga gaVar = this.f36636f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.f20959m3.A;
        int i16 = org.telegram.ui.ActionBar.i6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.k6(gaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, org.telegram.ui.ActionBar.i6.f21034q3.A, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20997o3, org.telegram.ui.ActionBar.i6.f21070s3}, null, org.telegram.ui.ActionBar.i6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20997o3, org.telegram.ui.ActionBar.i6.f21070s3}, null, org.telegram.ui.ActionBar.i6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20997o3, org.telegram.ui.ActionBar.i6.f21070s3}, null, org.telegram.ui.ActionBar.i6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20997o3, org.telegram.ui.ActionBar.i6.f21070s3}, null, org.telegram.ui.ActionBar.i6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21015p3, org.telegram.ui.ActionBar.i6.f21089t3}, null, org.telegram.ui.ActionBar.i6.Ba));
        org.telegram.ui.Cells.ga gaVar2 = this.f36636f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.f20997o3.A;
        int i17 = org.telegram.ui.ActionBar.i6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.k6(gaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, org.telegram.ui.ActionBar.i6.f21070s3.A, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20839fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21196z3}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f21079sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20745ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20802db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20747ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20838fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20987nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21078sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21006od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f36636f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nb));
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
            this.f36632a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36632a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f36632a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36632a);
        }
    }
}
