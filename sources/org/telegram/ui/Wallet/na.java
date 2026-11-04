package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.ui.fu0;
public final class na extends FrameLayout {
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final j1 I;
    public final i1 J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final TextView[] O;
    public final EditText f42960a;
    public final TextView f42961b;
    public final TextView f42962c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.e6 f42963e;
    public Runnable f42964f;
    public Runnable h;
    public Runnable f42965n;
    public Runnable f42966r;
    public PopupWindow f42967s;
    public boolean f42968w;
    public LinearLayout f42969x;
    public ImageView f42970y;

    public na(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f10;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.I = new j1(this, 1);
        this.J = new i1(this, 2);
        this.O = new TextView[3];
        this.f42963e = e6Var;
        int L = org.telegram.messenger.g0.L(16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f27824a7;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i10, e6Var)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.5f, i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, e6Var);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        TextView textView = new TextView(context);
        this.f42961b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i3 + 1) + ".");
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A6, e6Var);
        addView(textView, mf.d(22, -2.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f42960a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, e6Var);
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                na naVar = na.this;
                if (z11) {
                    naVar.setError(false);
                    naVar.e();
                    String lowerCase = naVar.f42960a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        naVar.a();
                    } else {
                        naVar.f(lowerCase);
                    }
                } else {
                    naVar.a();
                    if (!naVar.f42968w && !naVar.b()) {
                        naVar.setError(true);
                    }
                }
                naVar.d();
            }
        });
        editText.addTextChangedListener(new ma(this, 0));
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 8.0f;
        }
        addView(editText, mf.d(-1, -1.0f, 16, 30.0f, 0.0f, f10, 0.0f));
        editText.setOnEditorActionListener(new r8(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, mf.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f42962c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            org.telegram.messenger.camera.q.o(textView2, org.telegram.ui.ActionBar.k6.f28121q6, e6Var, null, 2131743065);
            textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            int L3 = org.telegram.messenger.g0.L(28.0f);
            int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
            ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            textView2.setBackground(d03);
            org.telegram.ui.ActionBar.r6.k(textView2, d03, N, null, e6Var);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final na f42763b;

                {
                    this.f42763b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            na naVar = this.f42763b;
                            EditText editText2 = naVar.f42960a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) naVar.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = naVar.h;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        default:
                            EditText editText3 = this.f42763b.f42960a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, mf.e(-2, -2, 17));
        } else {
            this.f42962c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28273y6, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setImageResource(2131231241);
        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 3, -1);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N2, e6Var);
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final na f42763b;

            {
                this.f42763b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        na naVar = this.f42763b;
                        EditText editText2 = naVar.f42960a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) naVar.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = naVar.h;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    default:
                        EditText editText3 = this.f42763b.f42960a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, mf.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f42967s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f42967s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f42960a.getText().toString().trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return true;
        }
        for (String str : WalletEngine2.getMnemonicWordlist()) {
            if (str.equals(lowerCase)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        int i3;
        int height;
        float f10;
        Rect rect = this.E;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.G;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.H;
        getLocationInWindow(iArr2);
        Rect rect2 = this.F;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f42967s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int L = org.telegram.messenger.g0.L(9.0f);
        if (getHeight() + iArr[1] + L + measuredHeight > rect.bottom) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i3 != 0 && (iArr[1] - L) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f42970y) != i3) {
            linearLayout.removeView(this.f42970y);
            linearLayout.addView(this.f42970y, i3);
            ImageView imageView = this.f42970y;
            if (i3 != 0) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            imageView.setRotation(f10);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i3 != 0) {
            height = (iArr[1] - L) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + L;
        }
        int i10 = (max + iArr2[0]) - iArr[0];
        int i11 = (height + iArr2[1]) - iArr[1];
        if (this.f42967s.isShowing()) {
            if (this.K != i10 || this.L != i11 || this.M != measuredWidth || this.N != measuredHeight) {
                this.f42967s.update(i10, i11, measuredWidth, measuredHeight);
            }
        } else {
            this.f42967s.setWidth(measuredWidth);
            this.f42967s.setHeight(measuredHeight);
            this.f42967s.showAtLocation(this, 51, i10, i11);
            getViewTreeObserver().addOnGlobalLayoutListener(this.I);
            getViewTreeObserver().addOnScrollChangedListener(this.J);
        }
        this.K = i10;
        this.L = i11;
        this.M = measuredWidth;
        this.N = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.na.d():void");
    }

    public final void e() {
        boolean z10;
        int i3;
        if (!this.f42968w && this.f42960a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f42968w) {
            i3 = org.telegram.ui.ActionBar.k6.f28122q7;
        } else if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.G6;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.A6;
        }
        org.telegram.ui.ActionBar.r6.V(this.f42961b, i3, this.f42963e);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i3;
        if (this.f42960a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : WalletEngine2.getMnemonicWordlist()) {
                if (str2.startsWith(str) && !str2.equals(str)) {
                    arrayList.add(str2);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                a();
                return;
            }
            Context context = getContext();
            PopupWindow popupWindow = this.f42967s;
            TextView[] textViewArr = this.O;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f42967s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f42967s.setFocusable(false);
                this.f42967s.setInputMethodMode(1);
                this.f42967s.setBackgroundDrawable(null);
                this.f42967s.setElevation(org.telegram.messenger.g0.L(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f42970y = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f42970y.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f42970y.setImageResource(2131232838);
                linearLayout.addView(this.f42970y, mf.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f42969x = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f42969x.setGravity(16);
                this.f42969x.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
                this.f42969x.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(8.0f));
                this.f42969x.setBackground(gradientDrawable);
                for (int i10 = 0; i10 < 3; i10++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(org.telegram.messenger.g0.L(140.0f));
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new fu0(this, i10, 2));
                    textViewArr[i10] = textView;
                    LinearLayout linearLayout3 = this.f42969x;
                    if (i10 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 12;
                    }
                    linearLayout3.addView(textView, mf.t(-2, -2, 16, i3, 0, 0, 0));
                }
                linearLayout.addView(this.f42969x, mf.o(-2, -2));
                this.f42967s.setContentView(linearLayout);
                this.f42967s.setWidth(-2);
                this.f42967s.setHeight(-2);
                this.f42967s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        na naVar = na.this;
                        naVar.getViewTreeObserver().removeOnGlobalLayoutListener(naVar.I);
                        naVar.getViewTreeObserver().removeOnScrollChangedListener(naVar.J);
                    }
                });
            }
            for (int i11 = 0; i11 < 3; i11++) {
                TextView textView2 = textViewArr[i11];
                if (i11 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i11);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i11 == 0) {
                        shapeDrawable = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), 452984831);
                    } else {
                        shapeDrawable = null;
                    }
                    textView2.setBackground(shapeDrawable);
                    textView2.setVisibility(0);
                } else {
                    textView2.setText("");
                    textView2.setBackground(null);
                    textView2.setVisibility(8);
                }
            }
            c();
            return;
        }
        a();
    }

    public String getWord() {
        return this.f42960a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(256.0f), View.MeasureSpec.getSize(i3)), View.MeasureSpec.getMode(i3)), i10);
    }

    public void setError(boolean z10) {
        if (this.f42968w != z10) {
            this.f42968w = z10;
            ImageView imageView = this.d;
            EditText editText = this.f42960a;
            org.telegram.ui.ActionBar.e6 e6Var = this.f42963e;
            if (z10) {
                int L = org.telegram.messenger.g0.L(16.0f);
                int i3 = org.telegram.ui.ActionBar.k6.f28141r7;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.24f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
                org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.24f, i3);
                setBackground(d02);
                org.telegram.ui.ActionBar.r6.k(this, d02, L2, null, e6Var);
                int i10 = org.telegram.ui.ActionBar.k6.f28122q7;
                org.telegram.ui.ActionBar.r6.V(this.f42961b, i10, e6Var);
                org.telegram.ui.ActionBar.r6.V(editText, i10, e6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.SRC_IN);
                }
                org.telegram.messenger.g0.H3(this);
            } else {
                int L3 = org.telegram.messenger.g0.L(16.0f);
                int i11 = org.telegram.ui.ActionBar.k6.f27824a7;
                ShapeDrawable d03 = org.telegram.ui.ActionBar.k6.d0(L3, org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(i11, e6Var)));
                org.telegram.ui.ActionBar.n6 L4 = org.telegram.ui.ActionBar.r6.L(0.5f, i11);
                setBackground(d03);
                org.telegram.ui.ActionBar.r6.k(this, d03, L4, null, e6Var);
                org.telegram.ui.ActionBar.r6.V(editText, org.telegram.ui.ActionBar.k6.G6, e6Var);
                if (imageView != null) {
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28273y6, e6Var, PorterDuff.Mode.SRC_IN);
                }
                e();
                d();
            }
            Runnable runnable = this.f42965n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f42965n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f42966r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f42964f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f42960a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
