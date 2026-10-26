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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c1 extends FrameLayout implements org.telegram.ui.Cells.r9, org.telegram.ui.ActionBar.p6 {
    public final int E;
    public TL_iv.pageBlockChannel F;
    public int f38203a;
    public final h70 f38204b;
    public final h4 f38205c;
    public final org.telegram.ui.Components.er d;
    public final TextView e;
    public final ImageView f38206f;
    public int h;
    public a3 f38207n;
    public int f38208r;
    public final int f38209s;
    public final int v;
    public int f38210w;
    public final Paint f38211x;
    public AnimatorSet f38212y;

    public c1(Context context, h70 h70Var, h4 h4Var, int i10) {
        super(context);
        this.f38209s = AndroidUtilities.dp(18.0f);
        this.v = AndroidUtilities.dp(11.0f);
        this.f38204b = h70Var;
        this.f38205c = h4Var;
        setWillNotDraw(false);
        this.f38211x = new Paint();
        this.E = i10;
        TextView textView = new TextView(context);
        this.e = textView;
        ic.a.o(14.0f, 1, textView);
        org.telegram.messenger.vh.k(R.string.ChannelJoin, textView, 19);
        addView(textView, org.telegram.ui.Components.gb1.i(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.ui.ActionBar.u1(3, this, h70Var));
        ImageView imageView = new ImageView(context);
        this.f38206f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, org.telegram.ui.Components.gb1.i(39, 39, 53));
        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(context, 0);
        this.d = erVar;
        addView(erVar, org.telegram.ui.Components.gb1.i(39, 39, 53));
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
        AnimatorSet animatorSet = this.f38212y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i10;
        ImageView imageView = this.f38206f;
        org.telegram.ui.Components.er erVar = this.d;
        TextView textView = this.e;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f38212y = animatorSet2;
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
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(erVar, property, f21);
            if (i10 == 1) {
                f22 = 1.0f;
            } else {
                f22 = 0.1f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(erVar, property2, f22);
            if (i10 == 1) {
                f23 = 1.0f;
            } else {
                f23 = 0.1f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(erVar, property3, f23);
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
            this.f38212y.setDuration(150L);
            this.f38212y.start();
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
        erVar.setAlpha(f12);
        if (i10 == 1) {
            f13 = 1.0f;
        } else {
            f13 = 0.1f;
        }
        erVar.setScaleX(f13);
        if (i10 == 1) {
            f14 = 1.0f;
        } else {
            f14 = 0.1f;
        }
        erVar.setScaleY(f14);
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
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f38207n;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f38207n;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f38207n;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.F != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f38211x);
            a3 a3Var = this.f38207n;
            if (a3Var != null && a3Var.d.getLineCount() > 0) {
                canvas.save();
                int i10 = this.v;
                int i11 = this.f38209s;
                h4 h4Var = this.f38205c;
                if (h4Var != null && h4Var.G) {
                    canvas.translate((getMeasuredWidth() - this.f38207n.d.getLineWidth(0)) - i11, i10);
                } else {
                    canvas.translate(i11, i10);
                }
                if (this.E == 0) {
                    j4.v(this.f38204b, canvas, this, 0);
                }
                this.f38207n.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f38207n;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrChannel, j4.j(this.f38204b, this.f38205c, a3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp = ((this.f38208r / 2) + this.f38210w) - AndroidUtilities.dp(19.0f);
        int i14 = this.f38210w;
        int dp2 = AndroidUtilities.dp(20.0f);
        int dp3 = AndroidUtilities.dp(39.0f);
        this.f38206f.layout(dp, 0, dp2 + (this.f38208r / 2) + i14, dp3);
        this.d.layout(((this.f38208r / 2) + this.f38210w) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f38208r / 2) + this.f38210w, AndroidUtilities.dp(39.0f));
        int i15 = this.f38210w;
        TextView textView = this.e;
        textView.layout(i15, 0, textView.getMeasuredWidth() + i15, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f38208r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f38206f.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.F;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.f38208r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.F;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.px0.f31732a;
            if (alignmentArr.length >= 5) {
                alignment = alignmentArr[3];
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            this.f38207n = j4.p(this.f38204b, this, str, null, dp, this.v, pageblockchannel2, alignment2, 1, this.f38205c);
            int i12 = this.f38209s;
            h4 h4Var = this.f38205c;
            if (h4Var != null && h4Var.G) {
                this.f38210w = i12;
            } else {
                this.f38210w = (getMeasuredWidth() - i12) - this.f38208r;
            }
            a3 a3Var = this.f38207n;
            if (a3Var != null) {
                a3Var.f37634s = i12;
                a3Var.v = this.v;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E != 0) {
            return super.onTouchEvent(motionEvent);
        }
        if (!j4.l(this.f38204b, this.f38205c, motionEvent, this, this.f38207n, this.f38209s, this.v) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.F = pageblockchannel;
        int i10 = this.E;
        ImageView imageView = this.f38206f;
        Paint paint = this.f38211x;
        TextView textView = this.e;
        h70 h70Var = this.f38204b;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.y6.M6;
            j4 j4Var = (j4) h70Var;
            j4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            j4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            this.f38203a = h70Var.a();
            imageView.setColorFilter(new PorterDuffColorFilter(this.f38203a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((j4) h70Var).X).getChat(Long.valueOf(pageblockchannel.channel.f22027id));
        if (chat != null && !chat.min) {
            h70Var.f39923n = chat;
            if (chat.left && !chat.kicked) {
                a(0, false);
            } else {
                a(4, false);
            }
        } else {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!h70Var.f39924r && ChatObject.isPublic(chat2)) {
                h70Var.f39924r = true;
                int i12 = ((j4) h70Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new di.q8(h70Var, this.f38205c, i12, this, 2));
            }
            a(1, false);
        }
        requestLayout();
    }

    @Override
    public final void updateColors() {
        h70 h70Var;
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.E == 0 && this.F != null && (h70Var = this.f38204b) != null && (textView = this.e) != null && (imageView = this.f38206f) != null && (paint = this.f38211x) != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.M6, false);
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
                paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
                int a2 = h70Var.a();
                if (a2 != this.f38203a) {
                    this.f38203a = a2;
                    imageView.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.MULTIPLY));
                }
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
