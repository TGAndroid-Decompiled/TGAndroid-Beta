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
public final class e1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public TL_iv.pageBlockChannel B;
    public final o70 f36309a;
    public final j4 f36310b;
    public final org.telegram.ui.Components.tq f36311c;
    public final TextView d;
    public final ImageView f36312e;
    public int f36313f;
    public d3 h;
    public int f36314n;
    public final int f36315r;
    public final int f36316s;
    public int v;
    public final Paint f36317w;
    public AnimatorSet f36318x;
    public final int f36319y;

    public e1(Context context, o70 o70Var, j4 j4Var, int i10) {
        super(context);
        this.f36315r = AndroidUtilities.dp(18.0f);
        this.f36316s = AndroidUtilities.dp(11.0f);
        this.f36309a = o70Var;
        this.f36310b = j4Var;
        setWillNotDraw(false);
        this.f36317w = new Paint();
        this.f36319y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        yh.p(14.0f, 1, textView);
        org.telegram.messenger.y3.r(R.string.ChannelJoin, textView, 19);
        addView(textView, k7.c6.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.g(8, this, o70Var));
        ImageView imageView = new ImageView(context);
        this.f36312e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.e(39, 39, 53));
        org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(context, 0);
        this.f36311c = tqVar;
        addView(tqVar, k7.c6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z4) {
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
        float f27;
        AnimatorSet animatorSet = this.f36318x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f36313f = i10;
        ImageView imageView = this.f36312e;
        org.telegram.ui.Components.tq tqVar = this.f36311c;
        TextView textView = this.d;
        if (z4) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36318x = animatorSet2;
            if (i10 == 0) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            float[] fArr = {f19};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, fArr);
            if (i10 == 0) {
                f20 = 1.0f;
            } else {
                f20 = 0.1f;
            }
            float[] fArr2 = {f20};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, fArr2);
            if (i10 == 0) {
                f21 = 1.0f;
            } else {
                f21 = 0.1f;
            }
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property3, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tqVar, property, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(tqVar, property2, f23);
            if (i10 == 1) {
                f24 = 1.0f;
            } else {
                f24 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(tqVar, property3, f24);
            if (i10 == 2) {
                f25 = 1.0f;
            } else {
                f25 = 0.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView, property, f25);
            if (i10 == 2) {
                f26 = 1.0f;
            } else {
                f26 = 0.1f;
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView, property2, f26);
            if (i10 == 2) {
                f27 = 1.0f;
            } else {
                f27 = 0.1f;
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(imageView, property3, f27));
            this.f36318x.setDuration(150L);
            this.f36318x.start();
            return;
        }
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        textView.setAlpha(f10);
        if (i10 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.1f;
        }
        textView.setScaleX(f11);
        if (i10 == 0) {
            f12 = 1.0f;
        } else {
            f12 = 0.1f;
        }
        textView.setScaleY(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        tqVar.setAlpha(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        tqVar.setScaleX(f14);
        if (i10 == 1) {
            f15 = 1.0f;
        } else {
            f15 = 0.1f;
        }
        tqVar.setScaleY(f15);
        if (i10 == 2) {
            f16 = 1.0f;
        } else {
            f16 = 0.0f;
        }
        imageView.setAlpha(f16);
        if (i10 == 2) {
            f17 = 1.0f;
        } else {
            f17 = 0.1f;
        }
        imageView.setScaleX(f17);
        if (i10 == 2) {
            f18 = 1.0f;
        } else {
            f18 = 0.1f;
        }
        imageView.setScaleY(f18);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.h;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.h;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.h;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.B != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f36317w);
            d3 d3Var = this.h;
            if (d3Var != null && d3Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.f36316s;
                int i11 = this.f36315r;
                j4 j4Var = this.f36310b;
                if (j4Var != null && j4Var.D) {
                    canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.f36319y == 0) {
                    l4.v(this.f36309a, canvas, this, 0);
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
        d3 d3Var = this.h;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrChannel, l4.j(this.f36309a, this.f36310b, d3Var)));
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp = ((this.f36314n / 2) + this.v) - AndroidUtilities.dp(19.0f);
        int i14 = this.v;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.f36312e.layout(dp, 0, dp2 + (this.f36314n / 2) + i14, dp3);
        this.f36311c.layout(((this.f36314n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f36314n / 2) + this.v, AndroidUtilities.dp(39.0f));
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
        this.f36314n = textView.getMeasuredWidth();
        this.f36311c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f36312e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.B;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f36314n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.B;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.kw0.f28507a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.h = l4.p(this.f36309a, this, str, null, dp, this.f36316s, pageblockchannel2, alignment2, 1, this.f36310b);
            int i12 = this.f36315r;
            j4 j4Var = this.f36310b;
            if (j4Var != null && j4Var.D) {
                this.v = i12;
            } else {
                this.v = (getMeasuredWidth() - i12) - this.f36314n;
            }
            d3 d3Var = this.h;
            if (d3Var != null) {
                d3Var.f35964s = i12;
                d3Var.v = this.f36316s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36319y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!l4.l(this.f36309a, this.f36310b, motionEvent, this, this.h, this.f36315r, this.f36316s) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.B = pageblockchannel;
        int i10 = this.f36319y;
        ImageView imageView = this.f36312e;
        Paint paint = this.f36317w;
        TextView textView = this.d;
        o70 o70Var = this.f36309a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.k6.M6;
            l4 l4Var = (l4) o70Var;
            l4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, i11, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            l4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(o70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((l4) o70Var).U).getChat(Long.valueOf(pageblockchannel.channel.f20845id));
        if (chat != null && !chat.min) {
            o70Var.f39558n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!o70Var.f39559r && ChatObject.isPublic(chat2)) {
                o70Var.f39559r = true;
                int i12 = ((l4) o70Var).U;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new oh.b8(o70Var, this.f36310b, i12, this, 1));
            }
            a(1, false);
        }
        requestLayout();
    }
}
