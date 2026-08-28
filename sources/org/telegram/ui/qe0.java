package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qe0 extends org.telegram.ui.Components.cv0 implements org.telegram.ui.Components.d40 {
    public String A;
    public String B;
    public Bundle C;
    public boolean D;
    public final org.telegram.ui.Components.mi0 E;
    public final org.telegram.ui.Components.mi0 F;
    public boolean G;
    public final org.telegram.ui.Components.e40 H;
    public TLRPC.FileLocation I;
    public TLRPC.FileLocation J;
    public final fg0 K;
    public final org.telegram.ui.Components.fc0 f41771a;
    public final org.telegram.ui.Components.fc0 f41772b;
    public final EditTextBoldCursor f41773c;
    public final EditTextBoldCursor d;
    public final ih.d4 f41774e;
    public final org.telegram.ui.Components.z8 f41775f;
    public final kh.h6 h;
    public final fd f41776n;
    public final gd f41777r;
    public AnimatorSet f41778s;
    public final TextView v;
    public final TextView f41779w;
    public final TextView f41780x;
    public final TextView f41781y;

    public qe0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        float f10;
        this.K = fg0Var;
        this.D = false;
        this.G = true;
        setOrientation(1);
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, false, false);
        this.H = e40Var;
        e40Var.D = true;
        e40Var.F = false;
        e40Var.C = false;
        e40Var.G = false;
        e40Var.f27909a = fg0Var;
        e40Var.f27910b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, g7.e6.q(78, 78, 1));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.f41775f = z8Var;
        ih.d4 d4Var = new ih.d4(this, context, 9);
        this.f41774e = d4Var;
        d4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        z8Var.g(13);
        z8Var.n(5L, null, null);
        d4Var.setImageDrawable(z8Var);
        frameLayout.addView(d4Var, g7.e6.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kh.h6 h6Var = new kh.h6(this, context, paint, 12);
        this.h = h6Var;
        frameLayout.addView(h6Var, g7.e6.c(-1.0f, -1));
        h6Var.setOnClickListener(new View.OnClickListener(this) {
            public final qe0 f40120b;

            {
                this.f40120b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        qe0 qe0Var = this.f40120b;
                        fd fdVar = qe0Var.f41776n;
                        org.telegram.ui.Components.mi0 mi0Var = qe0Var.E;
                        org.telegram.ui.Components.e40 e40Var2 = qe0Var.H;
                        if (qe0Var.I != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e40Var2.o(z10, new bd0(qe0Var, 1), new r5(qe0Var, 8), 0);
                        qe0Var.G = false;
                        fdVar.setAnimation(mi0Var);
                        mi0Var.K(0);
                        mi0Var.N(43);
                        fdVar.d();
                        return;
                    default:
                        qe0 qe0Var2 = this.f40120b;
                        if (qe0Var2.K.R.getTag() == null) {
                            qe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        int i10 = R.raw.camera;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i10, String.valueOf(i10), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.E = mi0Var;
        int i11 = R.raw.camera_wait;
        this.F = new org.telegram.ui.Components.mi0(i11, String.valueOf(i11), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        fd fdVar = new fd(this, context, 3);
        this.f41776n = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        fdVar.setAnimation(mi0Var);
        fdVar.setEnabled(false);
        fdVar.setClickable(false);
        frameLayout.addView(fdVar, g7.e6.c(-1.0f, -1));
        fdVar.addOnAttachStateChangeListener(new pe0(this));
        gd gdVar = new gd(this, context, 2);
        this.f41777r = gdVar;
        gdVar.setSize(AndroidUtilities.dp(30.0f));
        gdVar.setProgressColor(-1);
        frameLayout.addView(gdVar, g7.e6.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f41781y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, g7.e6.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, g7.e6.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, g7.e6.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
        this.f41771a = fc0Var;
        fc0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41773c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final qe0 f40404b;

            {
                this.f40404b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fc0 fc0Var2 = this.f40404b.f41771a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        fc0Var2.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.fc0 fc0Var3 = this.f40404b.f41772b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        fc0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        fc0Var.e(editTextBoldCursor);
        fc0Var.addView(editTextBoldCursor, g7.e6.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qe0 f40708b;

            {
                this.f40708b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i12, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        qe0 qe0Var = this.f40708b;
                        if (i12 == 5) {
                            qe0Var.d.requestFocus();
                            return true;
                        }
                        qe0Var.getClass();
                        return false;
                    default:
                        qe0 qe0Var2 = this.f40708b;
                        qe0Var2.getClass();
                        if (i12 != 6 && i12 != 5) {
                            return false;
                        }
                        qe0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.fc0 fc0Var2 = new org.telegram.ui.Components.fc0(context, null);
        this.f41772b = fc0Var2;
        fc0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final qe0 f40404b;

            {
                this.f40404b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.fc0 fc0Var22 = this.f40404b.f41771a;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        fc0Var22.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.fc0 fc0Var3 = this.f40404b.f41772b;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        fc0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        fc0Var2.e(editTextBoldCursor2);
        fc0Var2.addView(editTextBoldCursor2, g7.e6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final qe0 f40708b;

            {
                this.f40708b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i12, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        qe0 qe0Var = this.f40708b;
                        if (i12 == 5) {
                            qe0Var.d.requestFocus();
                            return true;
                        }
                        qe0Var.getClass();
                        return false;
                    default:
                        qe0 qe0Var2 = this.f40708b;
                        qe0Var2.getClass();
                        if (i12 != 6 && i12 != 5) {
                            return false;
                        }
                        qe0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(fg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            fc0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            fc0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(fc0Var, g7.e6.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(fc0Var2, g7.e6.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            fc0Var.setText(LocaleController.getString(R.string.FirstName));
            fc0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(fc0Var, g7.e6.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(fc0Var2, g7.e6.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f41779w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView3.setGravity(i9 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, g7.e6.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final qe0 f40120b;

            {
                this.f40120b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        qe0 qe0Var = this.f40120b;
                        fd fdVar2 = qe0Var.f41776n;
                        org.telegram.ui.Components.mi0 mi0Var2 = qe0Var.E;
                        org.telegram.ui.Components.e40 e40Var2 = qe0Var.H;
                        if (qe0Var.I != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e40Var2.o(z10, new bd0(qe0Var, 1), new r5(qe0Var, 8), 0);
                        qe0Var.G = false;
                        fdVar2.setAnimation(mi0Var2);
                        mi0Var2.K(0);
                        mi0Var2.N(43);
                        fdVar2.d();
                        return;
                    default:
                        qe0 qe0Var2 = this.f40120b;
                        if (qe0Var2.K.R.getTag() == null) {
                            qe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, g7.e6.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f41780x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView4.setTextSize(1, f10);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, g7.e6.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        org.telegram.ui.Cells.e3.s2(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new kh.lb(this, 6), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new jq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        fg0 fg0Var = this.K;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f22702a.P = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ke0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            fg0Var.showDialog(alertDialog$Builder.f22702a);
            return false;
        }
        fg0Var.k1(true, true);
        this.D = false;
        this.C = null;
        return true;
    }

    @Override
    public final void d() {
        this.D = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        int i9;
        if (this.D) {
            return;
        }
        fg0 fg0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f38275l0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f41773c;
        if (editTextBoldCursor.length() == 0) {
            fg0.U0(fg0Var, this.f41771a, true);
            return;
        }
        this.D = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.B;
        tL_auth_signUp.phone_number = this.A;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        fg0Var.n1(0, true);
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f41780x;
        if (textView != null) {
            if (this.K.f38268f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f41773c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new bd0(this, 3), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.C = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.K.f38275l0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f41773c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f41773c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        fg0 fg0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f38275l0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            fg0Var.f38275l0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.C;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f41773c.setText("");
        this.d.setText("");
        this.A = bundle.getString("phoneFormated");
        this.B = bundle.getString("phoneHash");
        this.C = bundle;
    }

    @Override
    public final void n() {
        this.f41775f.invalidateSelf();
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.f41781y.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int i10 = org.telegram.ui.ActionBar.f6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        EditTextBoldCursor editTextBoldCursor = this.f41773c;
        editTextBoldCursor.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.f6.f23144l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f41779w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        int w04 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        TextView textView = this.f41780x;
        textView.setTextColor(w04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J6, false));
        this.f41771a.f();
        this.f41772b.f();
    }

    public final void o() {
        this.f41780x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        fd fdVar = this.f41776n;
        if (fdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f41778s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f41778s = null;
        }
        gd gdVar = this.f41777r;
        if (z10) {
            this.f41778s = new AnimatorSet();
            fdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f41778s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, property, 1.0f), ObjectAnimator.ofFloat(gdVar, property, 0.0f));
            this.f41778s.setDuration(180L);
            this.f41778s.addListener(new bc0(this, 1));
            this.f41778s.start();
            return;
        }
        fdVar.setAlpha(1.0f);
        fdVar.setVisibility(0);
        gdVar.setAlpha(0.0f);
        gdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        fg0 fg0Var = this.K;
        if (fg0Var.f38275l0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ke0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fg0Var.f38275l0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, fg0Var.f38275l0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.P = spannableStringBuilder;
        fg0Var.showDialog(c2Var);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void D(float f10) {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}
