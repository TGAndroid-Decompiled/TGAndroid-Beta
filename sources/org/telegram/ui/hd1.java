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
public final class hd1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public l01 C;
    public boolean D;
    public SpannableStringBuilder E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.i6 G;
    public final org.telegram.ui.ActionBar.h6 H;
    public final TLRPC.TL_theme I;
    public EditTextBoldCursor f34818a;
    public EditTextBoldCursor f34819b;
    public org.telegram.ui.ActionBar.w0 f34820c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 e;
    public org.telegram.ui.Cells.ea f34821f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.a9 f34822n;
    public org.telegram.ui.ActionBar.d2 f34823r;
    public org.telegram.ui.Components.hn f34824s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f34825w;
    public LinearLayout f34826x;
    public int f34827y;

    public hd1(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z4) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.G = i6Var;
        this.H = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f19775r;
        } else {
            tL_theme = i6Var.C;
        }
        this.I = tL_theme;
        if (h6Var != null) {
            i10 = h6Var.f19777t;
        } else {
            i10 = i6Var.B;
        }
        this.currentAccount = i10;
        this.F = z4;
    }

    public static void U(hd1 hd1Var, int i10) {
        ConnectionsManager.getInstance(hd1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(hd1 hd1Var, TLRPC.TL_theme tL_theme) {
        try {
            hd1Var.f34823r.dismiss();
            hd1Var.f34823r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.j6.C1(hd1Var.G, hd1Var.H, tL_theme, hd1Var.currentAccount, false);
        hd1Var.finishFragment();
    }

    public static void W(hd1 hd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            hd1Var.f34823r.dismiss();
            hd1Var.f34823r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.z4.f0(hd1Var.currentAccount, tL_error, hd1Var, updatetheme, new Object[0]);
    }

    public static void X(hd1 hd1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        hd1Var.f34827y = ConnectionsManager.getInstance(hd1Var.currentAccount).sendRequest(createtheme, new sb0(25, hd1Var, str), 2);
    }

    public static void Y(hd1 hd1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = hd1Var.G;
        TLRPC.TL_theme tL_theme = hd1Var.I;
        if (!hd1Var.Z(hd1Var.f34818a.getText().toString(), true) || hd1Var.getParentActivity() == null) {
            return;
        }
        if (hd1Var.f34819b.length() == 0) {
            org.telegram.ui.Components.z4.u0(hd1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (hd1Var.F) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(hd1Var.getParentActivity(), 3, null);
            hd1Var.f34823r = d2Var;
            d2Var.setOnCancelListener(new Object());
            hd1Var.f34823r.show();
            String obj = hd1Var.f34819b.getText().toString();
            tL_theme.title = obj;
            i6Var.f19805a = obj;
            i6Var.C.slug = hd1Var.f34818a.getText().toString();
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
            String obj2 = hd1Var.f34818a.getText().toString();
            String obj3 = hd1Var.f34819b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                hd1Var.finishFragment();
                return;
            }
            hd1Var.f34823r = new org.telegram.ui.ActionBar.d2(hd1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19255id = tL_theme.f19321id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(hd1Var.currentAccount).sendRequest(updatetheme, new sb0(26, hd1Var, updatetheme), 2);
            ConnectionsManager.getInstance(hd1Var.currentAccount).bindRequestToGuid(sendRequest, hd1Var.classGuid);
            hd1Var.f34823r.setOnCancelListener(new lh.w(hd1Var, sendRequest, 9));
            hd1Var.f34823r.show();
        }
    }

    public final boolean Z(String str, boolean z4) {
        l01 l01Var = this.C;
        if (l01Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l01Var);
            this.C = null;
            this.B = null;
            if (this.f34827y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f34827y, true);
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
                        a0(org.telegram.ui.ActionBar.j6.f20122p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z4) {
                            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f20122p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.j6.f20122p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z4) {
                    org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.j6.f20122p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z4) {
                TLRPC.TL_theme tL_theme = this.I;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.j6.f20244w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.j6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.B = str;
                l01 l01Var2 = new l01(20, this, str);
                this.C = l01Var2;
                AndroidUtilities.runOnUIThread(l01Var2, 300L);
            }
            return true;
        } else if (z4) {
            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.j6.f20122p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z4 = this.F;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z4) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19871b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.j6.f19871b7));
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
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 20));
        this.f34820c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new oh.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f34826x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f34826x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        linearLayout2.addView(this.f34826x, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f34826x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34819b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f34819b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f34819b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34819b.setMaxLines(1);
        this.f34819b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f34819b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f34819b.setBackgroundDrawable(null);
        this.f34819b.setPadding(0, 0, 0, 0);
        this.f34819b.setSingleLine(true);
        this.f34819b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f34819b.setInputType(163872);
        this.f34819b.setImeOptions(6);
        this.f34819b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f34819b.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34819b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34819b.setCursorWidth(1.5f);
        this.f34826x.addView(this.f34819b, k7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f34819b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hd1 f33599b;

            {
                this.f33599b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        hd1 hd1Var = this.f33599b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(hd1Var.f34819b);
                            return true;
                        }
                        hd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f33599b.f34820c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.hn hnVar = new org.telegram.ui.Components.hn(context, 24);
        this.f34824s = hnVar;
        this.f34826x.addView(hnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f34826x.addView(linearLayout4, k7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f34825w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f34825w.setTextSize(1, 18.0f);
        this.f34825w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f34825w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34825w.setMaxLines(1);
        this.f34825w.setLines(1);
        this.f34825w.setEnabled(false);
        this.f34825w.setBackgroundDrawable(null);
        this.f34825w.setPadding(0, 0, 0, 0);
        this.f34825w.setSingleLine(true);
        this.f34825w.setInputType(163840);
        this.f34825w.setImeOptions(6);
        linearLayout4.addView(this.f34825w, k7.b6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f34818a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f34818a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f34818a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34818a.setMaxLines(1);
        this.f34818a.setLines(1);
        this.f34818a.setBackgroundDrawable(null);
        this.f34818a.setPadding(0, 0, 0, 0);
        this.f34818a.setSingleLine(true);
        this.f34818a.setInputType(163872);
        this.f34818a.setImeOptions(6);
        this.f34818a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f34818a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f34818a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f34818a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f34818a, k7.b6.n(-1, 50));
        this.f34818a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hd1 f33599b;

            {
                this.f33599b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        hd1 hd1Var = this.f33599b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(hd1Var.f34819b);
                            return true;
                        }
                        hd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f33599b.f34820c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f34818a.addTextChangedListener(new gd1(this));
        if (z4) {
            this.f34818a.setOnFocusChangeListener(new qd(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.e = a9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.j6.f19871b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context);
        this.d = a9Var2;
        a9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.kv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        if (z4) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.a9 a9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.E = replaceTags;
            a9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, k7.b6.n(-1, -2));
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context, this.parentLayout, 1);
            this.f34821f = eaVar;
            linearLayout2.addView(eaVar, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.h = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, k7.b6.n(-1, -2));
            this.h.setOnClickListener(new gb0(24, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f34822n = a9Var4;
            a9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f34822n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f34822n, k7.b6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.I;
        if (tL_theme != null) {
            this.D = true;
            this.f34819b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f34819b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f34818a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f34818a;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.H;
        org.telegram.ui.ActionBar.i6 i6Var = this.G;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var2 == i6Var && h6Var2 == h6Var && (d2Var2 = this.f34823r) != null) {
                try {
                    d2Var2.dismiss();
                    this.f34823r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.j6.t(i6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var3 == i6Var && h6Var3 == h6Var && (d2Var = this.f34823r) != null) {
                try {
                    d2Var.dismiss();
                    this.f34823r = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        LinearLayout linearLayout = this.f34826x;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f19871b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34822n, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34822n, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20122p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20244w6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f34818a;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20031k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20049l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34818a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34819b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34819b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34819b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34825w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34825w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.hn hnVar = this.f34824s;
        Paint paint = org.telegram.ui.ActionBar.j6.f20025k0;
        int i15 = org.telegram.ui.ActionBar.j6.f19907d7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(hnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34824s, 1, null, org.telegram.ui.ActionBar.j6.f20025k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20064m3, org.telegram.ui.ActionBar.j6.f20137q3}, null, org.telegram.ui.ActionBar.j6.f20162ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20082n3, org.telegram.ui.ActionBar.j6.f20155r3}, null, org.telegram.ui.ActionBar.j6.f19912dc));
        org.telegram.ui.Cells.ea eaVar = this.f34821f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20064m3.f19734y;
        int i16 = org.telegram.ui.ActionBar.j6.f20193ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(eaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, org.telegram.ui.ActionBar.j6.f20137q3.f19734y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20118p3, org.telegram.ui.ActionBar.j6.f20188t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Cells.ea eaVar2 = this.f34821f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f20100o3.f19734y;
        int i17 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(eaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, org.telegram.ui.ActionBar.j6.f20172s3.f19734y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19929ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19947fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20278y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20296z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20178sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19856ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19893cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19911db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19858ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19946fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20091nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20109od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f34821f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20090nb));
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
            this.f34818a.requestFocus();
            AndroidUtilities.showKeyboard(this.f34818a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !this.F) {
            this.f34818a.requestFocus();
            AndroidUtilities.showKeyboard(this.f34818a);
        }
    }
}
