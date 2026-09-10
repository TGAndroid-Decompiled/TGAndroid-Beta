package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e1 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public TL_iv.pageBlockChannel E;
    public final t70 f32013a;
    public final h4 f32014b;
    public final org.telegram.ui.Components.zq f32015c;
    public final TextView d;
    public final ImageView e;
    public int f32016f;
    public c3 h;
    public int f32017n;
    public final int f32018r;
    public final int f32019s;
    public int v;
    public final Paint f32020w;
    public AnimatorSet f32021x;
    public final int f32022y;

    public e1(Context context, t70 t70Var, h4 h4Var, int i10) {
        super(context);
        this.f32018r = AndroidUtilities.dp(18.0f);
        this.f32019s = AndroidUtilities.dp(11.0f);
        this.f32013a = t70Var;
        this.f32014b = h4Var;
        setWillNotDraw(false);
        this.f32020w = new Paint();
        this.f32022y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        org.telegram.messenger.em.k(R.string.ChannelJoin, textView, 19);
        addView(textView, w7.a6.e(-2, 39, 53));
        textView.setOnClickListener(new bi.n3(20, this, t70Var));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.a6.e(39, 39, 53));
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(context, 0);
        this.f32015c = zqVar;
        addView(zqVar, w7.a6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        AnimatorSet animatorSet = this.f32021x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f32016f = i10;
        ImageView imageView = this.e;
        org.telegram.ui.Components.zq zqVar = this.f32015c;
        TextView textView = this.d;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f32021x = animatorSet2;
            if (i10 == 0) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            float[] fArr = {f18};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i10 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.1f;
            }
            float[] fArr2 = {f19};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i10 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f20);
            if (i10 == 1) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zqVar, property, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(zqVar, property2, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(zqVar, property3, f23);
            if (i10 == 2) {
                f24 = 1.0f;
            } else {
                f24 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f24);
            if (i10 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f25);
            if (i10 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f26));
            this.f32021x.setDuration(150L);
            this.f32021x.start();
            return;
        }
        if (i10 == 0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setAlpha(f7);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.1f;
        }
        textView.setScaleX(f10);
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleY(f11);
        if (i10 == 1) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        zqVar.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.1f;
        }
        zqVar.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        zqVar.setScaleY(f14);
        if (i10 == 2) {
            f15 = 1.0f;
        } else {
            f15 = 0.0f;
        }
        imageView.setAlpha(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.1f;
        }
        imageView.setScaleX(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleY(f17);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.h;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.h;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.h;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.E != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f32020w);
            c3 c3Var = this.h;
            if (c3Var != null && c3Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.f32019s;
                int i11 = this.f32018r;
                h4 h4Var = this.f32014b;
                if (h4Var != null && h4Var.G) {
                    canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.f32022y == 0) {
                    j4.v(this.f32013a, canvas, this, 0);
                }
                this.h.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.h;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrChannel, j4.j(this.f32013a, this.f32014b, c3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = ((this.f32017n / 2) + this.v) - AndroidUtilities.dp(19.0f);
        int i14 = this.v;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.e.layout(dp, 0, dp2 + (this.f32017n / 2) + i14, dp3);
        this.f32015c.layout(((this.f32017n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f32017n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i15 = this.v;
        TextView textView = this.d;
        textView.layout(i15, 0, textView.getMeasuredWidth() + i15, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824);
        TextView textView = this.d;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f32017n = textView.getMeasuredWidth();
        this.f32015c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.E;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f32017n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.E;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.uw0.f27756a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.h = j4.p(this.f32013a, this, str, null, dp, this.f32019s, pageblockchannel2, alignment2, 1, this.f32014b);
            int i12 = this.f32018r;
            h4 h4Var = this.f32014b;
            if (h4Var != null && h4Var.G) {
                this.v = i12;
            } else {
                this.v = (getMeasuredWidth() - i12) - this.f32017n;
            }
            c3 c3Var = this.h;
            if (c3Var != null) {
                c3Var.f31515s = i12;
                c3Var.v = this.f32019s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f32022y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!j4.l(this.f32013a, this.f32014b, motionEvent, this, this.h, this.f32018r, this.f32019s) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.E = pageblockchannel;
        int i10 = this.f32022y;
        ImageView imageView = this.e;
        Paint paint = this.f32020w;
        TextView textView = this.d;
        t70 t70Var = this.f32013a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            j4 j4Var = (j4) t70Var;
            j4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            j4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(t70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((j4) t70Var).X).getChat(Long.valueOf(pageblockchannel.channel.f17195id));
        if (chat != null && !chat.min) {
            t70Var.f36858n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!t70Var.f36859r && ChatObject.isPublic(chat2)) {
                t70Var.f36859r = true;
                int i12 = ((j4) t70Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new di.c5(t70Var, this.f32014b, i12, this, 1));
            }
            a(1, false);
        }
        requestLayout();
    }
}
