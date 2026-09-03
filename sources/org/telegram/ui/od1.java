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
    public b11 C;
    public boolean D;
    public SpannableStringBuilder E;
    public final boolean F;
    public final org.telegram.ui.ActionBar.i6 G;
    public final org.telegram.ui.ActionBar.h6 H;
    public final TLRPC.TL_theme I;
    public EditTextBoldCursor f36755a;
    public EditTextBoldCursor f36756b;
    public org.telegram.ui.ActionBar.w0 f36757c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 e;
    public org.telegram.ui.Cells.da f36758f;
    public org.telegram.ui.Cells.z9 h;
    public org.telegram.ui.Cells.z8 f36759n;
    public org.telegram.ui.ActionBar.d2 f36760r;
    public org.telegram.ui.Components.gn f36761s;
    public org.telegram.ui.Cells.l4 v;
    public EditTextBoldCursor f36762w;
    public LinearLayout f36763x;
    public int f36764y;

    public od1(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z4) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.G = i6Var;
        this.H = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f19750r;
        } else {
            tL_theme = i6Var.C;
        }
        this.I = tL_theme;
        if (h6Var != null) {
            i10 = h6Var.f19752t;
        } else {
            i10 = i6Var.B;
        }
        this.currentAccount = i10;
        this.F = z4;
    }

    public static void U(od1 od1Var, int i10) {
        ConnectionsManager.getInstance(od1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(od1 od1Var, TLRPC.TL_theme tL_theme) {
        try {
            od1Var.f36760r.dismiss();
            od1Var.f36760r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.j6.C1(od1Var.G, od1Var.H, tL_theme, od1Var.currentAccount, false);
        od1Var.finishFragment();
    }

    public static void W(od1 od1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            od1Var.f36760r.dismiss();
            od1Var.f36760r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.z4.f0(od1Var.currentAccount, tL_error, od1Var, updatetheme, new Object[0]);
    }

    public static void X(od1 od1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        od1Var.f36764y = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(createtheme, new ub0(25, od1Var, str), 2);
    }

    public static void Y(od1 od1Var) {
        org.telegram.ui.ActionBar.i6 i6Var = od1Var.G;
        TLRPC.TL_theme tL_theme = od1Var.I;
        if (!od1Var.Z(od1Var.f36755a.getText().toString(), true) || od1Var.getParentActivity() == null) {
            return;
        }
        if (od1Var.f36756b.length() == 0) {
            org.telegram.ui.Components.z4.u0(od1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (od1Var.F) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
            od1Var.f36760r = d2Var;
            d2Var.setOnCancelListener(new Object());
            od1Var.f36760r.show();
            String obj = od1Var.f36756b.getText().toString();
            tL_theme.title = obj;
            i6Var.f19780a = obj;
            i6Var.C.slug = od1Var.f36755a.getText().toString();
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
            String obj2 = od1Var.f36755a.getText().toString();
            String obj3 = od1Var.f36756b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                od1Var.finishFragment();
                return;
            }
            od1Var.f36760r = new org.telegram.ui.ActionBar.d2(od1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f19230id = tL_theme.f19296id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(od1Var.currentAccount).sendRequest(updatetheme, new ub0(26, od1Var, updatetheme), 2);
            ConnectionsManager.getInstance(od1Var.currentAccount).bindRequestToGuid(sendRequest, od1Var.classGuid);
            od1Var.f36760r.setOnCancelListener(new lh.w(od1Var, sendRequest, 9));
            od1Var.f36760r.show();
        }
    }

    public final boolean Z(String str, boolean z4) {
        b11 b11Var = this.C;
        if (b11Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b11Var);
            this.C = null;
            this.B = null;
            if (this.f36764y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f36764y, true);
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
                        a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z4) {
                            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z4) {
                    org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z4) {
                TLRPC.TL_theme tL_theme = this.I;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.j6.f20219w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.j6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.B = str;
                b11 b11Var2 = new b11(19, this, str);
                this.C = b11Var2;
                AndroidUtilities.runOnUIThread(b11Var2, 300L);
            }
            return true;
        } else if (z4) {
            org.telegram.ui.Components.z4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.j6.f20097p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z4 = this.F;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z4) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.j6.f19846b7));
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
        this.f36757c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new oh.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f36763x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f36763x.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        linearLayout2.addView(this.f36763x, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.v = l4Var;
        l4Var.setText(LocaleController.getString(R.string.Info));
        this.f36763x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36756b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f36756b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f36756b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f36756b.setMaxLines(1);
        this.f36756b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f36756b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f36756b.setBackgroundDrawable(null);
        this.f36756b.setPadding(0, 0, 0, 0);
        this.f36756b.setSingleLine(true);
        this.f36756b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f36756b.setInputType(163872);
        this.f36756b.setImeOptions(6);
        this.f36756b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f36756b.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f36756b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36756b.setCursorWidth(1.5f);
        this.f36763x.addView(this.f36756b, k7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f36756b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final od1 f35513b;

            {
                this.f35513b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        od1 od1Var = this.f35513b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.f36756b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f35513b.f36757c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.gn gnVar = new org.telegram.ui.Components.gn(context, 24);
        this.f36761s = gnVar;
        this.f36763x.addView(gnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f36763x.addView(linearLayout4, k7.b6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f36762w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f36762w.setTextSize(1, 18.0f);
        this.f36762w.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f36762w.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f36762w.setMaxLines(1);
        this.f36762w.setLines(1);
        this.f36762w.setEnabled(false);
        this.f36762w.setBackgroundDrawable(null);
        this.f36762w.setPadding(0, 0, 0, 0);
        this.f36762w.setSingleLine(true);
        this.f36762w.setInputType(163840);
        this.f36762w.setImeOptions(6);
        linearLayout4.addView(this.f36762w, k7.b6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f36755a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f36755a.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f36755a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f36755a.setMaxLines(1);
        this.f36755a.setLines(1);
        this.f36755a.setBackgroundDrawable(null);
        this.f36755a.setPadding(0, 0, 0, 0);
        this.f36755a.setSingleLine(true);
        this.f36755a.setInputType(163872);
        this.f36755a.setImeOptions(6);
        this.f36755a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f36755a.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f36755a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f36755a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f36755a, k7.b6.n(-1, 50));
        this.f36755a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final od1 f35513b;

            {
                this.f35513b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        od1 od1Var = this.f35513b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(od1Var.f36756b);
                            return true;
                        }
                        od1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (w0Var = this.f35513b.f36757c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f36755a.addTextChangedListener(new nd1(this));
        if (z4) {
            this.f36755a.setOnFocusChangeListener(new sd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.e = z8Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.j6.f19846b7;
        z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, k7.b6.n(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.jv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.K6, false));
        if (z4) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.E = replaceTags;
            z8Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, k7.b6.n(-1, -2));
        if (z4) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.da daVar = new org.telegram.ui.Cells.da(context, this.parentLayout, 1);
            this.f36758f = daVar;
            linearLayout2.addView(daVar, k7.b6.n(-1, -2));
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context);
            this.h = z9Var;
            z9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, k7.b6.n(-1, -2));
            this.h.setOnClickListener(new ib0(24, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f36759n = z8Var4;
            z8Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f36759n.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f36759n, k7.b6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.I;
        if (tL_theme != null) {
            this.D = true;
            this.f36756b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f36756b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f36755a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f36755a;
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
            if (i6Var2 == i6Var && h6Var2 == h6Var && (d2Var2 = this.f36760r) != null) {
                try {
                    d2Var2.dismiss();
                    this.f36760r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.j6.t(i6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (i6Var3 == i6Var && h6Var3 == h6Var && (d2Var = this.f36760r) != null) {
                try {
                    d2Var.dismiss();
                    this.f36760r = null;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        LinearLayout linearLayout = this.f36763x;
        int i10 = org.telegram.ui.ActionBar.j6.f19881d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.v, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36759n, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36759n, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20097p7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.e, 262144, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20219w6));
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f36755a;
        int i14 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20006k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20024l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36755a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36756b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36756b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36756b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36762w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36762w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.gn gnVar = this.f36761s;
        Paint paint = org.telegram.ui.ActionBar.j6.f20000k0;
        int i15 = org.telegram.ui.ActionBar.j6.f19882d7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36761s, 1, null, org.telegram.ui.ActionBar.j6.f20000k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20039m3, org.telegram.ui.ActionBar.j6.f20112q3}, null, org.telegram.ui.ActionBar.j6.f20136ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20057n3, org.telegram.ui.ActionBar.j6.f20129r3}, null, org.telegram.ui.ActionBar.j6.f19887dc));
        org.telegram.ui.Cells.da daVar = this.f36758f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20039m3.f19709y;
        int i16 = org.telegram.ui.ActionBar.j6.f20168ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(daVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, org.telegram.ui.ActionBar.j6.f20112q3.f19709y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20075o3, org.telegram.ui.ActionBar.j6.f20147s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20093p3, org.telegram.ui.ActionBar.j6.f20163t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Cells.da daVar2 = this.f36758f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f20075o3.f19709y;
        int i17 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(daVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, org.telegram.ui.ActionBar.j6.f20147s3.f19709y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19904ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19922fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20253y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20271z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20153sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19831ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19868cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19886db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19833ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19921fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20066nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20084od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f36758f, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20065nb));
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
            this.f36755a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36755a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !this.F) {
            this.f36755a.requestFocus();
            AndroidUtilities.showKeyboard(this.f36755a);
        }
    }
}
