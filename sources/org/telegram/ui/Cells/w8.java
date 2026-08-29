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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.x80;
public class w8 extends FrameLayout {
    public final gh.s f25875a;
    public final v8 f25876b;
    public final v8 f25877c;
    public final ImageView d;
    public boolean f25878e;
    public boolean f25879f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.c6 f25880n;

    public w8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this(23, context, c6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25876b.getLayoutParams();
        if (!LocaleController.isRTL && drawable != null) {
            dp = AndroidUtilities.dp(58.0f);
        } else {
            dp = AndroidUtilities.dp(23.0f);
        }
        marginLayoutParams.rightMargin = dp;
        ImageView imageView = this.d;
        imageView.setImageDrawable(drawable);
        int i10 = 0;
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
            imageView.setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, this.f25880n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i11 = dp2 + i10;
        boolean z11 = LocaleController.isRTL;
        gh.s sVar = this.f25875a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) sVar.getLayoutParams()).rightMargin = i11;
        }
        sVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f25875a.setText(charSequence);
        this.f25876b.setText(charSequence2);
        this.f25877c.setVisibility(8);
        this.f25878e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f25875a.setText(charSequence);
        this.f25876b.setText(str);
        v8 v8Var = this.f25877c;
        v8Var.setVisibility(0);
        v8Var.setText(str2);
        this.f25878e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.gc;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25880n;
        int a2 = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gh.s sVar = this.f25875a;
        sVar.setLinkTextColor(a2);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        sVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        v8 v8Var = this.f25876b;
        v8Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.g6.f23450z6;
        v8Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.f25877c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        v8Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25875a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.f25878e) {
            org.telegram.ui.ActionBar.c6 c6Var = this.f25880n;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.f25875a.getText();
        CharSequence text2 = this.f25876b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f25879f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f25879f) {
                text = text2;
            }
            sb2.append((Object) text);
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.h) {
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.f25878e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        v8 v8Var = this.f25876b;
        ClickableSpan b10 = v8Var.b(((int) motionEvent.getX()) - v8Var.getLeft(), ((int) motionEvent.getY()) - v8Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            gh.s sVar = this.f25875a;
            if (sVar.a(((int) motionEvent.getX()) - sVar.getLeft(), ((int) motionEvent.getY()) - sVar.getTop()) != null) {
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
        this.f25879f = z10;
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

    public w8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f25880n = c6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        gh.s sVar = new gh.s(context, c6Var, true);
        this.f25875a = sVar;
        sVar.setOnLinkLongPressListener(new x80(this) {
            public final w8 f25744b;

            {
                this.f25744b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f25744b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f25875a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f25876b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f25876b);
                            return;
                        }
                        return;
                }
            }
        });
        sVar.setTextSize(1, 16.0f);
        sVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            sVar.setLines(1);
            sVar.setMaxLines(1);
            sVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        sVar.setEllipsize(truncateAt);
        sVar.setImportantForAccessibility(2);
        sVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f9 = i10 - 6;
        addView(sVar, i7.f6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f9, 6.0f, f9, z10 ? 27.0f : 0.0f));
        v8 v8Var = new v8(this, context, c6Var, 0);
        this.f25876b = v8Var;
        v8Var.setOnLinkLongPressListener(new x80(this) {
            public final w8 f25744b;

            {
                this.f25744b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f25744b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f25875a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f25876b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f25876b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            v8Var.setLines(1);
            v8Var.setSingleLine(true);
        }
        v8Var.setTextSize(1, 13.0f);
        v8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        v8Var.setImportantForAccessibility(2);
        v8Var.setEllipsize(truncateAt);
        v8Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(v8Var, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(v8Var, i7.f6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        v8 v8Var2 = new v8(this, context, c6Var, 1);
        this.f25877c = v8Var2;
        v8Var2.setOnLinkLongPressListener(new x80(this) {
            public final w8 f25744b;

            {
                this.f25744b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        w8 w8Var = this.f25744b;
                        w8Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                w8Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(w8Var.f25875a);
                            return;
                        }
                        return;
                    case 1:
                        w8 w8Var2 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(w8Var2.f25876b);
                            return;
                        }
                        return;
                    default:
                        w8 w8Var3 = this.f25744b;
                        if (clickableSpan != null) {
                            try {
                                w8Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(w8Var3.f25876b);
                            return;
                        }
                        return;
                }
            }
        });
        this.h = z12;
        if (z12) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            v8Var2.setLines(1);
            v8Var2.setSingleLine(true);
        }
        v8Var2.setTextSize(1, 13.0f);
        v8Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        v8Var2.setImportantForAccessibility(2);
        v8Var2.setEllipsize(truncateAt);
        v8Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(v8Var2, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(v8Var2, i7.f6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
