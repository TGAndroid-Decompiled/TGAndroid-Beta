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
    public w81 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final org.telegram.ui.ActionBar.h6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f32741a;
    public EditTextBoldCursor f32742b;
    public org.telegram.ui.ActionBar.v0 f32743c;
    public org.telegram.ui.Cells.f9 d;
    public org.telegram.ui.Cells.f9 e;
    public org.telegram.ui.Cells.ja f32744f;
    public org.telegram.ui.Cells.fa h;
    public org.telegram.ui.Cells.f9 f32745n;
    public org.telegram.ui.ActionBar.b2 f32746r;
    public org.telegram.ui.Components.kn f32747s;
    public org.telegram.ui.Cells.n4 v;
    public EditTextBoldCursor f32748w;
    public LinearLayout f32749x;
    public int f32750y;

    public ce1(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = i6Var;
        this.K = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f18956r;
        } else {
            tL_theme = i6Var.F;
        }
        this.L = tL_theme;
        if (h6Var != null) {
            i10 = h6Var.f18958t;
        } else {
            i10 = i6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(ce1 ce1Var, int i10) {
        ConnectionsManager.getInstance(ce1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(ce1 ce1Var, TLRPC.TL_theme tL_theme) {
        try {
            ce1Var.f32746r.dismiss();
            ce1Var.f32746r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.j6.C1(ce1Var.J, ce1Var.K, tL_theme, ce1Var.currentAccount, false);
        ce1Var.finishFragment();
    }

    public static void W(ce1 ce1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ce1Var.f32746r.dismiss();
            ce1Var.f32746r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.d5.f0(ce1Var.currentAccount, tL_error, ce1Var, updatetheme, new Object[0]);
    }

    public static void X(ce1 ce1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ce1Var.f32750y = ConnectionsManager.getInstance(ce1Var.currentAccount).sendRequest(createtheme, new dc0(25, ce1Var, str), 2);
    }

    public static void Y(ce1 ce1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = ce1Var.J;
        TLRPC.TL_theme tL_theme = ce1Var.L;
        if (!ce1Var.Z(ce1Var.f32741a.getText().toString(), true) || ce1Var.getParentActivity() == null) {
            return;
        }
        if (ce1Var.f32742b.length() == 0) {
            org.telegram.ui.Components.d5.u0(ce1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (ce1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ce1Var.getParentActivity(), 3, null);
            ce1Var.f32746r = b2Var;
            b2Var.setOnCancelListener(new Object());
            ce1Var.f32746r.show();
            String obj = ce1Var.f32742b.getText().toString();
            tL_theme.title = obj;
            i6Var.f18988a = obj;
            i6Var.F.slug = ce1Var.f32741a.getText().toString();
            org.telegram.ui.ActionBar.j6.r1(i6Var, true, true, true);
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
            String obj2 = ce1Var.f32741a.getText().toString();
            String obj3 = ce1Var.f32742b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                ce1Var.finishFragment();
                return;
            }
            ce1Var.f32746r = new org.telegram.ui.ActionBar.b2(ce1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f18414id = tL_theme.f18480id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(ce1Var.currentAccount).sendRequest(updatetheme, new dc0(26, ce1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ce1Var.currentAccount).bindRequestToGuid(sendRequest, ce1Var.classGuid);
            ce1Var.f32746r.setOnCancelListener(new ca(ce1Var, sendRequest, 8));
            ce1Var.f32746r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        w81 w81Var = this.F;
        if (w81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w81Var);
            this.F = null;
            this.E = null;
            if (this.f32750y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f32750y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f19330p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f19330p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.j6.f19330p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.j6.f19330p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.j6.f19458w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.j6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                w81 w81Var2 = new w81(8, this, str);
                this.F = w81Var2;
                AndroidUtilities.runOnUIThread(w81Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.d5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.j6.f19330p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19073b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19073b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.j6.f19073b7));
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
        this.f32743c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f32749x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f32749x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
        linearLayout2.addView(this.f32749x, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.v = n4Var;
        n4Var.setText(LocaleController.getString(R.string.Info));
        this.f32749x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f32742b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f32742b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f32742b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32742b.setMaxLines(1);
        this.f32742b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f32742b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f32742b.setBackgroundDrawable(null);
        this.f32742b.setPadding(0, 0, 0, 0);
        this.f32742b.setSingleLine(true);
        this.f32742b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f32742b.setInputType(163872);
        this.f32742b.setImeOptions(6);
        this.f32742b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f32742b.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32742b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32742b.setCursorWidth(1.5f);
        this.f32749x.addView(this.f32742b, w7.y5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f32742b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce1 f39912b;

            {
                this.f39912b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ce1 ce1Var = this.f39912b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ce1Var.f32742b);
                            return true;
                        }
                        ce1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f39912b.f32743c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, 27);
        this.f32747s = knVar;
        this.f32749x.addView(knVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f32749x.addView(linearLayout4, w7.y5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f32748w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f32748w.setTextSize(1, 18.0f);
        this.f32748w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32748w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32748w.setMaxLines(1);
        this.f32748w.setLines(1);
        this.f32748w.setEnabled(false);
        this.f32748w.setBackgroundDrawable(null);
        this.f32748w.setPadding(0, 0, 0, 0);
        this.f32748w.setSingleLine(true);
        this.f32748w.setInputType(163840);
        this.f32748w.setImeOptions(6);
        linearLayout4.addView(this.f32748w, w7.y5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f32741a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f32741a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f32741a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32741a.setMaxLines(1);
        this.f32741a.setLines(1);
        this.f32741a.setBackgroundDrawable(null);
        this.f32741a.setPadding(0, 0, 0, 0);
        this.f32741a.setSingleLine(true);
        this.f32741a.setInputType(163872);
        this.f32741a.setImeOptions(6);
        this.f32741a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f32741a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f32741a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f32741a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f32741a, w7.y5.n(-1, 50));
        this.f32741a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ce1 f39912b;

            {
                this.f39912b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ce1 ce1Var = this.f39912b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ce1Var.f32742b);
                            return true;
                        }
                        ce1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f39912b.f32743c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f32741a.addTextChangedListener(new be1(this));
        if (z10) {
            this.f32741a.setOnFocusChangeListener(new pd(this, 11));
        }
        org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
        this.e = f9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.j6.f19073b7;
        f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.f9 f9Var2 = new org.telegram.ui.Cells.f9(context);
        this.d = f9Var2;
        f9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.rv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.f9 f9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            f9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.y5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, this.parentLayout, 1);
            this.f32744f = jaVar;
            linearLayout2.addView(jaVar, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context);
            this.h = faVar;
            faVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.y5.n(-1, -2));
            this.h.setOnClickListener(new vy0(9, this, context));
            org.telegram.ui.Cells.f9 f9Var4 = new org.telegram.ui.Cells.f9(context);
            this.f32745n = f9Var4;
            f9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f32745n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f32745n, w7.y5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f32742b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f32742b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f32741a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f32741a;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.K;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var2 == i6Var && h6Var2 == h6Var && (b2Var2 = this.f32746r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f32746r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.j6.t(i6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var3 == i6Var && h6Var3 == h6Var && (b2Var = this.f32746r) != null) {
                try {
                    b2Var.dismiss();
                    this.f32746r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        LinearLayout linearLayout = this.f32749x;
        int i10 = org.telegram.ui.ActionBar.j6.f19109d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f19073b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32745n, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32745n, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19330p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19458w6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f32741a;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f19237k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f19255l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32741a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32742b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32742b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32742b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32748w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32748w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.kn knVar = this.f32747s;
        Paint paint = org.telegram.ui.ActionBar.j6.f19231k0;
        int i15 = org.telegram.ui.ActionBar.j6.f19110d7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(knVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32747s, 1, null, org.telegram.ui.ActionBar.j6.f19231k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19271m3, org.telegram.ui.ActionBar.j6.f19345q3}, null, org.telegram.ui.ActionBar.j6.f19370ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19291n3, org.telegram.ui.ActionBar.j6.f19363r3}, null, org.telegram.ui.ActionBar.j6.f19115dc));
        org.telegram.ui.Cells.ja jaVar = this.f32744f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f19271m3.f18900y;
        int i16 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, org.telegram.ui.ActionBar.j6.f19345q3.f18900y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19308o3, org.telegram.ui.ActionBar.j6.f19382s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19308o3, org.telegram.ui.ActionBar.j6.f19382s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19308o3, org.telegram.ui.ActionBar.j6.f19382s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19308o3, org.telegram.ui.ActionBar.j6.f19382s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19327p3, org.telegram.ui.ActionBar.j6.f19401t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Cells.ja jaVar2 = this.f32744f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f19308o3.f18900y;
        int i17 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, org.telegram.ui.ActionBar.j6.f19382s3.f18900y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19150fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f19508z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f19391sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19057ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19114db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19059ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19149fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19299nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19390sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19317od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f32744f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nb));
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
            this.f32741a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32741a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f32741a.requestFocus();
            AndroidUtilities.showKeyboard(this.f32741a);
        }
    }
}
