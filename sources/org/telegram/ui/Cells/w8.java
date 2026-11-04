package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.r70;
public class w8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final yh.l f30822a;
    public final v8 f30823b;
    public final v8 f30824c;
    public final ImageView d;
    public boolean f30825e;
    public boolean f30826f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.e6 f30827n;

    public w8(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(23, context, e6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30823b.getLayoutParams();
        if (!bd.f21784a0 && drawable != null) {
            L = org.telegram.messenger.g0.L(58.0f);
        } else {
            L = org.telegram.messenger.g0.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i3 = 0;
        if (drawable != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setFocusable(z10);
        imageView.setContentDescription(str);
        if (drawable == null) {
            imageView.setBackground(null);
            imageView.setImportantForAccessibility(2);
        } else {
            int L2 = org.telegram.messenger.g0.L(48.0f);
            int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30827n;
            y j02 = org.telegram.ui.ActionBar.k6.j0(L2, 0, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(imageView, j02, null, N, e6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = org.telegram.messenger.g0.L(23.0f);
        if (drawable != null) {
            i3 = org.telegram.messenger.g0.L(48.0f);
        }
        int i11 = L3 + i3;
        boolean z11 = bd.f21784a0;
        yh.l lVar = this.f30822a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).rightMargin = i11;
        }
        lVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f30822a.setText(charSequence);
        this.f30823b.setText(charSequence2);
        this.f30824c.setVisibility(8);
        this.f30825e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f30822a.setText(charSequence);
        this.f30823b.setText(str);
        v8 v8Var = this.f30824c;
        v8Var.setVisibility(0);
        v8Var.setText(str2);
        this.f30825e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30822a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i3;
        if (this.f30825e) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f30827n;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f30822a.getText();
        CharSequence text2 = this.f30823b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f30826f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f30826f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.f30825e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v8 v8Var = this.f30823b;
        ClickableSpan b10 = v8Var.b(((int) motionEvent.getX()) - v8Var.getLeft(), ((int) motionEvent.getY()) - v8Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            yh.l lVar = this.f30822a;
            if (lVar.a(((int) motionEvent.getX()) - lVar.getLeft(), ((int) motionEvent.getY()) - lVar.getTop()) != null) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setContentDescriptionValueFirst(boolean z10) {
        this.f30826f = z10;
    }

    public void setImage(Drawable drawable) {
        b(drawable, null);
    }

    public void setImageClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.d;
        imageView.setOnClickListener(onClickListener);
        if (onClickListener == null) {
            imageView.setClickable(false);
        }
    }

    @Override
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30827n;
        int a10 = a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        yh.l lVar = this.f30822a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        v8 v8Var = this.f30823b;
        v8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        v8Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        this.f30824c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        v8Var.invalidate();
    }

    public w8(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f30827n = e6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        yh.l lVar = new yh.l(context, e6Var, true);
        this.f30822a = lVar;
        lVar.setOnLinkLongPressListener(new r70(this) {
            public final w8 f30658b;

            {
                this.f30658b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f30658b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f30822a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f30823b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f30823b);
                            return;
                        }
                        return;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(bd.f21784a0 ? 5 : 3);
        if (z10) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            lVar.setLines(1);
            lVar.setMaxLines(1);
            lVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        lVar.setEllipsize(truncateAt);
        lVar.setImportantForAccessibility(2);
        lVar.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(5.0f));
        float f10 = i3 - 6;
        addView(lVar, mf.d(-2, -2.0f, bd.f21784a0 ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        v8 v8Var = new v8(this, context, e6Var, 0);
        this.f30823b = v8Var;
        v8Var.setOnLinkLongPressListener(new r70(this) {
            public final w8 f30658b;

            {
                this.f30658b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f30658b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f30822a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f30823b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f30823b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            v8Var.setLines(1);
            v8Var.setSingleLine(true);
        }
        v8Var.setTextSize(1, 13.0f);
        v8Var.setGravity(bd.f21784a0 ? 5 : 3);
        v8Var.setImportantForAccessibility(2);
        v8Var.setEllipsize(truncateAt);
        v8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f11 = i3;
            addView(v8Var, mf.d(-1, -2.0f, (bd.f21784a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i3;
            addView(v8Var, mf.d(-1, -2.0f, bd.f21784a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        v8 v8Var2 = new v8(this, context, e6Var, 1);
        this.f30824c = v8Var2;
        v8Var2.setOnLinkLongPressListener(new r70(this) {
            public final w8 f30658b;

            {
                this.f30658b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f30658b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f30822a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f30823b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f30658b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f30823b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
        } else {
            v8Var2.setLines(1);
            v8Var2.setSingleLine(true);
        }
        v8Var2.setTextSize(1, 13.0f);
        v8Var2.setGravity(bd.f21784a0 ? 3 : 5);
        v8Var2.setImportantForAccessibility(2);
        v8Var2.setEllipsize(truncateAt);
        v8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f13 = i3;
            addView(v8Var2, mf.d(-1, -2.0f, (bd.f21784a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i3;
            addView(v8Var2, mf.d(-1, -2.0f, bd.f21784a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i3) {
        return i3;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
