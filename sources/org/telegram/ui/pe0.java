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
public final class pe0 extends org.telegram.ui.Components.ow0 implements org.telegram.ui.Components.d50 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.uj0 I;
    public final org.telegram.ui.Components.uj0 J;
    public boolean K;
    public final org.telegram.ui.Components.e50 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final fg0 O;
    public final org.telegram.ui.Components.sd0 f40092a;
    public final org.telegram.ui.Components.sd0 f40093b;
    public final EditTextBoldCursor f40094c;
    public final EditTextBoldCursor d;
    public final ci.k4 e;
    public final org.telegram.ui.Components.h9 f40095f;
    public final ei.g6 h;
    public final ld f40096n;
    public final md f40097r;
    public AnimatorSet f40098s;
    public final TextView v;
    public final TextView f40099w;
    public final TextView f40100x;
    public final TextView f40101y;

    public pe0(fg0 fg0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = fg0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, false, false);
        this.L = e50Var;
        e50Var.H = true;
        e50Var.J = false;
        e50Var.G = false;
        e50Var.K = false;
        e50Var.f25805a = fg0Var;
        e50Var.f25806b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.q(78, 78, 1));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.f40095f = h9Var;
        ci.k4 k4Var = new ci.k4(this, context, 10);
        this.e = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        h9Var.g(13);
        h9Var.n(5L, null, null);
        k4Var.setImageDrawable(h9Var);
        frameLayout.addView(k4Var, w7.z5.d(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ei.g6 g6Var = new ei.g6(this, context, paint, 12);
        this.h = g6Var;
        frameLayout.addView(g6Var, w7.z5.d(-1.0f, -1));
        g6Var.setOnClickListener(new View.OnClickListener(this) {
            public final pe0 f38505b;

            {
                this.f38505b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f38505b;
                        ld ldVar = pe0Var.f40096n;
                        org.telegram.ui.Components.uj0 uj0Var = pe0Var.I;
                        org.telegram.ui.Components.e50 e50Var2 = pe0Var.L;
                        if (pe0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e50Var2.n(z10, new bd0(pe0Var, 1), new w5(pe0Var, 8), 0);
                        pe0Var.K = false;
                        ldVar.setAnimation(uj0Var);
                        uj0Var.M(0);
                        uj0Var.P(43);
                        ldVar.d();
                        return;
                    default:
                        pe0 pe0Var2 = this.f38505b;
                        if (pe0Var2.O.V.getTag() == null) {
                            pe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = uj0Var;
        this.J = new org.telegram.ui.Components.uj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        ld ldVar = new ld(this, context, 3);
        this.f40096n = ldVar;
        ldVar.setScaleType(ImageView.ScaleType.CENTER);
        ldVar.setAnimation(uj0Var);
        ldVar.setEnabled(false);
        ldVar.setClickable(false);
        frameLayout.addView(ldVar, w7.z5.d(-1.0f, -1));
        ldVar.addOnAttachStateChangeListener(new oe0(this));
        md mdVar = new md(this, context, 2);
        this.f40097r = mdVar;
        mdVar.setSize(AndroidUtilities.dp(30.0f));
        mdVar.setProgressColor(-1);
        frameLayout.addView(mdVar, w7.z5.d(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f40101y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, w7.z5.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, w7.z5.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
        this.f40092a = sd0Var;
        sd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f40094c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pe0 f38860b;

            {
                this.f38860b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var2 = this.f38860b.f40092a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.f38860b.f40093b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        sd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, w7.z5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pe0 f39171b;

            {
                this.f39171b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f39171b;
                        if (i11 == 5) {
                            pe0Var.d.requestFocus();
                            return true;
                        }
                        pe0Var.getClass();
                        return false;
                    default:
                        pe0 pe0Var2 = this.f39171b;
                        pe0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        pe0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.sd0 sd0Var2 = new org.telegram.ui.Components.sd0(context, null);
        this.f40093b = sd0Var2;
        sd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final pe0 f38860b;

            {
                this.f38860b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var22 = this.f38860b.f40092a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.f38860b.f40093b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        sd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var2.e(editTextBoldCursor2);
        sd0Var2.addView(editTextBoldCursor2, w7.z5.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final pe0 f39171b;

            {
                this.f39171b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f39171b;
                        if (i11 == 5) {
                            pe0Var.d.requestFocus();
                            return true;
                        }
                        pe0Var.getClass();
                        return false;
                    default:
                        pe0 pe0Var2 = this.f39171b;
                        pe0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        pe0Var2.h(null);
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
            sd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            sd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(sd0Var, w7.z5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(sd0Var2, w7.z5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            sd0Var.setText(LocaleController.getString(R.string.FirstName));
            sd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(sd0Var, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 0.0f, -1, 48));
            frameLayout2.addView(sd0Var2, w7.z5.a(-2.0f, 8.0f, 82.0f, 8.0f, 0.0f, -1, 48));
        }
        TextView textView3 = new TextView(context);
        this.f40099w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView3.setGravity(i10 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, w7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final pe0 f38505b;

            {
                this.f38505b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        pe0 pe0Var = this.f38505b;
                        ld ldVar2 = pe0Var.f40096n;
                        org.telegram.ui.Components.uj0 uj0Var2 = pe0Var.I;
                        org.telegram.ui.Components.e50 e50Var2 = pe0Var.L;
                        if (pe0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e50Var2.n(z10, new bd0(pe0Var, 1), new w5(pe0Var, 8), 0);
                        pe0Var.K = false;
                        ldVar2.setAnimation(uj0Var2);
                        uj0Var2.M(0);
                        uj0Var2.P(43);
                        ldVar2.d();
                        return;
                    default:
                        pe0 pe0Var2 = this.f38505b;
                        if (pe0Var2.O.V.getTag() == null) {
                            pe0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.z5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f40100x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, w7.z5.a(56.0f, 14.0f, 0.0f, 70.0f, 32.0f, -2, 83));
        m.g3.r(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new ei.kb(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new lq(this, photoSize2, photoSize, 29));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        fg0 fg0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f20601a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new je0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            fg0Var.showDialog(alertDialog$Builder.f20601a);
            return false;
        }
        fg0Var.k1(true, true);
        this.H = false;
        this.G = null;
        return true;
    }

    @Override
    public final void d() {
        this.H = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public lu0 getCloseIntoObject() {
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
        int i10;
        if (this.H) {
            return;
        }
        fg0 fg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f36922p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f40094c;
        if (editTextBoldCursor.length() == 0) {
            fg0.U0(fg0Var, this.f40092a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        fg0Var.n1(0, true);
        i10 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new m(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f40100x;
        if (textView != null) {
            if (this.O.f36911f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f40094c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new bd0(this, 3), fg0.f36902t0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.G = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.O.f36922p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f40094c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f40094c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        fg0 fg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fg0Var.f36922p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            fg0Var.f36922p0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f40094c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    @Override
    public final void n() {
        this.f40095f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f40101y.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f40094c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.h6.f21130l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.f40099w.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        int x04 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        TextView textView = this.f40100x;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
        this.f40092a.f();
        this.f40093b.f();
    }

    public final void o() {
        this.f40100x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        ld ldVar = this.f40096n;
        if (ldVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f40098s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f40098s = null;
        }
        md mdVar = this.f40097r;
        if (z10) {
            this.f40098s = new AnimatorSet();
            ldVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f40098s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ldVar, property, 1.0f), ObjectAnimator.ofFloat(mdVar, property, 0.0f));
            this.f40098s.setDuration(180L);
            this.f40098s.addListener(new bc0(this, 1));
            this.f40098s.start();
            return;
        }
        ldVar.setAlpha(1.0f);
        ldVar.setVisibility(0);
        mdVar.setAlpha(0.0f);
        mdVar.setVisibility(4);
    }

    public final void q(boolean z10) {
        fg0 fg0Var = this.O;
        if (fg0Var.f36922p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
        alertDialog$Builder.f20601a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new je0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new je0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fg0Var.f36922p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, fg0Var.f36922p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.T = spannableStringBuilder;
        fg0Var.showDialog(b2Var);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void F(float f7) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}
