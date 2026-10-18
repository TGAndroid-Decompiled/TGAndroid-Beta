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
public final class qc1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public m71 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f40380a;
    public EditTextBoldCursor f40381b;
    public org.telegram.ui.ActionBar.u0 f40382c;
    public org.telegram.ui.Cells.d9 d;
    public org.telegram.ui.Cells.d9 e;
    public org.telegram.ui.Cells.fa f40383f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.d9 f40384n;
    public org.telegram.ui.ActionBar.b2 f40385r;
    public org.telegram.ui.Components.un f40386s;
    public org.telegram.ui.Cells.l4 v;
    public EditTextBoldCursor f40387w;
    public LinearLayout f40388x;
    public int f40389y;

    public qc1(org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = g6Var;
        this.K = f6Var;
        if (f6Var != null) {
            tL_theme = f6Var.f20849r;
        } else {
            tL_theme = g6Var.F;
        }
        this.L = tL_theme;
        if (f6Var != null) {
            i10 = f6Var.f20851t;
        } else {
            i10 = g6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void V(qc1 qc1Var, TLRPC.TL_theme tL_theme) {
        try {
            qc1Var.f40385r.dismiss();
            qc1Var.f40385r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.h6.D1(qc1Var.J, qc1Var.K, tL_theme, qc1Var.currentAccount, false);
        qc1Var.finishFragment();
    }

    public static void W(qc1 qc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            qc1Var.f40385r.dismiss();
            qc1Var.f40385r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.f5.e0(qc1Var.currentAccount, tL_error, qc1Var, updatetheme, new Object[0]);
    }

    public static void X(qc1 qc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        qc1Var.f40389y = ConnectionsManager.getInstance(qc1Var.currentAccount).sendRequest(createtheme, new o71(2, qc1Var, str), 2);
    }

    public static void Y(qc1 qc1Var) {
        org.telegram.ui.ActionBar.g6 g6Var = qc1Var.J;
        TLRPC.TL_theme tL_theme = qc1Var.L;
        if (!qc1Var.Z(qc1Var.f40380a.getText().toString(), true) || qc1Var.getParentActivity() == null) {
            return;
        }
        if (qc1Var.f40381b.length() == 0) {
            org.telegram.ui.Components.f5.t0(qc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (qc1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(qc1Var.getParentActivity(), 3, null);
            qc1Var.f40385r = b2Var;
            b2Var.setOnCancelListener(new Object());
            qc1Var.f40385r.show();
            String obj = qc1Var.f40381b.getText().toString();
            tL_theme.title = obj;
            g6Var.f20884a = obj;
            g6Var.F.slug = qc1Var.f40380a.getText().toString();
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
            String obj2 = qc1Var.f40380a.getText().toString();
            String obj3 = qc1Var.f40381b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                qc1Var.finishFragment();
                return;
            }
            qc1Var.f40385r = new org.telegram.ui.ActionBar.b2(qc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20350id = tL_theme.f20416id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(qc1Var.currentAccount).sendRequest(updatetheme, new o71(3, qc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(qc1Var.currentAccount).bindRequestToGuid(sendRequest, qc1Var.classGuid);
            qc1Var.f40385r.setOnCancelListener(new ai.e0(qc1Var, sendRequest, 9));
            qc1Var.f40385r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        m71 m71Var = this.F;
        if (m71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m71Var);
            this.F = null;
            this.E = null;
            if (this.f40389y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f40389y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.f5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f21214p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.f5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f21214p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.h6.f21214p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.f5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.h6.f21214p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.h6.f21345w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.h6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                m71 m71Var2 = new m71(8, this, str);
                this.F = m71Var2;
                AndroidUtilities.runOnUIThread(m71Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.f5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.h6.f21214p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20955b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.h6.f20955b7));
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
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 7));
        this.f40382c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20935a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f40388x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f40388x.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false));
        linearLayout2.addView(this.f40388x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.v = l4Var;
        l4Var.setText(LocaleController.getString(R.string.Info));
        this.f40388x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f40381b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f40381b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f40381b;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40381b.setMaxLines(1);
        this.f40381b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f40381b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f40381b.setBackgroundDrawable(null);
        this.f40381b.setPadding(0, 0, 0, 0);
        this.f40381b.setSingleLine(true);
        this.f40381b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f40381b.setInputType(163872);
        this.f40381b.setImeOptions(6);
        this.f40381b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f40381b.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40381b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f40381b.setCursorWidth(1.5f);
        this.f40388x.addView(this.f40381b, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f40381b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qc1 f39450b;

            {
                this.f39450b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        qc1 qc1Var = this.f39450b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(qc1Var.f40381b);
                            return true;
                        }
                        qc1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f39450b.f40382c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.un unVar = new org.telegram.ui.Components.un(context, 27);
        this.f40386s = unVar;
        this.f40388x.addView(unVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f40388x.addView(linearLayout4, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f40387w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f40387w.setTextSize(1, 18.0f);
        this.f40387w.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f40387w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40387w.setMaxLines(1);
        this.f40387w.setLines(1);
        this.f40387w.setEnabled(false);
        this.f40387w.setBackgroundDrawable(null);
        this.f40387w.setPadding(0, 0, 0, 0);
        this.f40387w.setSingleLine(true);
        this.f40387w.setInputType(163840);
        this.f40387w.setImeOptions(6);
        linearLayout4.addView(this.f40387w, w7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f40380a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f40380a.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.f40380a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40380a.setMaxLines(1);
        this.f40380a.setLines(1);
        this.f40380a.setBackgroundDrawable(null);
        this.f40380a.setPadding(0, 0, 0, 0);
        this.f40380a.setSingleLine(true);
        this.f40380a.setInputType(163872);
        this.f40380a.setImeOptions(6);
        this.f40380a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f40380a.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40380a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f40380a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f40380a, w7.z5.n(-1, 50));
        this.f40380a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qc1 f39450b;

            {
                this.f39450b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        qc1 qc1Var = this.f39450b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(qc1Var.f40381b);
                            return true;
                        }
                        qc1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f39450b.f40382c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f40380a.addTextChangedListener(new pc1(this));
        if (z10) {
            this.f40380a.setOnFocusChangeListener(new rd(this, 11));
        }
        org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
        this.e = d9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.h6.f20955b7;
        d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context);
        this.d = d9Var2;
        d9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.yv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.d9 d9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            d9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.z5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, this.parentLayout, 1);
            this.f40383f = faVar;
            linearLayout2.addView(faVar, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.h = baVar;
            baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.z5.n(-1, -2));
            this.h.setOnClickListener(new ef0(19, this, context));
            org.telegram.ui.Cells.d9 d9Var4 = new org.telegram.ui.Cells.d9(context);
            this.f40384n = d9Var4;
            d9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f40384n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f40384n, w7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f40381b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f40381b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f40380a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f40380a;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.K;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var2 == g6Var && f6Var2 == f6Var && (b2Var2 = this.f40385r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f40385r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.h6.t(g6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var3 == g6Var && f6Var3 == f6Var && (b2Var = this.f40385r) != null) {
                try {
                    b2Var.dismiss();
                    this.f40385r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20935a7));
        LinearLayout linearLayout = this.f40388x;
        int i10 = org.telegram.ui.ActionBar.h6.f20993d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21272s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f20955b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40384n, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40384n, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21214p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21345w6));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f21082i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f40380a;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21137l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40380a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40381b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40381b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40381b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40387w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40387w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.un unVar = this.f40386s;
        Paint paint = org.telegram.ui.ActionBar.h6.f21114k0;
        int i15 = org.telegram.ui.ActionBar.h6.f20994d7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(unVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40386s, 1, null, org.telegram.ui.ActionBar.h6.f21114k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21153m3, org.telegram.ui.ActionBar.h6.f21228q3}, null, org.telegram.ui.ActionBar.h6.f21254ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21173n3, org.telegram.ui.ActionBar.h6.f21247r3}, null, org.telegram.ui.ActionBar.h6.f20998dc));
        org.telegram.ui.Cells.fa faVar = this.f40383f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f21153m3.A;
        int i16 = org.telegram.ui.ActionBar.h6.f21293ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(faVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, org.telegram.ui.ActionBar.h6.f21228q3.A, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21193o3, org.telegram.ui.ActionBar.h6.f21267s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21193o3, org.telegram.ui.ActionBar.h6.f21267s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21193o3, org.telegram.ui.ActionBar.h6.f21267s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21193o3, org.telegram.ui.ActionBar.h6.f21267s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21211p3, org.telegram.ui.ActionBar.h6.f21286t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        org.telegram.ui.Cells.fa faVar2 = this.f40383f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f21193o3.A;
        int i17 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(faVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, org.telegram.ui.ActionBar.h6.f21267s3.A, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21015ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21395z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21276sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20939ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20979cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20941ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21033fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21183nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21275sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21201od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40383f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21181nb));
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
            this.f40380a.requestFocus();
            AndroidUtilities.showKeyboard(this.f40380a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f40380a.requestFocus();
            AndroidUtilities.showKeyboard(this.f40380a);
        }
    }
}
