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
public final class be1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public w81 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final org.telegram.ui.ActionBar.h6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f34800a;
    public EditTextBoldCursor f34801b;
    public org.telegram.ui.ActionBar.v0 f34802c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f34803e;
    public org.telegram.ui.Cells.ia f34804f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.e9 f34805n;
    public org.telegram.ui.ActionBar.b2 f34806r;
    public org.telegram.ui.Components.jn f34807s;
    public org.telegram.ui.Cells.l4 v;
    public EditTextBoldCursor f34808w;
    public LinearLayout f34809x;
    public int f34810y;

    public be1(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = i6Var;
        this.K = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f20532r;
        } else {
            tL_theme = i6Var.F;
        }
        this.L = tL_theme;
        if (h6Var != null) {
            i10 = h6Var.f20534t;
        } else {
            i10 = i6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(be1 be1Var, int i10) {
        ConnectionsManager.getInstance(be1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(be1 be1Var, TLRPC.TL_theme tL_theme) {
        try {
            be1Var.f34806r.dismiss();
            be1Var.f34806r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.j6.C1(be1Var.J, be1Var.K, tL_theme, be1Var.currentAccount, false);
        be1Var.finishFragment();
    }

    public static void W(be1 be1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            be1Var.f34806r.dismiss();
            be1Var.f34806r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.e5.f0(be1Var.currentAccount, tL_error, be1Var, updatetheme, new Object[0]);
    }

    public static void X(be1 be1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        be1Var.f34810y = ConnectionsManager.getInstance(be1Var.currentAccount).sendRequest(createtheme, new bc0(25, be1Var, str), 2);
    }

    public static void Y(be1 be1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = be1Var.J;
        TLRPC.TL_theme tL_theme = be1Var.L;
        if (!be1Var.Z(be1Var.f34800a.getText().toString(), true) || be1Var.getParentActivity() == null) {
            return;
        }
        if (be1Var.f34801b.length() == 0) {
            org.telegram.ui.Components.e5.u0(be1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (be1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(be1Var.getParentActivity(), 3, null);
            be1Var.f34806r = b2Var;
            b2Var.setOnCancelListener(new Object());
            be1Var.f34806r.show();
            String obj = be1Var.f34801b.getText().toString();
            tL_theme.title = obj;
            i6Var.f20567a = obj;
            i6Var.F.slug = be1Var.f34800a.getText().toString();
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
            String obj2 = be1Var.f34800a.getText().toString();
            String obj3 = be1Var.f34801b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                be1Var.finishFragment();
                return;
            }
            be1Var.f34806r = new org.telegram.ui.ActionBar.b2(be1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19967id = tL_theme.f20033id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(be1Var.currentAccount).sendRequest(updatetheme, new bc0(26, be1Var, updatetheme), 2);
            ConnectionsManager.getInstance(be1Var.currentAccount).bindRequestToGuid(sendRequest, be1Var.classGuid);
            be1Var.f34806r.setOnCancelListener(new ba(be1Var, sendRequest, 8));
            be1Var.f34806r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        w81 w81Var = this.F;
        if (w81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w81Var);
            this.F = null;
            this.E = null;
            if (this.f34810y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f34810y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.j6.f21035w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
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
            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.j6.f20907p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f34803e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f20654b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20654b7));
                return;
            }
        }
        this.f34803e.setVisibility(0);
        this.f34803e.setText(str);
        this.f34803e.setTag(Integer.valueOf(i10));
        this.f34803e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.j6.f20654b7));
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
        this.f34802c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20634a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ci.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f34809x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f34809x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
        linearLayout2.addView(this.f34809x, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.v = l4Var;
        l4Var.setText(LocaleController.getString(R.string.Info));
        this.f34809x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34801b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f34801b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f34801b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34801b.setMaxLines(1);
        this.f34801b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f34801b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f34801b.setBackgroundDrawable(null);
        this.f34801b.setPadding(0, 0, 0, 0);
        this.f34801b.setSingleLine(true);
        this.f34801b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f34801b.setInputType(163872);
        this.f34801b.setImeOptions(6);
        this.f34801b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f34801b.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34801b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34801b.setCursorWidth(1.5f);
        this.f34809x.addView(this.f34801b, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f34801b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final be1 f42721b;

            {
                this.f42721b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        be1 be1Var = this.f42721b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(be1Var.f34801b);
                            return true;
                        }
                        be1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f42721b.f34802c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, 27);
        this.f34807s = jnVar;
        this.f34809x.addView(jnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f34809x.addView(linearLayout4, w7.x5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f34808w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f34808w.setTextSize(1, 18.0f);
        this.f34808w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f34808w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34808w.setMaxLines(1);
        this.f34808w.setLines(1);
        this.f34808w.setEnabled(false);
        this.f34808w.setBackgroundDrawable(null);
        this.f34808w.setPadding(0, 0, 0, 0);
        this.f34808w.setSingleLine(true);
        this.f34808w.setInputType(163840);
        this.f34808w.setImeOptions(6);
        linearLayout4.addView(this.f34808w, w7.x5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f34800a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f34800a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f34800a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34800a.setMaxLines(1);
        this.f34800a.setLines(1);
        this.f34800a.setBackgroundDrawable(null);
        this.f34800a.setPadding(0, 0, 0, 0);
        this.f34800a.setSingleLine(true);
        this.f34800a.setInputType(163872);
        this.f34800a.setImeOptions(6);
        this.f34800a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f34800a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34800a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34800a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f34800a, w7.x5.n(-1, 50));
        this.f34800a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final be1 f42721b;

            {
                this.f42721b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        be1 be1Var = this.f42721b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(be1Var.f34801b);
                            return true;
                        }
                        be1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f42721b.f34802c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f34800a.addTextChangedListener(new ae1(this));
        if (z10) {
            this.f34800a.setOnFocusChangeListener(new pd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f34803e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.j6.f20654b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i13, i14));
        this.f34803e.setVisibility(8);
        this.f34803e.setBottomPadding(0);
        linearLayout2.addView(this.f34803e, w7.x5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.pv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
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
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, this.parentLayout, 1);
            this.f34804f = iaVar;
            linearLayout2.addView(iaVar, w7.x5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.h = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.x5.n(-1, -2));
            this.h.setOnClickListener(new wy0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f34805n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f34805n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f34805n, w7.x5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f34801b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f34801b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f34800a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f34800a;
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
            if (i6Var2 == i6Var && h6Var2 == h6Var && (b2Var2 = this.f34806r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f34806r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.j6.t(i6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var3 == i6Var && h6Var3 == h6Var && (b2Var = this.f34806r) != null) {
                try {
                    b2Var.dismiss();
                    this.f34806r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20634a7));
        LinearLayout linearLayout = this.f34809x;
        int i10 = org.telegram.ui.ActionBar.j6.f20690d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20964s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21019v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20983t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f20654b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34805n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34805n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34803e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34803e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20907p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34803e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34803e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21035w6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f20780i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f34800a;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20818k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20836l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34800a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34801b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34801b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34801b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34808w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34808w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.jn jnVar = this.f34807s;
        Paint paint = org.telegram.ui.ActionBar.j6.f20812k0;
        int i15 = org.telegram.ui.ActionBar.j6.f20691d7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34807s, 1, null, org.telegram.ui.ActionBar.j6.f20812k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20851m3, org.telegram.ui.ActionBar.j6.f20922q3}, null, org.telegram.ui.ActionBar.j6.f20947ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20870n3, org.telegram.ui.ActionBar.j6.f20940r3}, null, org.telegram.ui.ActionBar.j6.f20696dc));
        org.telegram.ui.Cells.ia iaVar = this.f34804f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20851m3.f20472y;
        int i16 = org.telegram.ui.ActionBar.j6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, org.telegram.ui.ActionBar.j6.f20922q3.f20472y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20886o3, org.telegram.ui.ActionBar.j6.f20959s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20886o3, org.telegram.ui.ActionBar.j6.f20959s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20886o3, org.telegram.ui.ActionBar.j6.f20959s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20886o3, org.telegram.ui.ActionBar.j6.f20959s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20904p3, org.telegram.ui.ActionBar.j6.f20978t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Cells.ia iaVar2 = this.f34804f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f20886o3.f20472y;
        int i17 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(iaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, org.telegram.ui.ActionBar.j6.f20959s3.f20472y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20732fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f21085z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20968sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20638ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20695db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20640ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20731fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20878nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20967sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20895od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34804f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nb));
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
            this.f34800a.requestFocus();
            AndroidUtilities.showKeyboard(this.f34800a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f34800a.requestFocus();
            AndroidUtilities.showKeyboard(this.f34800a);
        }
    }
}
