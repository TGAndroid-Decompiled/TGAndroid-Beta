package org.telegram.ui.Wallet;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class i9 extends FrameLayout {
    public final Rect E;
    public final int[] F;
    public final int[] G;
    public final o1 H;
    public final n1 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final TextView[] N;
    public final EditText f35096a;
    public final TextView f35097b;
    public final TextView f35098c;
    public final ImageView d;
    public final org.telegram.ui.ActionBar.e6 f35099e;
    public Runnable f35100f;
    public Runnable h;
    public Runnable f35101n;
    public Runnable f35102r;
    public PopupWindow f35103s;
    public boolean v;
    public LinearLayout f35104w;
    public ImageView f35105x;
    public final Rect f35106y;

    public i9(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        float f7;
        this.f35106y = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.H = new o1(this, 1);
        this.I = new n1(this, 1);
        this.N = new TextView[3];
        this.f35099e = e6Var;
        setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, e6Var))));
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(11.0f), 0);
        TextView textView = new TextView(context);
        this.f35097b = textView;
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        textView.setText((i10 + 1) + ".");
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 8.0f, 0.0f, 22, 16));
        setClipChildren(false);
        EditText editText = new EditText(context);
        this.f35096a = editText;
        editText.setTextSize(16.0f);
        editText.setGravity(16);
        editText.setBackground(null);
        editText.setPadding(0, AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f));
        editText.setIncludeFontPadding(false);
        editText.setSingleLine(true);
        editText.setImeOptions(5);
        editText.setTypeface(Typeface.DEFAULT);
        editText.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, e6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        editText.setHint("");
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public final void onFocusChange(View view, boolean z11) {
                i9 i9Var = i9.this;
                if (z11) {
                    i9Var.setError(false);
                    i9Var.e();
                    String lowerCase = i9Var.f35096a.getText().toString().trim().toLowerCase();
                    if (lowerCase.isEmpty()) {
                        i9Var.a();
                    } else {
                        i9Var.f(lowerCase);
                    }
                } else {
                    i9Var.a();
                    if (!i9Var.v && !i9Var.b()) {
                        i9Var.setError(true);
                    }
                }
                i9Var.d();
            }
        });
        editText.addTextChangedListener(new ci.h2(this, 17));
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 8.0f;
        }
        addView(editText, w7.x5.a(-1.0f, 30.0f, 0.0f, f7, 0.0f, -1, 16));
        editText.setOnEditorActionListener(new r7(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.x5.e(-2, -2, 21));
        if (z10) {
            TextView textView2 = new TextView(context);
            this.f35098c = textView2;
            textView2.setTextSize(14.0f);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.q6, e6Var));
            textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.WalletPaste, textView2), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            textView2.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, e6Var)));
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final i9 f35035b;

                {
                    this.f35035b = this;
                }

                @Override
                public final void onClick(View view) {
                    CharSequence text;
                    switch (r2) {
                        case 0:
                            i9 i9Var = this.f35035b;
                            EditText editText2 = i9Var.f35096a;
                            try {
                                ClipboardManager clipboardManager = (ClipboardManager) i9Var.getContext().getSystemService("clipboard");
                                if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                    editText2.setText(text.toString().trim());
                                    editText2.setSelection(editText2.getText().length());
                                    Runnable runnable = i9Var.h;
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
                            EditText editText3 = this.f35035b.f35096a;
                            editText3.setText("");
                            editText3.setSelection(0);
                            return;
                    }
                }
            });
            frameLayout.addView(textView2, w7.x5.e(-2, -2, 17));
        } else {
            this.f35098c = null;
        }
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setImageResource(R.drawable.ic_ab_close);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, e6Var), 3, -1));
        imageView.setVisibility(8);
        imageView.setFocusable(false);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f35035b;

            {
                this.f35035b = this;
            }

            @Override
            public final void onClick(View view) {
                CharSequence text;
                switch (r2) {
                    case 0:
                        i9 i9Var = this.f35035b;
                        EditText editText2 = i9Var.f35096a;
                        try {
                            ClipboardManager clipboardManager = (ClipboardManager) i9Var.getContext().getSystemService("clipboard");
                            if (clipboardManager != null && clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() > 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                                editText2.setText(text.toString().trim());
                                editText2.setSelection(editText2.getText().length());
                                Runnable runnable = i9Var.h;
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
                        EditText editText3 = this.f35035b.f35096a;
                        editText3.setText("");
                        editText3.setSelection(0);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, w7.x5.e(28, 28, 17));
        e();
        d();
    }

    public final void a() {
        PopupWindow popupWindow = this.f35103s;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f35103s.dismiss();
        }
    }

    public final boolean b() {
        String lowerCase = this.f35096a.getText().toString().trim().toLowerCase();
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
        int i10;
        int height;
        float f7;
        Rect rect = this.f35106y;
        getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.F;
        getLocationOnScreen(iArr);
        int[] iArr2 = this.G;
        getLocationInWindow(iArr2);
        Rect rect2 = this.E;
        if (!getLocalVisibleRect(rect2)) {
            a();
            return;
        }
        rect2.offset(iArr[0], iArr[1]);
        if (!Rect.intersects(rect2, rect)) {
            a();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.f35103s.getContentView();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), rect.width()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = linearLayout.getMeasuredHeight();
        int dp = AndroidUtilities.dp(9.0f);
        if (getHeight() + iArr[1] + dp + measuredHeight > rect.bottom) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i10 != 0 && (iArr[1] - dp) - measuredHeight < rect.top) {
            a();
            return;
        }
        if (linearLayout.indexOfChild(this.f35105x) != i10) {
            linearLayout.removeView(this.f35105x);
            linearLayout.addView(this.f35105x, i10);
            ImageView imageView = this.f35105x;
            if (i10 != 0) {
                f7 = 180.0f;
            } else {
                f7 = 0.0f;
            }
            imageView.setRotation(f7);
        }
        int max = Math.max(rect.left, Math.min(((getWidth() - measuredWidth) / 2) + iArr[0], rect.right - measuredWidth));
        if (i10 != 0) {
            height = (iArr[1] - dp) - measuredHeight;
        } else {
            height = getHeight() + iArr[1] + dp;
        }
        int i11 = (max + iArr2[0]) - iArr[0];
        int i12 = (height + iArr2[1]) - iArr[1];
        if (this.f35103s.isShowing()) {
            if (this.J != i11 || this.K != i12 || this.L != measuredWidth || this.M != measuredHeight) {
                this.f35103s.update(i11, i12, measuredWidth, measuredHeight);
            }
        } else {
            this.f35103s.setWidth(measuredWidth);
            this.f35103s.setHeight(measuredHeight);
            this.f35103s.showAtLocation(this, 51, i11, i12);
            getViewTreeObserver().addOnGlobalLayoutListener(this.H);
            getViewTreeObserver().addOnScrollChangedListener(this.I);
        }
        this.J = i11;
        this.K = i12;
        this.L = measuredWidth;
        this.M = measuredHeight;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.i9.d():void");
    }

    public final void e() {
        boolean z10;
        int w02;
        if (!this.v && this.f35096a.getText().length() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.v;
        org.telegram.ui.ActionBar.e6 e6Var = this.f35099e;
        if (z11) {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, e6Var);
        } else if (z10) {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
        } else {
            w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var);
        }
        this.f35097b.setTextColor(w02);
    }

    public final void f(String str) {
        String[] mnemonicWordlist;
        ShapeDrawable shapeDrawable;
        int i10;
        if (this.f35096a.hasFocus() && !TextUtils.isEmpty(str) && str.length() >= 1 && WalletEngine2.getMnemonicWordlist().length != 0) {
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
            PopupWindow popupWindow = this.f35103s;
            TextView[] textViewArr = this.N;
            if (popupWindow == null) {
                PopupWindow popupWindow2 = new PopupWindow(context);
                this.f35103s = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.f35103s.setFocusable(false);
                this.f35103s.setInputMethodMode(1);
                this.f35103s.setBackgroundDrawable(null);
                this.f35103s.setElevation(AndroidUtilities.dp(8.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setClipToPadding(false);
                ImageView imageView = new ImageView(context);
                this.f35105x = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f35105x.setColorFilter(new PorterDuffColorFilter(-872415232, PorterDuff.Mode.SRC_IN));
                this.f35105x.setImageResource(R.drawable.wallet_tooltip_arrow);
                linearLayout.addView(this.f35105x, w7.x5.t(18, 9, 1, 0, 0, 0, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                this.f35104w = linearLayout2;
                linearLayout2.setOrientation(0);
                this.f35104w.setGravity(16);
                this.f35104w.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                this.f35104w.setClipToPadding(false);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-872415232);
                gradientDrawable.setCornerRadius(AndroidUtilities.dp(8.0f));
                this.f35104w.setBackground(gradientDrawable);
                for (int i11 = 0; i11 < 3; i11++) {
                    TextView textView = new TextView(context);
                    textView.setTextSize(14.0f);
                    textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                    textView.setGravity(17);
                    textView.setIncludeFontPadding(false);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxWidth(AndroidUtilities.dp(140.0f));
                    textView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
                    textView.setVisibility(8);
                    textView.setOnClickListener(new ci.m4(this, i11, 26));
                    textViewArr[i11] = textView;
                    LinearLayout linearLayout3 = this.f35104w;
                    if (i11 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 12;
                    }
                    linearLayout3.addView(textView, w7.x5.t(-2, -2, 16, i10, 0, 0, 0));
                }
                linearLayout.addView(this.f35104w, w7.x5.n(-2, -2));
                this.f35103s.setContentView(linearLayout);
                this.f35103s.setWidth(-2);
                this.f35103s.setHeight(-2);
                this.f35103s.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        i9 i9Var = i9.this;
                        i9Var.getViewTreeObserver().removeOnGlobalLayoutListener(i9Var.H);
                        i9Var.getViewTreeObserver().removeOnScrollChangedListener(i9Var.I);
                    }
                });
            }
            for (int i12 = 0; i12 < 3; i12++) {
                TextView textView2 = textViewArr[i12];
                if (i12 < arrayList.size()) {
                    String str3 = (String) arrayList.get(i12);
                    SpannableString spannableString = new SpannableString(str3);
                    int min = Math.min(str.length(), str3.length());
                    spannableString.setSpan(new ForegroundColorSpan(-4539718), 0, min, 33);
                    spannableString.setSpan(new ForegroundColorSpan(-1), min, str3.length(), 33);
                    textView2.setText(spannableString);
                    if (i12 == 0) {
                        shapeDrawable = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(5.0f), 452984831);
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
        return this.f35096a.getText().toString().trim();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(256.0f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)), i11);
    }

    public void setError(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            ImageView imageView = this.d;
            EditText editText = this.f35096a;
            org.telegram.ui.ActionBar.e6 e6Var = this.f35099e;
            if (z10) {
                setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.24f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21060r7, e6Var))));
                int i10 = org.telegram.ui.ActionBar.i6.f21041q7;
                this.f35097b.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
                }
                AndroidUtilities.shakeViewSpring(this);
            } else {
                setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, e6Var))));
                editText.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                if (imageView != null) {
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var), PorterDuff.Mode.SRC_IN));
                }
                e();
                d();
            }
            Runnable runnable = this.f35101n;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setOnErrorClearListener(Runnable runnable) {
        this.f35101n = runnable;
    }

    public void setOnNextListener(Runnable runnable) {
        this.f35102r = runnable;
    }

    public void setOnPasteListener(Runnable runnable) {
        this.h = runnable;
    }

    public void setOnTextChangedListener(Runnable runnable) {
        this.f35100f = runnable;
    }

    public void setText(String str) {
        EditText editText = this.f35096a;
        editText.setText(str);
        editText.setSelection(str.length());
        setError(false);
        e();
        d();
        a();
    }
}
