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

public final class g1 extends FrameLayout implements org.telegram.ui.Cells.i9 {
    public TL_iv.pageBlockChannel A;

    public final d70 f38261a;

    public final k4 f38262b;

    public final org.telegram.ui.Components.hq f38263c;
    public final TextView d;

    public final ImageView f38264e;

    public int f38265f;
    public f3 h;

    public int f38266n;

    public final int f38267r;

    public final int f38268s;
    public int v;

    public final Paint f38269w;

    public AnimatorSet f38270x;

    public final int f38271y;

    public g1(Context context, d70 d70Var, k4 k4Var, int i10) {
        super(context);
        this.f38267r = AndroidUtilities.dp(18.0f);
        this.f38268s = AndroidUtilities.dp(11.0f);
        this.f38261a = d70Var;
        this.f38262b = k4Var;
        setWillNotDraw(false);
        this.f38269w = new Paint();
        this.f38271y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        org.telegram.messenger.rl.i(R.string.ChannelJoin, textView, 19);
        addView(textView, h7.z5.e(-2, 39, 53));
        textView.setOnClickListener(new nh.x1(11, this, d70Var));
        ImageView imageView = new ImageView(context);
        this.f38264e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, h7.z5.e(39, 39, 53));
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 0);
        this.f38263c = hqVar;
        addView(hqVar, h7.z5.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        AnimatorSet animatorSet = this.f38270x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f38265f = i10;
        ImageView imageView = this.f38264e;
        org.telegram.ui.Components.hq hqVar = this.f38263c;
        TextView textView = this.d;
        if (!z10) {
            textView.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i10 == 0 ? 1.0f : 0.1f);
            hqVar.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            hqVar.setScaleX(i10 == 1 ? 1.0f : 0.1f);
            hqVar.setScaleY(i10 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i10 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i10 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f38270x = animatorSet2;
        float[] fArr = {i10 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i10 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i10 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property, i10 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property2, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(hqVar, (Property<org.telegram.ui.Components.hq, Float>) property3, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i10 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i10 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i10 == 2 ? 1.0f : 0.1f));
        this.f38270x.setDuration(150L);
        this.f38270x.start();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.h;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.A == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.f38269w);
        f3 f3Var = this.h;
        if (f3Var == null || f3Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i10 = this.f38268s;
        int i11 = this.f38267r;
        k4 k4Var = this.f38262b;
        if (k4Var == null || !k4Var.C) {
            canvas.translate(i11, i10);
        } else {
            canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
        }
        if (this.f38271y == 0) {
            m4.v(this.f38261a, canvas, this, 0);
        }
        this.h.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.h;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrChannel, m4.j(this.f38261a, this.f38262b, f3Var)));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f38264e.layout(((this.f38266n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f38266n / 2) + this.v, AndroidUtilities.dp(39.0f));
        this.f38263c.layout(((this.f38266n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.f38266n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i14 = this.v;
        TextView textView = this.d;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824);
        TextView textView = this.d;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f38266n = textView.getMeasuredWidth();
        this.f38263c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        this.f38264e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), 1073741824));
        TL_iv.pageBlockChannel pageblockchannel = this.A;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int iDp = (size - AndroidUtilities.dp(52.0f)) - this.f38266n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.A;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.tv0.f32901a;
            this.h = m4.p(this.f38261a, this, str, null, iDp, this.f38268s, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.f38262b);
            int i12 = this.f38267r;
            k4 k4Var = this.f38262b;
            if (k4Var == null || !k4Var.C) {
                this.v = (getMeasuredWidth() - i12) - this.f38266n;
            } else {
                this.v = i12;
            }
            f3 f3Var = this.h;
            if (f3Var != null) {
                f3Var.f37923s = i12;
                f3Var.v = this.f38268s;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38271y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return m4.l(this.f38261a, this.f38262b, motionEvent, this, this.h, this.f38267r, this.f38268s) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.A = pageblockchannel;
        int i10 = this.f38271y;
        ImageView imageView = this.f38264e;
        Paint paint = this.f38269w;
        TextView textView = this.d;
        d70 d70Var = this.f38261a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.g6.M6;
            m4 m4Var = (m4) d70Var;
            m4Var.getClass();
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            int iRed = Color.red(iW0);
            int iGreen = Color.green(iW0);
            int iBlue = Color.blue(iW0);
            m4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            paint.setColor(Color.argb(34, iRed, iGreen, iBlue));
            imageView.setColorFilter(new PorterDuffColorFilter(d70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((m4) d70Var).T).getChat(Long.valueOf(pageblockchannel.channel.f22380id));
        if (chat == null || chat.min) {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!d70Var.f37290r && ChatObject.isPublic(chat2)) {
                d70Var.f37290r = true;
                int i12 = ((m4) d70Var).T;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new jh.b8(d70Var, this.f38262b, i12, this, 2));
            }
            a(1, false);
        } else {
            d70Var.f37289n = chat;
            if (!chat.left || chat.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }
}
