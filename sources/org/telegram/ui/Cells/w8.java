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
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.y70;
public class w8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final xh.l f31898a;
    public final v8 f31899b;
    public final v8 f31900c;
    public final ImageView d;
    public boolean f31901e;
    public boolean f31902f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.e6 f31903n;

    public w8(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this(23, context, e6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int L;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31899b.getLayoutParams();
        if (!hd.f24104a0 && drawable != null) {
            L = org.telegram.messenger.g0.L(58.0f);
        } else {
            L = org.telegram.messenger.g0.L(23.0f);
        }
        marginLayoutParams.rightMargin = L;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i7 = 0;
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
            int i10 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.ActionBar.e6 e6Var = this.f31903n;
            y j02 = org.telegram.ui.ActionBar.j6.j0(L2, 0, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
            imageView.setBackground(j02);
            org.telegram.ui.ActionBar.q6.j(imageView, j02, null, M, e6Var);
            imageView.setImportantForAccessibility(1);
        }
        int L3 = org.telegram.messenger.g0.L(23.0f);
        if (drawable != null) {
            i7 = org.telegram.messenger.g0.L(48.0f);
        }
        int i11 = L3 + i7;
        boolean z11 = hd.f24104a0;
        xh.l lVar = this.f31898a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) lVar.getLayoutParams()).rightMargin = i11;
        }
        lVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f31898a.setText(charSequence);
        this.f31899b.setText(charSequence2);
        this.f31900c.setVisibility(8);
        this.f31901e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f31898a.setText(charSequence);
        this.f31899b.setText(str);
        v8 v8Var = this.f31900c;
        v8Var.setVisibility(0);
        v8Var.setText(str2);
        this.f31901e = false;
        setWillNotDraw(true);
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31898a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float L;
        int i7;
        if (this.f31901e) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f31903n;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f31898a.getText();
        CharSequence text2 = this.f31899b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f31902f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f31902f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (!this.h) {
            i10 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.f31901e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v8 v8Var = this.f31899b;
        ClickableSpan b10 = v8Var.b(((int) motionEvent.getX()) - v8Var.getLeft(), ((int) motionEvent.getY()) - v8Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            xh.l lVar = this.f31898a;
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
        this.f31902f = z10;
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
        int i7 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.e6 e6Var = this.f31903n;
        int a10 = a(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        xh.l lVar = this.f31898a;
        lVar.setLinkTextColor(a10);
        lVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var));
        lVar.invalidate();
        int a11 = a(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        v8 v8Var = this.f31899b;
        v8Var.setLinkTextColor(a11);
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        v8Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.f31900c.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        v8Var.invalidate();
    }

    public w8(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context);
        this.f31903n = e6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        xh.l lVar = new xh.l(context, e6Var, true);
        this.f31898a = lVar;
        lVar.setOnLinkLongPressListener(new y70(this) {
            public final w8 f31734b;

            {
                this.f31734b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f31734b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f31898a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f31899b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f31899b);
                            return;
                        }
                        return;
                }
            }
        });
        lVar.setTextSize(1, 16.0f);
        lVar.setGravity(hd.f24104a0 ? 5 : 3);
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
        float f10 = i7 - 6;
        addView(lVar, c8.ja.d(-2, -2.0f, hd.f24104a0 ? 5 : 3, f10, 6.0f, f10, z10 ? 27.0f : 0.0f));
        v8 v8Var = new v8(this, context, e6Var, 0);
        this.f31899b = v8Var;
        v8Var.setOnLinkLongPressListener(new y70(this) {
            public final w8 f31734b;

            {
                this.f31734b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f31734b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f31898a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f31899b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f31899b);
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
        v8Var.setGravity(hd.f24104a0 ? 5 : 3);
        v8Var.setImportantForAccessibility(2);
        v8Var.setEllipsize(truncateAt);
        v8Var.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f11 = i7;
            addView(v8Var, c8.ja.d(-1, -2.0f, (hd.f24104a0 ? 5 : 3) | 80, f11, 32.0f, f11, 4.0f));
        } else {
            float f12 = i7;
            addView(v8Var, c8.ja.d(-1, -2.0f, hd.f24104a0 ? 5 : 3, f12, 32.0f, f12, 4.0f));
        }
        v8 v8Var2 = new v8(this, context, e6Var, 1);
        this.f31900c = v8Var2;
        v8Var2.setOnLinkLongPressListener(new y70(this) {
            public final w8 f31734b;

            {
                this.f31734b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f31734b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f31898a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f31899b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f31734b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f31899b);
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
        v8Var2.setGravity(hd.f24104a0 ? 3 : 5);
        v8Var2.setImportantForAccessibility(2);
        v8Var2.setEllipsize(truncateAt);
        v8Var2.setPadding(0, org.telegram.messenger.g0.L(1.0f), 0, org.telegram.messenger.g0.L(6.0f));
        if (z10) {
            float f13 = i7;
            addView(v8Var2, c8.ja.d(-1, -2.0f, (hd.f24104a0 ? 5 : 3) | 80, f13, 32.0f, f13, 4.0f));
        } else {
            float f14 = i7;
            addView(v8Var2, c8.ja.d(-1, -2.0f, hd.f24104a0 ? 5 : 3, f14, 32.0f, f14, 4.0f));
        }
        updateColors();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i7) {
        return i7;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
