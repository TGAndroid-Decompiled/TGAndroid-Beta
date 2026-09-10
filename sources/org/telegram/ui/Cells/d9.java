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
import org.telegram.ui.Components.l90;
public class d9 extends FrameLayout {
    public final uh.o f19011a;
    public final c9 f19012b;
    public final c9 f19013c;
    public final ImageView d;
    public boolean e;
    public boolean f19014f;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 f19015n;

    public d9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this(23, context, f6Var, z10, false);
    }

    public final void b(Drawable drawable, String str) {
        int dp;
        boolean z10;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f19012b.getLayoutParams();
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
            imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(48.0f), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, this.f19015n)));
            imageView.setImportantForAccessibility(1);
        }
        int dp2 = AndroidUtilities.dp(23.0f);
        if (drawable != null) {
            i10 = AndroidUtilities.dp(48.0f);
        }
        int i11 = dp2 + i10;
        boolean z11 = LocaleController.isRTL;
        uh.o oVar = this.f19011a;
        if (z11) {
            ((ViewGroup.MarginLayoutParams) oVar.getLayoutParams()).leftMargin = i11;
        } else {
            ((ViewGroup.MarginLayoutParams) oVar.getLayoutParams()).rightMargin = i11;
        }
        oVar.requestLayout();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f19011a.setText(charSequence);
        this.f19012b.setText(charSequence2);
        this.f19013c.setVisibility(8);
        this.e = z10;
        setWillNotDraw(!z10);
    }

    public final void d(CharSequence charSequence, String str, String str2) {
        this.f19011a.setText(charSequence);
        this.f19012b.setText(str);
        c9 c9Var = this.f19013c;
        c9Var.setVisibility(0);
        c9Var.setText(str2);
        this.e = false;
        setWillNotDraw(true);
    }

    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        org.telegram.ui.ActionBar.f6 f6Var = this.f19015n;
        int a2 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        uh.o oVar = this.f19011a;
        oVar.setLinkTextColor(a2);
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        oVar.invalidate();
        int a10 = a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c9 c9Var = this.f19012b;
        c9Var.setLinkTextColor(a10);
        int i11 = org.telegram.ui.ActionBar.j6.f18325z6;
        c9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.f19013c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c9Var.invalidate();
    }

    public ImageView getImageView() {
        return this.d;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f19011a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        float dp;
        int i10;
        if (this.e) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f19015n;
            if (f6Var != null) {
                paint = f6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f18049k0;
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
        CharSequence text = this.f19011a.getText();
        CharSequence text2 = this.f19012b.getText();
        if (!TextUtils.isEmpty(text) && !TextUtils.isEmpty(text2)) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f19014f) {
                charSequence = text2;
            } else {
                charSequence = text;
            }
            sb2.append((Object) charSequence);
            sb2.append(": ");
            if (!this.f19014f) {
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
            i11 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.e ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        c9 c9Var = this.f19012b;
        ClickableSpan b10 = c9Var.b(((int) motionEvent.getX()) - c9Var.getLeft(), ((int) motionEvent.getY()) - c9Var.getTop());
        boolean z11 = false;
        if (b10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            uh.o oVar = this.f19011a;
            if (oVar.a(((int) motionEvent.getX()) - oVar.getLeft(), ((int) motionEvent.getY()) - oVar.getTop()) != null) {
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
        this.f19014f = z10;
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

    public d9(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        this.f19015n = f6Var;
        boolean z12 = z10 || z11;
        this.h = z12;
        uh.o oVar = new uh.o(context, f6Var, true);
        this.f19011a = oVar;
        oVar.setOnLinkLongPressListener(new l90(this) {
            public final d9 f18939b;

            {
                this.f18939b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        d9 d9Var = this.f18939b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.f19011a);
                            return;
                        }
                        return;
                    case 1:
                        d9 d9Var2 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.f19012b);
                            return;
                        }
                        return;
                    default:
                        d9 d9Var3 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.f19012b);
                            return;
                        }
                        return;
                }
            }
        });
        oVar.setTextSize(1, 16.0f);
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        if (z10) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            oVar.setLines(1);
            oVar.setMaxLines(1);
            oVar.setSingleLine(true);
        }
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oVar.setEllipsize(truncateAt);
        oVar.setImportantForAccessibility(2);
        oVar.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f));
        float f7 = i10 - 6;
        addView(oVar, w7.a6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, f7, 6.0f, f7, z10 ? 27.0f : 0.0f));
        c9 c9Var = new c9(this, context, f6Var, 0);
        this.f19012b = c9Var;
        c9Var.setOnLinkLongPressListener(new l90(this) {
            public final d9 f18939b;

            {
                this.f18939b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        d9 d9Var = this.f18939b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.f19011a);
                            return;
                        }
                        return;
                    case 1:
                        d9 d9Var2 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.f19012b);
                            return;
                        }
                        return;
                    default:
                        d9 d9Var3 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.f19012b);
                            return;
                        }
                        return;
                }
            }
        });
        if (z11) {
            setMinimumHeight(AndroidUtilities.dp(60.0f));
        } else {
            c9Var.setLines(1);
            c9Var.setSingleLine(true);
        }
        c9Var.setTextSize(1, 13.0f);
        c9Var.setGravity(LocaleController.isRTL ? 5 : 3);
        c9Var.setImportantForAccessibility(2);
        c9Var.setEllipsize(truncateAt);
        c9Var.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f10 = i10;
            addView(c9Var, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f10, 32.0f, f10, 4.0f));
        } else {
            float f11 = i10;
            addView(c9Var, w7.a6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f11, 32.0f, f11, 4.0f));
        }
        c9 c9Var2 = new c9(this, context, f6Var, 1);
        this.f19013c = c9Var2;
        c9Var2.setOnLinkLongPressListener(new l90(this) {
            public final d9 f18939b;

            {
                this.f18939b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                switch (r2) {
                    case 0:
                        d9 d9Var = this.f18939b;
                        d9Var.getClass();
                        if (clickableSpan != null) {
                            try {
                                d9Var.performHapticFeedback(0, 1);
                            } catch (Exception unused) {
                            }
                            clickableSpan.onClick(d9Var.f19011a);
                            return;
                        }
                        return;
                    case 1:
                        d9 d9Var2 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var2.performHapticFeedback(0, 1);
                            } catch (Exception unused2) {
                            }
                            clickableSpan.onClick(d9Var2.f19012b);
                            return;
                        }
                        return;
                    default:
                        d9 d9Var3 = this.f18939b;
                        if (clickableSpan != null) {
                            try {
                                d9Var3.performHapticFeedback(0, 1);
                            } catch (Exception unused3) {
                            }
                            clickableSpan.onClick(d9Var3.f19012b);
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
            c9Var2.setLines(1);
            c9Var2.setSingleLine(true);
        }
        c9Var2.setTextSize(1, 13.0f);
        c9Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        c9Var2.setImportantForAccessibility(2);
        c9Var2.setEllipsize(truncateAt);
        c9Var2.setPadding(0, AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(6.0f));
        if (z10) {
            float f12 = i10;
            addView(c9Var2, w7.a6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f12, 32.0f, f12, 4.0f));
        } else {
            float f13 = i10;
            addView(c9Var2, w7.a6.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, f13, 32.0f, f13, 4.0f));
        }
        e();
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImportantForAccessibility(2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.i(48.0f, 48.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    public int a(int i10) {
        return i10;
    }
}
