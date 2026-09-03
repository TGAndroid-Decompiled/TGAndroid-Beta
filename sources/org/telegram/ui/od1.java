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
public final class od1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public String B;
    public h21 C;
    public boolean D;
    public SpannableStringBuilder E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.j6 G;
    public final org.telegram.ui.ActionBar.i6 H;
    public final TLRPC.TL_theme I;
    public EditTextBoldCursor f39662a;
    public EditTextBoldCursor f39663b;
    public org.telegram.ui.ActionBar.w0 f39664c;
    public org.telegram.ui.Cells.a9 d;
    public org.telegram.ui.Cells.a9 f39665e;
    public org.telegram.ui.Cells.ea f39666f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.a9 f39667n;
    public org.telegram.ui.ActionBar.d2 f39668r;
    public org.telegram.ui.Components.in f39669s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f39670w;
    public LinearLayout f39671x;
    public int f39672y;

    public od1(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z4) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.G = j6Var;
        this.H = i6Var;
        if (i6Var != null) {
            tL_theme = i6Var.f21484r;
        } else {
            tL_theme = j6Var.C;
        }
        this.I = tL_theme;
        if (i6Var != null) {
            i10 = i6Var.f21486t;
        } else {
            i10 = j6Var.B;
        }
        this.currentAccount = i10;
        this.F = z4;
    }

    public static void U(od1 od1Var, int i10) {
        ConnectionsManager.getInstance(od1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(od1 od1Var, TLRPC.TL_theme tL_theme) {
        try {
            od1Var.f39668r.dismiss();
            od1Var.f39668r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.ActionBar.k6.C1(od1Var.G, od1Var.H, tL_theme, od1Var.currentAccount, false);
        od1Var.finishFragment();
    }

    public static void W(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            od1Var.f39668r.dismiss();
            od1Var.f39668r = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        org.telegram.ui.Components.z4.f0(od1Var.currentAccount, tL_error, od1Var, updatetheme, new Object[0]);
    }

    public static void X(od1 od1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        od1Var.f39672y = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(createtheme, new tb0(25, od1Var, str), 2);
    }

    public static void Y(od1 od1Var) {
        org.telegram.ui.ActionBar.j6 j6Var = od1Var.G;
        TLRPC.TL_theme tL_theme = od1Var.I;
        if (!od1Var.Z(od1Var.f39662a.getText().toString(), true) || od1Var.getParentActivity() == null) {
            return;
        }
        if (od1Var.f39663b.length() == 0) {
            org.telegram.ui.Components.z4.u0(od1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (od1Var.F) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
            od1Var.f39668r = d2Var;
            d2Var.setOnCancelListener(new Object());
            od1Var.f39668r.show();
            String obj = od1Var.f39663b.getText().toString();
            tL_theme.title = obj;
            j6Var.f21505a = obj;
            j6Var.C.slug = od1Var.f39662a.getText().toString();
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
            String obj2 = od1Var.f39662a.getText().toString();
            String obj3 = od1Var.f39663b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                od1Var.finishFragment();
                return;
            }
            od1Var.f39668r = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20916id = tL_theme.f20982id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(updatetheme, new tb0(26, od1Var, updatetheme), 2);
            ConnectionsManager.getInstance(od1Var.currentAccount).bindRequestToGuid(sendRequest, od1Var.classGuid);
            od1Var.f39668r.setOnCancelListener(new mh.v(od1Var, sendRequest, 9));
            od1Var.f39668r.show();
        }
    }

    public final boolean Z(String str, boolean z4) {
        h21 h21Var = this.C;
        if (h21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(h21Var);
            this.C = null;
            this.B = null;
            if (this.f39672y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f39672y, true);
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
                        a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z4) {
                            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z4) {
                    org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z4) {
                TLRPC.TL_theme tL_theme = this.I;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.k6.f22000w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.k6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.B = str;
                h21 h21Var2 = new h21(18, this, str);
                this.C = h21Var2;
                AndroidUtilities.runOnUIThread(h21Var2, 300L);
            }
            return true;
        } else if (z4) {
            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.k6.f21878p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z4 = this.F;
        if (isEmpty) {
            this.f39665e.setVisibility(8);
            if (z4) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21626b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7));
                return;
            }
        }
        this.f39665e.setVisibility(0);
        this.f39665e.setText(str);
        this.f39665e.setTag(Integer.valueOf(i10));
        this.f39665e.setTextColorByKey(i10);
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.f21626b7));
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
        this.f39664c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f39671x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f39671x.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        linearLayout2.addView(this.f39671x, k7.c6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f39671x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f39663b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f39663b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f39663b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f39663b.setMaxLines(1);
        this.f39663b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f39663b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f39663b.setBackgroundDrawable(null);
        this.f39663b.setPadding(0, 0, 0, 0);
        this.f39663b.setSingleLine(true);
        this.f39663b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f39663b.setInputType(163872);
        this.f39663b.setImeOptions(6);
        this.f39663b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f39663b.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f39663b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f39663b.setCursorWidth(1.5f);
        this.f39671x.addView(this.f39663b, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f39663b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final od1 f38258b;

            {
                this.f38258b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        od1 od1Var = this.f38258b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.f39663b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f38258b.f39664c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.in inVar = new org.telegram.ui.Components.in(context, 24);
        this.f39669s = inVar;
        this.f39671x.addView(inVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f39671x.addView(linearLayout4, k7.c6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f39670w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f39670w.setTextSize(1, 18.0f);
        this.f39670w.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f39670w.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f39670w.setMaxLines(1);
        this.f39670w.setLines(1);
        this.f39670w.setEnabled(false);
        this.f39670w.setBackgroundDrawable(null);
        this.f39670w.setPadding(0, 0, 0, 0);
        this.f39670w.setSingleLine(true);
        this.f39670w.setInputType(163840);
        this.f39670w.setImeOptions(6);
        linearLayout4.addView(this.f39670w, k7.c6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f39662a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f39662a.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f39662a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f39662a.setMaxLines(1);
        this.f39662a.setLines(1);
        this.f39662a.setBackgroundDrawable(null);
        this.f39662a.setPadding(0, 0, 0, 0);
        this.f39662a.setSingleLine(true);
        this.f39662a.setInputType(163872);
        this.f39662a.setImeOptions(6);
        this.f39662a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f39662a.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        this.f39662a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f39662a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f39662a, k7.c6.n(-1, 50));
        this.f39662a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final od1 f38258b;

            {
                this.f38258b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        od1 od1Var = this.f38258b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.f39663b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f38258b.f39664c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39662a.addTextChangedListener(new nd1(this));
        if (z4) {
            this.f39662a.setOnFocusChangeListener(new qd(this, 11));
        }
        org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
        this.f39665e = a9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.k6.f21626b7;
        a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, i13, i14));
        this.f39665e.setVisibility(8);
        this.f39665e.setBottomPadding(0);
        linearLayout2.addView(this.f39665e, k7.c6.n(-1, -2));
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
            this.f39666f = eaVar;
            linearLayout2.addView(eaVar, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context);
            this.h = aaVar;
            aaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, k7.c6.n(-1, -2));
            this.h.setOnClickListener(new hb0(24, this, context));
            org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context);
            this.f39667n = a9Var4;
            a9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f39667n.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f39667n, k7.c6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.I;
        if (tL_theme != null) {
            this.D = true;
            this.f39663b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f39663b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f39662a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f39662a;
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
            if (j6Var2 == j6Var && i6Var2 == i6Var && (d2Var2 = this.f39668r) != null) {
                try {
                    d2Var2.dismiss();
                    this.f39668r = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                org.telegram.ui.ActionBar.k6.t(j6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var3 == j6Var && i6Var3 == i6Var && (d2Var = this.f39668r) != null) {
                try {
                    d2Var.dismiss();
                    this.f39668r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        LinearLayout linearLayout = this.f39671x;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.f21626b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39667n, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39667n, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39665e, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39665e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21878p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39665e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39665e, 262144, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22000w6));
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f39662a;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21787k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21805l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39662a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39663b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39663b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39663b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39670w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39670w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.in inVar = this.f39669s;
        Paint paint = org.telegram.ui.ActionBar.k6.f21781k0;
        int i15 = org.telegram.ui.ActionBar.k6.f21662d7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(inVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39669s, 1, null, org.telegram.ui.ActionBar.k6.f21781k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21820m3, org.telegram.ui.ActionBar.k6.f21893q3}, null, org.telegram.ui.ActionBar.k6.f21918ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21838n3, org.telegram.ui.ActionBar.k6.f21911r3}, null, org.telegram.ui.ActionBar.k6.f21667dc));
        org.telegram.ui.Cells.ea eaVar = this.f39666f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.f21820m3.f21442y;
        int i16 = org.telegram.ui.ActionBar.k6.f21949ta;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, org.telegram.ui.ActionBar.k6.f21893q3.f21442y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21856o3, org.telegram.ui.ActionBar.k6.f21928s3}, null, org.telegram.ui.ActionBar.k6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21874p3, org.telegram.ui.ActionBar.k6.f21944t3}, null, org.telegram.ui.ActionBar.k6.Ba));
        org.telegram.ui.Cells.ea eaVar2 = this.f39666f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.k6.f21856o3.f21442y;
        int i17 = org.telegram.ui.ActionBar.k6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.m6(eaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, org.telegram.ui.ActionBar.k6.f21928s3.f21442y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21685ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21703fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22035y3}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f22053z3}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.A3, org.telegram.ui.ActionBar.k6.C3}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.B3, org.telegram.ui.ActionBar.k6.D3}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21934sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21611ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21648cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21666db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21613ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21702fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21847nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21865od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39666f, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21846nb));
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
            this.f39662a.requestFocus();
            AndroidUtilities.showKeyboard(this.f39662a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !this.F) {
            this.f39662a.requestFocus();
            AndroidUtilities.showKeyboard(this.f39662a);
        }
    }
}
