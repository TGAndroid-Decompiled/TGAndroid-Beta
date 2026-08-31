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
public final class jd1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public w01 C;
    public boolean D;
    public SpannableStringBuilder E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.j6 G;
    public final org.telegram.ui.ActionBar.i6 H;
    public final TLRPC.TL_theme I;
    public EditTextBoldCursor f38114a;
    public EditTextBoldCursor f38115b;
    public org.telegram.ui.ActionBar.w0 f38116c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 f38117e;
    public org.telegram.ui.Cells.ea f38118f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.a9 f38119n;
    public org.telegram.ui.ActionBar.d2 f38120r;
    public org.telegram.ui.Components.jn f38121s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f38122w;
    public LinearLayout f38123x;
    public int f38124y;

    public jd1(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z4) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.G = j6Var;
        this.H = i6Var;
        if (i6Var != null) {
            tL_theme = i6Var.f21482r;
        } else {
            tL_theme = j6Var.C;
        }
        this.I = tL_theme;
        if (i6Var != null) {
            i10 = i6Var.f21484t;
        } else {
            i10 = j6Var.B;
        }
        this.currentAccount = i10;
        this.F = z4;
    }

    public static void U(jd1 jd1Var, int i10) {
        ConnectionsManager.getInstance(jd1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(jd1 jd1Var, TLRPC.TL_theme tL_theme) {
        try {
            jd1Var.f38120r.dismiss();
            jd1Var.f38120r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.ActionBar.k6.C1(jd1Var.G, jd1Var.H, tL_theme, jd1Var.currentAccount, false);
        jd1Var.finishFragment();
    }

    public static void W(jd1 jd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            jd1Var.f38120r.dismiss();
            jd1Var.f38120r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Components.z4.f0(jd1Var.currentAccount, tL_error, jd1Var, updatetheme, new Object[0]);
    }

    public static void X(jd1 jd1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        jd1Var.f38124y = ConnectionsManager.getInstance(jd1Var.currentAccount).sendRequest(createtheme, new tb0(25, jd1Var, str), 2);
    }

    public static void Y(jd1 jd1Var) {
        org.telegram.ui.ActionBar.j6 j6Var = jd1Var.G;
        TLRPC.TL_theme tL_theme = jd1Var.I;
        if (!jd1Var.Z(jd1Var.f38114a.getText().toString(), true) || jd1Var.getParentActivity() == null) {
            return;
        }
        if (jd1Var.f38115b.length() == 0) {
            org.telegram.ui.Components.z4.u0(jd1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (jd1Var.F) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(jd1Var.getParentActivity(), 3, null);
            jd1Var.f38120r = d2Var;
            d2Var.setOnCancelListener(new Object());
            jd1Var.f38120r.show();
            String obj = jd1Var.f38115b.getText().toString();
            tL_theme.title = obj;
            j6Var.f21503a = obj;
            j6Var.C.slug = jd1Var.f38114a.getText().toString();
            org.telegram.ui.ActionBar.k6.r1(j6Var, true, true, true);
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
            String obj2 = jd1Var.f38114a.getText().toString();
            String obj3 = jd1Var.f38115b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                jd1Var.finishFragment();
                return;
            }
            jd1Var.f38120r = new org.telegram.ui.ActionBar.d2(jd1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20914id = tL_theme.f20980id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(jd1Var.currentAccount).sendRequest(updatetheme, new tb0(26, jd1Var, updatetheme), 2);
            ConnectionsManager.getInstance(jd1Var.currentAccount).bindRequestToGuid(sendRequest, jd1Var.classGuid);
            jd1Var.f38120r.setOnCancelListener(new mh.v(jd1Var, sendRequest, 9));
            jd1Var.f38120r.show();
        }
    }

    public final boolean Z(String str, boolean z4) {
        w01 w01Var = this.C;
        if (w01Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w01Var);
            this.C = null;
            this.B = null;
            if (this.f38124y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38124y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z4) {
                            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z4) {
                            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z4) {
                    org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z4) {
                TLRPC.TL_theme tL_theme = this.I;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.k6.f21998w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.k6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.B = str;
                w01 w01Var2 = new w01(19, this, str);
                this.C = w01Var2;
                AndroidUtilities.runOnUIThread(w01Var2, 300L);
            }
            return true;
        } else if (z4) {
            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.k6.f21876p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z4 = this.F;
        if (isEmpty) {
            this.f38117e.setVisibility(8);
            if (z4) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                return;
            }
        }
        this.f38117e.setVisibility(0);
        this.f38117e.setText(str);
        this.f38117e.setTag(Integer.valueOf(i10));
        this.f38117e.setTextColorByKey(i10);
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.f21624b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z4 = this.F;
        if (z4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 20));
        this.f38116c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f38123x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f38123x.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        linearLayout2.addView(this.f38123x, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f38123x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38115b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f38115b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f38115b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f38115b.setMaxLines(1);
        this.f38115b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f38115b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f38115b.setBackgroundDrawable(null);
        this.f38115b.setPadding(0, 0, 0, 0);
        this.f38115b.setSingleLine(true);
        this.f38115b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f38115b.setInputType(163872);
        this.f38115b.setImeOptions(6);
        this.f38115b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f38115b.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f38115b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38115b.setCursorWidth(1.5f);
        this.f38123x.addView(this.f38115b, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f38115b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final jd1 f36858b;

            {
                this.f36858b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        jd1 jd1Var = this.f36858b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(jd1Var.f38115b);
                            return true;
                        }
                        jd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f36858b.f38116c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 24);
        this.f38121s = jnVar;
        this.f38123x.addView(jnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f38123x.addView(linearLayout4, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f38122w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f38122w.setTextSize(1, 18.0f);
        this.f38122w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f38122w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f38122w.setMaxLines(1);
        this.f38122w.setLines(1);
        this.f38122w.setEnabled(false);
        this.f38122w.setBackgroundDrawable(null);
        this.f38122w.setPadding(0, 0, 0, 0);
        this.f38122w.setSingleLine(true);
        this.f38122w.setInputType(163840);
        this.f38122w.setImeOptions(6);
        linearLayout4.addView(this.f38122w, k7.c6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f38114a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f38114a.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f38114a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f38114a.setMaxLines(1);
        this.f38114a.setLines(1);
        this.f38114a.setBackgroundDrawable(null);
        this.f38114a.setPadding(0, 0, 0, 0);
        this.f38114a.setSingleLine(true);
        this.f38114a.setInputType(163872);
        this.f38114a.setImeOptions(6);
        this.f38114a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f38114a.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f38114a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38114a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f38114a, k7.c6.n(-1, 50));
        this.f38114a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final jd1 f36858b;

            {
                this.f36858b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        jd1 jd1Var = this.f36858b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(jd1Var.f38115b);
                            return true;
                        }
                        jd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f36858b.f38116c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f38114a.addTextChangedListener(new id1(this));
        if (z4) {
            this.f38114a.setOnFocusChangeListener(new qd(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.f38117e = a9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.k6.f21624b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i13, i14));
        this.f38117e.setVisibility(8);
        this.f38117e.setBottomPadding(0);
        linearLayout2.addView(this.f38117e, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.d = a9Var2;
        a9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.mv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.K6, false));
        if (z4) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.a9 a9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.E = replaceTags;
            a9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, k7.c6.n(-1, -2));
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, this.parentLayout, 1);
            this.f38118f = eaVar;
            linearLayout2.addView(eaVar, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.h = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, k7.c6.n(-1, -2));
            this.h.setOnClickListener(new hb0(24, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f38119n = a9Var4;
            a9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f38119n.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f38119n, k7.c6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.I;
        if (tL_theme != null) {
            this.D = true;
            this.f38115b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f38115b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f38114a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f38114a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.D = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.d2 d2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.i6 i6Var = this.H;
        org.telegram.ui.ActionBar.j6 j6Var = this.G;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var2 == j6Var && i6Var2 == i6Var && (d2Var2 = this.f38120r) != null) {
                try {
                    d2Var2.dismiss();
                    this.f38120r = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                org.telegram.ui.ActionBar.k6.t(j6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var3 == j6Var && i6Var3 == i6Var && (d2Var = this.f38120r) != null) {
                try {
                    d2Var.dismiss();
                    this.f38120r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        LinearLayout linearLayout = this.f38123x;
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38119n, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38119n, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38117e, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38117e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21876p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38117e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38117e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21998w6));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f38114a;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38114a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38115b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38115b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38115b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38122w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38122w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.jn jnVar = this.f38121s;
        Paint paint = org.telegram.ui.ActionBar.k6.f21779k0;
        int i15 = org.telegram.ui.ActionBar.k6.f21660d7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38121s, 1, null, org.telegram.ui.ActionBar.k6.f21779k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21818m3, org.telegram.ui.ActionBar.k6.f21891q3}, null, org.telegram.ui.ActionBar.k6.f21916ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21836n3, org.telegram.ui.ActionBar.k6.f21909r3}, null, org.telegram.ui.ActionBar.k6.f21665dc));
        org.telegram.ui.Cells.ea eaVar = this.f38118f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21818m3.f21440y;
        int i16 = org.telegram.ui.ActionBar.k6.f21947ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, org.telegram.ui.ActionBar.k6.f21891q3.f21440y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21854o3, org.telegram.ui.ActionBar.k6.f21926s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21872p3, org.telegram.ui.ActionBar.k6.f21942t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        org.telegram.ui.Cells.ea eaVar2 = this.f38118f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21854o3.f21440y;
        int i17 = org.telegram.ui.ActionBar.k6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, org.telegram.ui.ActionBar.k6.f21926s3.f21440y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21683ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21701fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22033y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22051z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21932sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21609ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21646cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21664db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21611ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21700fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21845nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21863od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f38118f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21844nb));
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
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.F) {
            this.f38114a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38114a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !this.F) {
            this.f38114a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38114a);
        }
    }
}
