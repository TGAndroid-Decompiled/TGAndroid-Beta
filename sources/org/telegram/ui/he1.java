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
public final class he1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public i11 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.f6 J;
    public final org.telegram.ui.ActionBar.e6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f36527a;
    public EditTextBoldCursor f36528b;
    public org.telegram.ui.ActionBar.u0 f36529c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 e;
    public org.telegram.ui.Cells.ga f36530f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.e9 f36531n;
    public org.telegram.ui.ActionBar.a2 f36532r;
    public org.telegram.ui.Components.xn f36533s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f36534w;
    public LinearLayout f36535x;
    public int f36536y;

    public he1(org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = f6Var;
        this.K = e6Var;
        if (e6Var != null) {
            tL_theme = e6Var.f19459r;
        } else {
            tL_theme = f6Var.F;
        }
        this.L = tL_theme;
        if (e6Var != null) {
            i10 = e6Var.f19461t;
        } else {
            i10 = f6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(he1 he1Var, int i10) {
        ConnectionsManager.getInstance(he1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(he1 he1Var, TLRPC.TL_theme tL_theme) {
        try {
            he1Var.f36532r.dismiss();
            he1Var.f36532r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.g6.D1(he1Var.J, he1Var.K, tL_theme, he1Var.currentAccount, false);
        he1Var.finishFragment();
    }

    public static void W(he1 he1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            he1Var.f36532r.dismiss();
            he1Var.f36532r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.g5.e0(he1Var.currentAccount, tL_error, he1Var, updatetheme, new Object[0]);
    }

    public static void X(he1 he1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        he1Var.f36536y = ConnectionsManager.getInstance(he1Var.currentAccount).sendRequest(createtheme, new ec0(25, he1Var, str), 2);
    }

    public static void Y(he1 he1Var) {
        org.telegram.ui.ActionBar.f6 f6Var = he1Var.J;
        TLRPC.TL_theme tL_theme = he1Var.L;
        if (!he1Var.Z(he1Var.f36527a.getText().toString(), true) || he1Var.getParentActivity() == null) {
            return;
        }
        if (he1Var.f36528b.length() == 0) {
            org.telegram.ui.Components.g5.t0(he1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (he1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(he1Var.getParentActivity(), 3, null);
            he1Var.f36532r = a2Var;
            a2Var.setOnCancelListener(new Object());
            he1Var.f36532r.show();
            String obj = he1Var.f36528b.getText().toString();
            tL_theme.title = obj;
            f6Var.f19491a = obj;
            f6Var.F.slug = he1Var.f36527a.getText().toString();
            org.telegram.ui.ActionBar.g6.s1(f6Var, true, true, true);
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
            String obj2 = he1Var.f36527a.getText().toString();
            String obj3 = he1Var.f36528b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                he1Var.finishFragment();
                return;
            }
            he1Var.f36532r = new org.telegram.ui.ActionBar.a2(he1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f18987id = tL_theme.f19053id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(he1Var.currentAccount).sendRequest(updatetheme, new ec0(26, he1Var, updatetheme), 2);
            ConnectionsManager.getInstance(he1Var.currentAccount).bindRequestToGuid(sendRequest, he1Var.classGuid);
            he1Var.f36532r.setOnCancelListener(new ga(he1Var, sendRequest, 8));
            he1Var.f36532r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        i11 i11Var = this.F;
        if (i11Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i11Var);
            this.F = null;
            this.E = null;
            if (this.f36536y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36536y, true);
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
                        a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.g6.f19952w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.g6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                i11 i11Var2 = new i11(22, this, str);
                this.F = i11Var2;
                AndroidUtilities.runOnUIThread(i11Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.g5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.g6.f19822p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19563b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.g6.f19563b7));
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
        this.actionBar.setActionBarMenuOnItemClick(new w41(this, 6));
        this.f36529c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ci.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f36535x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f36535x.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        linearLayout2.addView(this.f36535x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f36535x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36528b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36528b;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f36528b;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f36528b.setMaxLines(1);
        this.f36528b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f36528b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f36528b.setBackgroundDrawable(null);
        this.f36528b.setPadding(0, 0, 0, 0);
        this.f36528b.setSingleLine(true);
        this.f36528b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f36528b.setInputType(163872);
        this.f36528b.setImeOptions(6);
        this.f36528b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f36528b.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f36528b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36528b.setCursorWidth(1.5f);
        this.f36535x.addView(this.f36528b, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f36528b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final he1 f34972b;

            {
                this.f34972b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        he1 he1Var = this.f34972b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(he1Var.f36528b);
                            return true;
                        }
                        he1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f34972b.f36529c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, 27);
        this.f36533s = xnVar;
        this.f36535x.addView(xnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f36535x.addView(linearLayout4, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f36534w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f36534w.setTextSize(1, 18.0f);
        this.f36534w.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f36534w.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f36534w.setMaxLines(1);
        this.f36534w.setLines(1);
        this.f36534w.setEnabled(false);
        this.f36534w.setBackgroundDrawable(null);
        this.f36534w.setPadding(0, 0, 0, 0);
        this.f36534w.setSingleLine(true);
        this.f36534w.setInputType(163840);
        this.f36534w.setImeOptions(6);
        linearLayout4.addView(this.f36534w, w7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f36527a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f36527a.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.f36527a.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f36527a.setMaxLines(1);
        this.f36527a.setLines(1);
        this.f36527a.setBackgroundDrawable(null);
        this.f36527a.setPadding(0, 0, 0, 0);
        this.f36527a.setSingleLine(true);
        this.f36527a.setInputType(163872);
        this.f36527a.setImeOptions(6);
        this.f36527a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f36527a.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        this.f36527a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36527a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f36527a, w7.z5.n(-1, 50));
        this.f36527a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final he1 f34972b;

            {
                this.f34972b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        he1 he1Var = this.f34972b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(he1Var.f36528b);
                            return true;
                        }
                        he1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f34972b.f36529c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f36527a.addTextChangedListener(new ge1(this));
        if (z10) {
            this.f36527a.setOnFocusChangeListener(new vd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.g6.f19563b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.cw(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.z5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, this.parentLayout, 1);
            this.f36530f = gaVar;
            linearLayout2.addView(gaVar, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.h = caVar;
            caVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.z5.n(-1, -2));
            this.h.setOnClickListener(new bz0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f36531n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f36531n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f36531n, w7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f36528b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f36528b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f36527a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f36527a;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var2 == f6Var && e6Var2 == e6Var && (a2Var2 = this.f36532r) != null) {
                try {
                    a2Var2.dismiss();
                    this.f36532r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var3 == f6Var && e6Var3 == e6Var && (a2Var = this.f36532r) != null) {
                try {
                    a2Var.dismiss();
                    this.f36532r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        LinearLayout linearLayout = this.f36535x;
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.f19563b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36531n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36531n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19822p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19952w6));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f36527a;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f19728k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f19745l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36527a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36528b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36528b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36528b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36534w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36534w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.xn xnVar = this.f36533s;
        Paint paint = org.telegram.ui.ActionBar.g6.f19722k0;
        int i15 = org.telegram.ui.ActionBar.g6.f19602d7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(xnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36533s, 1, null, org.telegram.ui.ActionBar.g6.f19722k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19761m3, org.telegram.ui.ActionBar.g6.f19836q3}, null, org.telegram.ui.ActionBar.g6.f19862ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19781n3, org.telegram.ui.ActionBar.g6.f19855r3}, null, org.telegram.ui.ActionBar.g6.f19606dc));
        org.telegram.ui.Cells.ga gaVar = this.f36530f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f19761m3.A;
        int i16 = org.telegram.ui.ActionBar.g6.f19901ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, org.telegram.ui.ActionBar.g6.f19836q3.A, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19801o3, org.telegram.ui.ActionBar.g6.f19875s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f19819p3, org.telegram.ui.ActionBar.g6.f19894t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        org.telegram.ui.Cells.ga gaVar2 = this.f36530f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f19801o3.A;
        int i17 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, org.telegram.ui.ActionBar.g6.f19875s3.A, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19623ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f20002z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f19884sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19547ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19587cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19549ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19641fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19791nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19883sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19809od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f36530f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19789nb));
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
            this.f36527a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36527a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f36527a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36527a);
        }
    }
}
