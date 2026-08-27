package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class kj extends nm {
    public int U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int a3;

    public int f39767b3;

    public int f39768c3;

    public long f39769d3;

    public float f39770e3;

    public float f39771f3;

    public boolean f39772g3;

    public final float f39773h3;

    public final Paint f39774i3;

    public final Paint f39775j3;

    public final hb.a f39776k3;

    public final o1.j f39777l3;

    public final hb.a f39778m3;

    public final o1.j f39779n3;

    public final hb.a f39780o3;

    public final o1.j f39781p3;

    public boolean f39782q3;

    public final Path f39783r3;

    public boolean f39784s3;

    public int f39785t3;

    public final rn f39786u3;

    public kj(rn rnVar, Context context, pn pnVar) {
        super(rnVar, context, pnVar);
        this.f39786u3 = rnVar;
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList(10);
        this.f39773h3 = 2000.0f;
        Paint paint = new Paint(1);
        this.f39774i3 = paint;
        Paint paint2 = new Paint(1);
        this.f39775j3 = paint2;
        hb.a aVar = new hb.a(0.0f);
        this.f39776k3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.f19142g = 2000.0f;
        jVar.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        jVar.b(new o1.g(this) {

            public final kj f39116b;

            {
                this.f39116b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (i10) {
                    case 0:
                        this.f39116b.invalidate();
                        break;
                    case 1:
                        this.f39116b.invalidate();
                        break;
                    default:
                        this.f39116b.invalidate();
                        break;
                }
            }
        });
        this.f39777l3 = jVar;
        hb.a aVar2 = new hb.a(0.0f);
        this.f39778m3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        jVar2.b(new o1.g(this) {

            public final kj f39116b;

            {
                this.f39116b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (i11) {
                    case 0:
                        this.f39116b.invalidate();
                        break;
                    case 1:
                        this.f39116b.invalidate();
                        break;
                    default:
                        this.f39116b.invalidate();
                        break;
                }
            }
        });
        this.f39779n3 = jVar2;
        hb.a aVar3 = new hb.a(0.0f);
        this.f39780o3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.f19147u = org.telegram.ui.Cells.pa.k(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        jVar3.b(new o1.g(this) {

            public final kj f39116b;

            {
                this.f39116b = this;
            }

            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                switch (i12) {
                    case 0:
                        this.f39116b.invalidate();
                        break;
                    case 1:
                        this.f39116b.invalidate();
                        break;
                    default:
                        this.f39116b.invalidate();
                        break;
                }
            }
        });
        this.f39781p3 = jVar3;
        this.f39783r3 = new Path();
        this.f39785t3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.f39786u3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        rn rnVar = this.f39786u3;
        rnVar.f42181q8 = null;
        canvas.save();
        if (rnVar.R9 != null && rnVar.N9) {
            boolean z10 = rnVar.O9;
        }
        this.C1.setEmpty();
        if (rnVar.J9 != 0.0f) {
            int iSave = canvas.save();
            float measuredHeight = (-rnVar.J9) - (rnVar.Q9 != 0.0f ? (rnVar.f42213t0.getMeasuredHeight() - rnVar.J9) * rnVar.Q9 : 0.0f);
            rnVar.f42236ua = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
            canvas.restoreToCount(iSave);
        } else {
            w1(canvas, null);
            super.dispatchDraw(canvas);
            x1(canvas, null);
        }
        canvas.restore();
    }

    @Override
    public final void draw(Canvas canvas) {
        long j10;
        ArrayList arrayList;
        int i10;
        int iDp;
        float f10;
        gn gnVar;
        int i11;
        float f11;
        float f12;
        rn rnVar = this.f39786u3;
        ArrayList arrayList2 = rnVar.q6;
        ColorMatrix colorMatrix = rnVar.N6;
        m.f3 f3Var = rnVar.O6;
        org.telegram.ui.ActionBar.d5 d5Var = rnVar.P6;
        Paint paint = rnVar.X6;
        Paint paint2 = rnVar.L6;
        ArrayList arrayList3 = rnVar.K6;
        Paint paint3 = rnVar.M6;
        if (rnVar.J6 != 0) {
            j10 = 200;
            if (System.currentTimeMillis() - rnVar.J6 <= 200) {
            }
            super.draw(canvas);
        }
        j10 = 200;
        if (!AndroidUtilities.isTablet() && !rnVar.f42005c4 && rnVar.f42039f == null) {
            TLRPC.Chat chat = rnVar.f42026e;
            boolean z10 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && rnVar.N3 != 7;
            if (rnVar.J9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -rnVar.J9);
            }
            int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f35277l2;
            boolean z11 = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i12, c6Var)) <= 0.699999988079071d;
            int i13 = org.telegram.ui.ActionBar.g6.f23144i6;
            boolean z12 = z10;
            int iD = i0.b.d(z11 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.g6.v0(i13, c6Var), Color.argb(z11 ? 33 : 3, 255, 255, 255));
            int iK = i0.b.k(org.telegram.ui.ActionBar.g6.v0(i13, c6Var), z11 ? 24 : rn.Dc);
            if (rnVar.W6 != iK || rnVar.V6 != iD) {
                rnVar.V6 = iD;
                rnVar.W6 = iK;
                int iDp2 = AndroidUtilities.dp(200.0f);
                rnVar.R6 = iDp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp2, 0.0f, new int[]{iK, iD, iD, iK}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                rnVar.U6 = linearGradient;
                rnVar.S6 = (-rnVar.R6) * 2;
                paint2.setShader(linearGradient);
                int iArgb = Color.argb(z11 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, rnVar.R6, 0.0f, new int[]{0, iArgb, iArgb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                rnVar.Z6 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.d5 d5Var2 = d5Var;
            long j11 = rnVar.Q6;
            Matrix matrix = rnVar.Y6;
            m.f3 f3Var2 = f3Var;
            Matrix matrix2 = rnVar.T6;
            long jAbs = Math.abs(j11 - jElapsedRealtime);
            if (jAbs > 17) {
                jAbs = 16;
            }
            long j12 = jAbs < 4 ? 0L : jAbs;
            int width = getWidth();
            rnVar.Q6 = jElapsedRealtime;
            int i14 = (int) (rnVar.S6 + ((((long) width) * j12) / 400.0f));
            rnVar.S6 = i14;
            if (i14 >= width * 2) {
                rnVar.S6 = (-rnVar.R6) * 2;
            }
            matrix2.setTranslate(rnVar.S6, 0.0f);
            LinearGradient linearGradient3 = rnVar.U6;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(rnVar.S6, 0.0f);
            LinearGradient linearGradient4 = rnVar.Z6;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - rnVar.wa) - ((int) (rnVar.W8(org.telegram.ui.Components.z11.f35132c) + rnVar.v.c()))) - AndroidUtilities.dp(57.0f);
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                int top = getChildAt(i16).getTop();
                if (top < i15) {
                    i15 = top;
                }
            }
            if (rnVar.J6 == 0 && i15 <= 0) {
                rnVar.L6(((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow);
            }
            Paint paintX0 = X0("paintChatActionBackground");
            if (paint3.getColor() != paintX0.getColor()) {
                paint3.setColor(paintX0.getColor());
            }
            if (paint3.getShader() != paintX0.getShader()) {
                paint3.setShader(paintX0.getShader());
                colorMatrix.setSaturation(rn.Ec);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i17 = 0;
            while (i17 < getChildCount()) {
                View childAt = getChildAt(i17);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + s1Var.x2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        f11 = 1.0f;
                        f12 = transitionParams.top + transitionParams.offsetTop;
                    } else {
                        f11 = 1.0f;
                        f12 = 0.0f;
                    }
                    int iLerp = (int) (top2 + f12);
                    i11 = i17;
                    if (rnVar.J6 == 0 && rnVar.D9()) {
                        iLerp = AndroidUtilities.lerp(height, iLerp, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f11) {
                        iLerp = height;
                    }
                    if (iLerp < height) {
                        height = iLerp;
                    }
                } else {
                    i11 = i17;
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        int iLerp2 = (rnVar.J6 == 0 && rnVar.D9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (iLerp2 < height) {
                            height = iLerp2;
                        }
                    }
                }
                i17 = i11 + 1;
            }
            if (rnVar.D9()) {
                boolean z13 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.g6.a1();
                int i18 = org.telegram.ui.ActionBar.g6.f23053d6;
                boolean z14 = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i18, c6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.g6.a1();
                boolean z15 = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i18, c6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.g6.a1();
                if (z13) {
                    org.telegram.ui.ActionBar.g6.q(0.0f, getY() - rnVar.f42209s9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.g6.f23121h2.getAlpha();
                if (z15) {
                    org.telegram.ui.ActionBar.g6.f23121h2.setAlpha((int) (alpha * 4.0f));
                }
                float fCurrentTimeMillis = rnVar.J6 != 0 ? 1.0f - ((System.currentTimeMillis() - rnVar.J6) / 200.0f) : 1.0f;
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                pn pnVar = rnVar.f41983aa;
                float f13 = (pnVar == null || !pnVar.C || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * fCurrentTimeMillis * f13));
                float f14 = alpha2;
                paint2.setAlpha((int) (fCurrentTimeMillis * f13 * f14));
                paint.setAlpha((int) (fCurrentTimeMillis * f14));
                int i19 = 0;
                while (height > rnVar.f42248va) {
                    int iDp3 = height - AndroidUtilities.dp(3.0f);
                    if (i19 >= arrayList3.size()) {
                        gnVar = new gn();
                        TLRPC.Chat chat2 = rnVar.f42026e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            gnVar.f38448b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            gnVar.f38448b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        gnVar.f38447a = (int) Math.min((rnVar.f42213t0.getWidth() * 0.8f) - (z12 ? 0 : AndroidUtilities.dp(42.0f)), (((Utilities.fastRandom.nextFloat() * 0.35f) + 0.4f) * rnVar.f42213t0.getWidth()) + AndroidUtilities.dp(42.0f));
                        arrayList3.add(gnVar);
                    } else {
                        z13 = z13;
                        gnVar = (gn) arrayList3.get(i19);
                    }
                    boolean z16 = z14;
                    gnVar.f38449c = rnVar.J6 != 0 ? arrayList2.size() <= 2 ? Math.min(gnVar.f38449c, iDp3) : gnVar.f38449c : iDp3;
                    height = iDp3 - gnVar.f38448b;
                    i19++;
                    z14 = z16;
                    z13 = z13;
                    d5Var2 = d5Var2;
                }
                org.telegram.ui.ActionBar.d5 d5Var3 = d5Var2;
                boolean z17 = z13;
                boolean z18 = z14;
                if (arrayList3.isEmpty()) {
                    iDp = getHeight() - rnVar.wa;
                    i10 = 0;
                } else {
                    i10 = 0;
                    iDp = ((gn) arrayList3.get(0)).f38449c + AndroidUtilities.dp(3.0f);
                }
                int iDp4 = AndroidUtilities.dp(z12 ? 3.0f : 51.0f);
                if (rnVar.C9()) {
                    iDp4 = AndroidUtilities.lerp(iDp4, AndroidUtilities.dp(71.0f), rnVar.Q8());
                }
                while (i10 < arrayList3.size() && iDp > rnVar.f42248va) {
                    int iDp5 = iDp - AndroidUtilities.dp(3.0f);
                    gn gnVar2 = (gn) arrayList3.get(i10);
                    int i20 = gnVar2.f38449c;
                    ArrayList arrayList4 = arrayList3;
                    boolean z19 = z18;
                    org.telegram.ui.ActionBar.d5 d5Var4 = d5Var3;
                    d5Var4.setBounds(iDp4, i20 - gnVar2.f38448b, gnVar2.f38447a, i20);
                    f3Var2 = f3Var2;
                    if (z17) {
                        d5Var4.d(canvas, f3Var2, paint3);
                    }
                    d5Var4.d(canvas, f3Var2, paint2);
                    if (z19) {
                        d5Var4.d(canvas, f3Var2, org.telegram.ui.ActionBar.g6.f23121h2);
                    }
                    d5Var4.d(canvas, f3Var2, paint);
                    if (z12) {
                        f3Var2 = f3Var2;
                        iDp4 = iDp4;
                        d5Var4 = d5Var4;
                    } else {
                        if (z17) {
                            f10 = 27.0f;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i20 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i20 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z19) {
                            canvas.drawCircle(AndroidUtilities.dp(f10), i20 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.f23121h2);
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i20 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    iDp = iDp5 - gnVar2.f38448b;
                    i10++;
                    arrayList3 = arrayList4;
                    z18 = z19;
                    iDp4 = iDp4;
                    d5Var3 = d5Var4;
                }
                arrayList = arrayList3;
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.g6.f23121h2.setAlpha(alpha);
                invalidate();
            } else {
                arrayList = arrayList3;
                if (System.currentTimeMillis() - rnVar.J6 > j10) {
                    arrayList.clear();
                }
            }
            arrayList.size();
            arrayList2.size();
            if (rnVar.J9 != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var2;
        int backgroundDrawableLeft;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i10;
        float f10;
        boolean zDrawChild;
        float f11;
        boolean z11;
        float f12;
        boolean z12;
        float f13;
        int i11;
        org.telegram.ui.Cells.l4 l4Var;
        float f14;
        int iB;
        org.telegram.ui.Cells.l4 l4Var2;
        int iB2;
        int i12;
        int bottom;
        MessageObject messageObject;
        rn rnVar = this.f39786u3;
        if (rnVar.D9()) {
            invalidate();
        }
        boolean z13 = view == rnVar.F8;
        boolean z14 = view instanceof org.telegram.ui.Cells.s1;
        if (z14) {
            org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) view;
            z10 = s1Var3.Vc.f25186w0;
            s1Var = s1Var3;
        } else {
            s1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.zu0.f35365r0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z13 = true;
        }
        if (z14) {
            s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (rnVar.f42096j6.contains(s1Var2)) {
                z13 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = s1Var2.getCurrentPosition();
            currentMessagesGroup = s1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i13 = currentPosition.pw;
                int i14 = currentPosition.spanSize;
                if (i13 != i14 && i14 == 1000 && currentPosition.siblingHeights == null && currentMessagesGroup.hasSibling) {
                    backgroundDrawableLeft = s1Var2.getBackgroundDrawableLeft();
                    bottom = 0;
                } else if (currentPosition.siblingHeights != null) {
                    bottom = view.getBottom() - AndroidUtilities.dp((s1Var2.l3() ? 1 : 0) + 1);
                    backgroundDrawableLeft = 0;
                } else {
                    backgroundDrawableLeft = 0;
                    bottom = 0;
                }
            } else {
                backgroundDrawableLeft = 0;
                bottom = 0;
            }
            int i15 = s1Var2.G1;
            if ((i15 == 7 || i15 == 4) && (messageObject = s1Var2.f25546u7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(s1Var2.f25546u7)) {
                rnVar.f42181q8 = s1Var2;
            }
            if (!z13) {
                View view2 = rnVar.F8;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) view2;
                    if (s1Var4.getCurrentMessagesGroup() != null && s1Var4.getCurrentMessagesGroup() == currentMessagesGroup) {
                        z13 = true;
                    }
                }
            }
            if (z13) {
                s1Var2.getPhotoImage().skipDraw();
            }
            i10 = bottom;
            v0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.v0) {
                v0Var = (org.telegram.ui.Cells.v0) view;
                s1Var2 = null;
                backgroundDrawableLeft = 0;
            } else {
                s1Var2 = null;
                backgroundDrawableLeft = 0;
                v0Var = null;
            }
            currentMessagesGroup = null;
            i10 = 0;
        }
        if (backgroundDrawableLeft != 0 || i10 != 0) {
            canvas.save();
        }
        if (z13) {
            z13 = false;
        }
        if (z13) {
            f10 = 0.0f;
            zDrawChild = false;
        } else {
            boolean z15 = (s1Var2 == null || s1Var2.Vc.f25183v1 || currentMessagesGroup == null || !currentMessagesGroup.transitionParams.backgroundChangeBounds) ? false : true;
            if (z15) {
                canvas.save();
                float fD2 = s1Var2.D2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                float f15 = transitionParams.left + fD2 + transitionParams.offsetLeft;
                float f16 = transitionParams.top + transitionParams.offsetTop;
                float f17 = transitionParams.right + fD2;
                f10 = 0.0f;
                canvas.clipRect(f15 + AndroidUtilities.dp(4.0f), f16 + AndroidUtilities.dp(4.0f), (f17 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                f10 = 0.0f;
            }
            if (s1Var2 != null) {
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Vc;
                if (r1Var.f25183v1) {
                    canvas.save();
                    canvas.translate(s1Var2.getX(), s1Var2.getY());
                    s1Var2.R1(canvas);
                    canvas.restore();
                    zDrawChild = r1Var.f25118g;
                } else if (s1Var2 != null || z15) {
                    zDrawChild = super.drawChild(canvas, view, j10);
                } else {
                    zDrawChild = super.drawChild(canvas, view, j10);
                }
            } else if (s1Var2 != null) {
                zDrawChild = super.drawChild(canvas, view, j10);
            } else {
                zDrawChild = super.drawChild(canvas, view, j10);
            }
            if (z15) {
                canvas.restore();
            }
            if (s1Var2 != null && s1Var2.T2()) {
                canvas.save();
                canvas.translate(s1Var2.getX(), s1Var2.getPaddingTopAnimated() + s1Var2.getY());
                s1Var2.W1(canvas);
                canvas.restore();
            } else if (v0Var != null) {
                canvas.save();
                canvas.translate(v0Var.getX(), v0Var.getY());
                v0Var.B(canvas);
                canvas.restore();
            }
        }
        if (backgroundDrawableLeft != 0 || i10 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            f11 = 0.0f;
            canvas.translate(0.0f, view.getTranslationY());
        } else {
            f11 = 0.0f;
        }
        if (s1Var2 != null) {
            s1Var2.J1(canvas);
        }
        if (view.getTranslationY() != f11) {
            canvas.restore();
        }
        if (view.getTranslationY() != f11) {
            canvas.save();
            canvas.translate(f11, view.getTranslationY());
        }
        if (s1Var2 != null) {
            MessageObject messageObject2 = s1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = s1Var2.getCurrentPosition();
            if (!z13) {
                if (currentPosition2 != null || s1Var2.getTransitionParams().f25186w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.V2.add(s1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && s1Var2.S2()) {
                            this.W2.add(s1Var2);
                        }
                    }
                    if (currentPosition2 != null || s1Var2.getTransitionParams().C0 || s1Var2.getTransitionParams().f25186w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & s1Var2.s0()) != 0) {
                            this.X2.add(s1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i16 = currentPosition2.flags;
                            if ((i16 & 8) != 0 && (i16 & 1) != 0) {
                                this.Y2.add(s1Var2);
                            }
                        } else {
                            this.Y2.add(s1Var2);
                        }
                    }
                }
                if (rnVar.f42171p8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    float x8 = s1Var2.getX() + photoImage.getImageX();
                    float y10 = (rnVar.f42213t0.getY() + (photoImage.getImageY() + (s1Var2.getY() + s1Var2.getPaddingTop()))) - rnVar.f42171p8.getTop();
                    if (rnVar.f42171p8.getTranslationX() != x8 || rnVar.f42171p8.getTranslationY() != y10) {
                        rnVar.f42171p8.setTranslationX(x8);
                        rnVar.f42171p8.setTranslationY(y10);
                        rnVar.fragmentView.invalidate();
                        rnVar.f42171p8.invalidate();
                    }
                }
            }
        }
        if (s1Var != null) {
            MessageObject messageObject3 = s1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = s1Var.getCurrentPosition();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage == null || rnVar.Q8() >= 1.0f) {
                z11 = zDrawChild;
                f12 = 0.0f;
            } else {
                MessageObject.GroupedMessages groupedMessagesX8 = rnVar.X8(messageObject3);
                if (s1Var.getMessageObject().deleted) {
                    z12 = false;
                } else {
                    rnVar.f42213t0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                boolean z16 = rnVar.f42213t0.T1 || (groupedMessagesX8 != null && groupedMessagesX8.transitionParams.backgroundChangeBounds);
                int paddingTop = view.getPaddingTop() + (z16 ? view.getTop() : (int) view.getY());
                if (s1Var.j()) {
                    if (s1Var.kc) {
                        iB2 = ((SparseArray) rnVar.S8.f2373j).indexOfValue(view);
                        if (iB2 >= 0) {
                            iB2 = ((SparseArray) rnVar.S8.f2373j).keyAt(iB2);
                        }
                    } else {
                        iB2 = rnVar.f42213t0.T(view).b();
                    }
                    if (iB2 >= 0) {
                        if (groupedMessagesX8 != null && currentPosition3 != null) {
                            int iIndexOf = groupedMessagesX8.posArray.indexOf(currentPosition3);
                            f13 = 1.0f;
                            int size = groupedMessagesX8.posArray.size();
                            if ((currentPosition3.flags & 8) != 0) {
                                i12 = (iB2 - size) + iIndexOf;
                            } else {
                                i12 = iB2 - 1;
                                int i17 = iIndexOf + 1;
                                while (true) {
                                    if (i17 < size) {
                                        z11 = zDrawChild;
                                        if (groupedMessagesX8.posArray.get(i17).minY > currentPosition3.maxY) {
                                            break;
                                        }
                                        i12--;
                                        i17++;
                                        zDrawChild = z11;
                                    }
                                }
                            }
                            z11 = zDrawChild;
                            break;
                        } else {
                            z11 = zDrawChild;
                            f13 = 1.0f;
                            i12 = iB2 - 1;
                        }
                        if (s1Var.kc) {
                            if (((View) ((SparseArray) rnVar.S8.f2373j).get(i12)) != null) {
                                if (view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                avatarImage.setVisible(false, false);
                                return z11;
                            }
                        } else if (rnVar.f42213t0.K(i12) != null) {
                            if (view.getTranslationY() != 0.0f) {
                                canvas.restore();
                            }
                            avatarImage.setVisible(false, false);
                            return z11;
                        }
                    } else {
                        z11 = zDrawChild;
                        f13 = 1.0f;
                    }
                } else {
                    z11 = zDrawChild;
                    f13 = 1.0f;
                }
                float checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                int layoutHeight = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().f25128i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z16 ? view.getTop() : view.getY()))))));
                int measuredHeight = rnVar.f42213t0.getMeasuredHeight() - rnVar.f42213t0.getPaddingBottom();
                boolean z17 = (s1Var.f25369i1 || s1Var.f25384j1) && checkBoxTranslation == 0.0f;
                if (s1Var.n3() || s1Var.getTransitionParams().f25140k2) {
                    if (s1Var.getTransitionParams().f25140k2) {
                        float f18 = s1Var.getTransitionParams().K1;
                        if (!s1Var.n3()) {
                            f18 = f13 - f18;
                        }
                        layoutHeight = (int) com.google.android.recaptcha.internal.a.z(1.0f, f18, Math.min(layoutHeight, measuredHeight), layoutHeight * f18);
                    }
                } else if (layoutHeight > measuredHeight) {
                    layoutHeight = measuredHeight;
                }
                if (!z16 && view.getTranslationY() != 0.0f) {
                    canvas.restore();
                }
                if (s1Var.h()) {
                    if (s1Var.kc) {
                        iB = ((SparseArray) rnVar.S8.f2373j).indexOfValue(view);
                        if (iB >= 0) {
                            iB = ((SparseArray) rnVar.S8.f2373j).keyAt(iB);
                        }
                    } else {
                        iB = rnVar.f42213t0.T(view).b();
                    }
                    if (iB >= 0) {
                        float f19 = checkBoxTranslation;
                        org.telegram.ui.Cells.l4 l4Var3 = s1Var;
                        int i18 = iB;
                        int i19 = 0;
                        while (true) {
                            if (i19 < 20) {
                                i19++;
                                if (groupedMessagesX8 == null || currentPosition3 == null) {
                                    i11 = layoutHeight;
                                    i18++;
                                } else {
                                    int iIndexOf2 = groupedMessagesX8.posArray.indexOf(currentPosition3);
                                    if (iIndexOf2 >= 0) {
                                        i11 = layoutHeight;
                                        groupedMessagesX8.posArray.size();
                                        if ((currentPosition3.flags & 4) != 0) {
                                            i18 = i18 + iIndexOf2 + 1;
                                        } else {
                                            i18++;
                                            for (int i20 = iIndexOf2 - 1; i20 >= 0 && groupedMessagesX8.posArray.get(i20).maxY >= currentPosition3.minY; i20--) {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                if (l4Var3.i()) {
                                    View view3 = (View) ((SparseArray) rnVar.S8.f2373j).get(i18);
                                    if (view3 != 0) {
                                        paddingTop = view3.getPaddingTop() + view3.getTop();
                                        if (view3 instanceof org.telegram.ui.Cells.l4) {
                                            l4Var2 = (org.telegram.ui.Cells.l4) view3;
                                            checkBoxTranslation = l4Var2.getCheckBoxTranslation() + l4Var2.getSlidingOffsetX();
                                            if (!z17 || checkBoxTranslation <= 0.0f) {
                                                checkBoxTranslation = f19;
                                            }
                                            if (!l4Var2.h()) {
                                                l4Var = l4Var2;
                                            }
                                            f19 = checkBoxTranslation;
                                            l4Var3 = l4Var2;
                                            layoutHeight = i11;
                                        }
                                    }
                                    l4Var = l4Var3;
                                    checkBoxTranslation = f19;
                                } else {
                                    f2.o1 o1VarK = rnVar.f42213t0.K(i18);
                                    if (o1VarK != null) {
                                        View view4 = o1VarK.f5789a;
                                        paddingTop = view4.getPaddingTop() + view4.getTop();
                                        if (view4 instanceof org.telegram.ui.Cells.s1) {
                                            l4Var2 = (org.telegram.ui.Cells.l4) view4;
                                            checkBoxTranslation = l4Var2.getCheckBoxTranslation() + l4Var2.getSlidingOffsetX();
                                            if (!z17 || checkBoxTranslation <= 0.0f) {
                                                checkBoxTranslation = f19;
                                            }
                                            if (!l4Var2.h()) {
                                                l4Var = l4Var2;
                                            }
                                            f19 = checkBoxTranslation;
                                            l4Var3 = l4Var2;
                                            layoutHeight = i11;
                                        }
                                    }
                                    l4Var = l4Var3;
                                    checkBoxTranslation = f19;
                                }
                            }
                            i11 = layoutHeight;
                            l4Var = l4Var3;
                            checkBoxTranslation = f19;
                        }
                    } else {
                        i11 = layoutHeight;
                        l4Var = s1Var;
                    }
                } else {
                    i11 = layoutHeight;
                    l4Var = s1Var;
                }
                int iDp = i11 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i11;
                if (!l4Var.j()) {
                    int bottom2 = z16 ? view.getBottom() : (int) (l4Var.getDeltaBottom() + l4Var.getY() + l4Var.getMeasuredHeight());
                    if (iDp > bottom2) {
                        iDp = bottom2;
                    }
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                    canvas.translate(checkBoxTranslation, 0.0f);
                }
                if (l4Var instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var5 = (org.telegram.ui.Cells.s1) l4Var;
                    if (s1Var5.getCurrentMessagesGroup() != null && s1Var5.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        iDp = (int) (iDp - s1Var5.getTranslationY());
                    }
                }
                if (z12) {
                    avatarImage.setImageY(iDp - AndroidUtilities.dp(44.0f));
                }
                if (l4Var.a()) {
                    avatarImage.setAlpha(l4Var.getAlpha() * (1.0f - rnVar.Q8()));
                    canvas.scale(l4Var.getScaleX(), l4Var.getScaleY(), l4Var.getPivotX() + l4Var.getX(), l4Var.getY() + (l4Var.getHeight() >> 1));
                    f14 = 1.0f;
                } else {
                    f14 = 1.0f;
                    avatarImage.setAlpha(1.0f - rnVar.Q8());
                }
                if (z12) {
                    avatarImage.setVisible(true, false);
                }
                if (rnVar.Q8() > 0.0f) {
                    canvas.scale(f14 - rnVar.Q8(), f14 - rnVar.Q8(), avatarImage.getImageX2(), avatarImage.getImageY2());
                    f12 = 0.0f;
                    canvas.translate(rnVar.Q8() * AndroidUtilities.dp(24.0f), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z16 && view.getTranslationY() != f12) {
                    canvas.save();
                }
            }
        } else {
            z11 = zDrawChild;
            f12 = 0.0f;
        }
        if (view.getTranslationY() != f12) {
            canvas.restore();
        }
        return z11;
    }

    @Override
    public final void h1(View view, float f10, float f11, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.h1(view, f10, f11, z10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        s1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        int i10;
        float f12;
        int i11;
        String string;
        boolean z10;
        String string2;
        String string3;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        long j10;
        TLRPC.TL_forumTopic tL_forumTopic2;
        float f13;
        float fA;
        float f14;
        float f15;
        float f16;
        Paint paint;
        float f17;
        Paint paint2;
        Paint paint3;
        float f18;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.c6 c6Var;
        super.onDraw(canvas);
        rn rnVar = this.f39786u3;
        org.telegram.ui.Cells.s1 s1Var = rnVar.Z8;
        if (s1Var == null) {
            canvas2 = canvas;
            f10 = 255.0f;
            f11 = 2.0f;
        } else {
            float slidingOffsetX = com.google.android.recaptcha.internal.a.u(s1Var) ? s1Var.getSlidingOffsetX() : 0.0f;
            if (!rnVar.f41982a9 && !rnVar.f41996b9 && this.f39771f3 != 0.0f && slidingOffsetX != 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float f21 = ((jCurrentTimeMillis - this.f39769d3) / 180.0f) + this.f39770e3;
                this.f39770e3 = f21;
                if (f21 > 1.0f) {
                    this.f39770e3 = 1.0f;
                }
                this.f39769d3 = jCurrentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.f39770e3)) * this.f39771f3;
                if (interpolation == 0.0f) {
                    this.f39771f3 = 0.0f;
                }
                org.telegram.ui.Cells.s1 s1Var2 = rnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var2)) {
                    z1(s1Var2, interpolation);
                }
                rn.V1(rnVar, interpolation);
                MessageObject messageObjectT1 = rn.T1(rnVar);
                if (messageObjectT1 != null && (messageObjectT1.isRoundVideo() || messageObjectT1.isVideo())) {
                    rnVar.Mc(false, false);
                }
                float f22 = this.f39770e3;
                if (f22 == 1.0f || f22 == 0.0f) {
                    rn.V1(rnVar, 0.0f);
                    rnVar.Z8 = null;
                }
                invalidate();
            }
            if (rnVar.Z8 == null || Thread.currentThread() != Looper.getMainLooper().getThread()) {
                canvas2 = canvas;
                f10 = 255.0f;
                f11 = 2.0f;
            } else {
                Paint paintX0 = X0("paintChatActionBackground");
                Paint paint4 = org.telegram.ui.ActionBar.g6.f23121h2;
                Paint paint5 = this.f39774i3;
                if (paint5.getColor() != paintX0.getColor()) {
                    paint5.setColor(paintX0.getColor());
                }
                Paint paint6 = this.f39775j3;
                if (paint6.getColor() != paint4.getColor()) {
                    paint6.setColor(paint4.getColor());
                }
                if (paint5.getShader() != paintX0.getShader()) {
                    paint5.setShader(paintX0.getShader());
                }
                if (paint6.getShader() != paint4.getShader()) {
                    paint6.setShader(paint4.getShader());
                }
                hb.a aVar = this.f39778m3;
                float f23 = aVar.f8860a;
                float f24 = this.f39773h3;
                float f25 = f23 / f24;
                f10 = 255.0f;
                int color = paint6.getColor();
                if (f25 > 1.0f) {
                    this.f39782q3 = true;
                }
                f11 = 2.0f;
                org.telegram.ui.Cells.s1 s1Var3 = rnVar.Z8;
                float fD2 = com.google.android.recaptcha.internal.a.u(s1Var3) ? s1Var3.D2(false) : 0.0f;
                hb.a aVar2 = this.f39776k3;
                float f26 = aVar2.f8860a;
                hb.a aVar3 = this.f39780o3;
                o1.j jVar = this.f39781p3;
                o1.j jVar2 = this.f39779n3;
                if (f26 == 0.0f) {
                    jVar2.c();
                    double d = 0.0f;
                    jVar2.f19147u.f19154i = d;
                    aVar.f8860a = 0.0f;
                    jVar.c();
                    jVar.f19147u.f19154i = d;
                    aVar3.f8860a = 0.0f;
                    this.f39782q3 = false;
                }
                if (((float) jVar2.f19147u.f19154i) != f24) {
                    f13 = 1.0f;
                    fA = h7.n.a(((-fD2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f13 = 1.0f;
                    fA = 1.0f;
                }
                if (fA == f13) {
                    o1.k kVar = jVar2.f19147u;
                    f14 = f25;
                    f15 = 20.0f;
                    if (((float) kVar.f19154i) != f24) {
                        double d10 = f24;
                        kVar.f19154i = d10;
                        jVar2.f();
                        jVar.f19147u.f19154i = d10;
                        jVar.f();
                    }
                } else {
                    f14 = f25;
                    f15 = 20.0f;
                }
                float f27 = fD2 <= ((float) (-AndroidUtilities.dp(f15))) ? f24 : 0.0f;
                o1.j jVar3 = this.f39777l3;
                o1.k kVar2 = jVar3.f19147u;
                if (f27 != ((float) kVar2.f19154i)) {
                    kVar2.f19154i = f27;
                    if (!jVar3.f19141f) {
                        jVar3.f();
                    }
                }
                float f28 = aVar2.f8860a / f24;
                MessageObject messageObjectT2 = rn.T1(rnVar);
                float measuredWidth = (fD2 * ((messageObjectT2 == null || !messageObjectT2.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (rnVar.Z8.getMeasuredHeight() / 2.0f) + rnVar.Z8.getTop();
                boolean z11 = this.f39782q3;
                float f29 = z11 ? f14 : f28;
                float f30 = z11 ? 0.0f : 1.0f - f14;
                int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.f35277l2;
                boolean z12 = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2)) <= 0.5d;
                if (f28 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f24;
                    rectF.set((int) ((paint5.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f29))), (int) ((paint5.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f29))), (int) (((AndroidUtilities.dp(16.0f) * f29) + measuredWidth) - (paint5.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f29) + measuredHeight) - (paint5.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f14 == 0.0f) {
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) (alpha * f28));
                        float f31 = fA * 360.0f;
                        f16 = fA;
                        f19 = f28;
                        paint = paint4;
                        c6Var = c6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f31, false, paint5);
                        paint5.setAlpha(alpha);
                        if (rnVar.f41983aa.u0()) {
                            int alpha2 = paint6.getAlpha();
                            paint3 = paint6;
                            if (z12) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha2 * f19));
                            paint2 = paint5;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f31, false, paint3);
                        } else {
                            paint2 = paint5;
                            paint3 = paint6;
                            canvas2 = canvas;
                        }
                    } else {
                        f16 = fA;
                        paint = paint4;
                        f17 = measuredWidth;
                        paint2 = paint5;
                        canvas2 = canvas;
                        f19 = f28;
                        c6Var = c6Var2;
                        paint3 = paint6;
                        f20 = measuredHeight;
                    }
                } else {
                    f16 = fA;
                    paint = paint4;
                    f17 = measuredWidth;
                    paint2 = paint5;
                    canvas2 = canvas;
                    paint3 = paint6;
                    f18 = f24;
                    f19 = f28;
                    f20 = measuredHeight;
                    c6Var = c6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f29)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f29)), (int) ((AndroidUtilities.dp(16.0f) * f29) + f17), (int) ((AndroidUtilities.dp(16.0f) * f29) + f20));
                org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.f39783r3;
                path.rewind();
                float fDp = AndroidUtilities.dp(16.0f) * f29;
                float fDp2 = AndroidUtilities.dp(16.0f) * f29;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, fDp, fDp2, direction);
                int alpha3 = paintX0.getAlpha();
                float f32 = 0.6f * f19 * f16;
                paintX0.setAlpha((int) (alpha3 * f32));
                canvas2.drawPath(path, paintX0);
                paintX0.setAlpha(alpha3);
                if (rnVar.f41983aa.u0()) {
                    int alpha4 = org.telegram.ui.ActionBar.g6.f23121h2.getAlpha();
                    if (z12) {
                        org.telegram.ui.ActionBar.g6.f23121h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.g6.f23121h2.setAlpha((int) (alpha4 * f32));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f23121h2);
                    org.telegram.ui.ActionBar.g6.f23121h2.setAlpha(alpha4);
                }
                if (f30 != 0.0f) {
                    rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f30)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f30)), (int) ((AndroidUtilities.dp(16.0f) * f30) + f17), (int) ((AndroidUtilities.dp(16.0f) * f30) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f29)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f29)), (int) ((AndroidUtilities.dp(16.0f) * f29) + f17), (int) ((AndroidUtilities.dp(16.0f) * f29) + f20));
                org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f29, AndroidUtilities.dp(16.0f) * f29, direction);
                int alpha5 = paintX0.getAlpha();
                float f33 = 0.4f * f19;
                paintX0.setAlpha((int) (alpha5 * f33));
                canvas2.drawPath(path, paintX0);
                paintX0.setAlpha(alpha5);
                if (rnVar.f41983aa.u0()) {
                    int alpha6 = org.telegram.ui.ActionBar.g6.f23121h2.getAlpha();
                    if (z12) {
                        org.telegram.ui.ActionBar.g6.f23121h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.g6.f23121h2.setAlpha((int) (f33 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.g6.f23121h2);
                    org.telegram.ui.ActionBar.g6.f23121h2.setAlpha(alpha6);
                }
                if (f30 != 0.0f) {
                    canvas2.restore();
                }
                float f34 = aVar3.f8860a / f18;
                if (f34 != 0.0f && f34 != 1.0f) {
                    float f35 = f34 + 1.0f;
                    float strokeWidth = paint2.getStrokeWidth();
                    float f36 = (1.0f - f34) * strokeWidth;
                    if (f36 != 0.0f) {
                        rectF2.set((int) ((f17 - (AndroidUtilities.dp(16.0f) * f35)) + f36), (int) ((f20 - (AndroidUtilities.dp(16.0f) * f35)) + f36), (int) (((AndroidUtilities.dp(16.0f) * f35) + f17) - f36), (int) (((AndroidUtilities.dp(16.0f) * f35) + f20) - f36));
                        org.telegram.ui.ActionBar.g6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha7 * f19));
                        paint2.setStrokeWidth(f36);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f35, AndroidUtilities.dp(16.0f) * f35, paint2);
                        paint2.setStrokeWidth(strokeWidth);
                        paint2.setAlpha(alpha7);
                        if (rnVar.f41983aa.u0()) {
                            int alpha8 = paint3.getAlpha();
                            if (z12) {
                                paint3.setColor(-1);
                            }
                            paint3.setAlpha((int) (alpha8 * f19));
                            paint3.setStrokeWidth(f36);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f35, AndroidUtilities.dp(16.0f) * f35, paint3);
                            paint3.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i14 = (int) (f19 * 255.0f);
                Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.g6.O0("drawableReplyIcon");
                }
                drawable.setAlpha(i14);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f29)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f29)), (int) (((drawable.getIntrinsicWidth() / 2) * f29) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f29) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                paint3.setColor(color);
                paint.setColor(color);
            }
        }
        if (rnVar.J9 == 0.0f || rnVar.isInPreviewMode() || rnVar.Ka || (i10 = rnVar.N3) == 3 || i10 == 1) {
            mp mpVar = rnVar.L9;
            if (mpVar != null) {
                mpVar.K = 0.0f;
                mpVar.J = false;
                return;
            }
            return;
        }
        canvas2.save();
        if (rnVar.Q9 != 0.0f) {
            float measuredHeight2 = rnVar.f42213t0.getMeasuredHeight() - rnVar.J9;
            rn rnVar2 = rnVar.P9;
            f12 = (measuredHeight2 + (rnVar2 == null ? 0.0f : rnVar2.K9)) * rnVar.Q9;
        } else {
            f12 = 0.0f;
        }
        canvas2.translate(0.0f, (getMeasuredHeight() - rnVar.wa) - f12);
        if (rnVar.L9 == null) {
            mp mpVar2 = new mp(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.fragmentView, rnVar.P5, rnVar.f42182qa, rnVar.f42196ra, rnVar.b(), rnVar.f41983aa);
            rnVar.L9 = mpVar2;
            mpVar2.O = rnVar.f42184qc.f48497e;
            ArrayList arrayList = rnVar.f41998bb;
            if (arrayList != null && !arrayList.isEmpty()) {
                rnVar.L9.i((TLRPC.Chat) rnVar.f41998bb.get(0));
            } else if (rnVar.f42017d4) {
                rnVar.L9.j();
            } else {
                rnVar.L9.h();
            }
            rnVar.L9.f();
        }
        mp mpVar3 = rnVar.L9;
        int measuredWidth2 = getMeasuredWidth() - (rnVar.C9() ? AndroidUtilities.dp(71.0f) : 0);
        ImageReceiver imageReceiver = mpVar3.B;
        TextPaint textPaint = mpVar3.f40566f;
        TextPaint textPaint2 = mpVar3.h;
        boolean z13 = mpVar3.T;
        if (measuredWidth2 != mpVar3.f40561c || (z13 && (tL_forumTopic2 = mpVar3.D) != null && mpVar3.E != tL_forumTopic2.f22432id)) {
            mpVar3.d = AndroidUtilities.dp(56.0f) / f11;
            mpVar3.f40561c = measuredWidth2;
            TLRPC.Chat chat = mpVar3.C;
            if (chat != null) {
                string = chat.title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic3 = mpVar3.D;
                if (tL_forumTopic3 != null) {
                    string = tL_forumTopic3.title;
                } else if (z13) {
                    i11 = 0;
                    string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(mpVar3.f40558a0).getChat(Long.valueOf(-mpVar3.f40565e0)).title);
                } else {
                    i11 = 0;
                    string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                }
                int iMeasureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                mpVar3.f40573x = iMeasureText;
                int iMin = Math.min(iMeasureText, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
                mpVar3.f40573x = iMin;
                mpVar3.f40571s = org.telegram.ui.Components.tv0.c(string, textPaint, iMin, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, iMin, 1, true);
                if (mpVar3.R) {
                    string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                    string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                } else if (z13) {
                    string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                    string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                } else {
                    z10 = mpVar3.S;
                    if (!z10 && (i12 = mpVar3.f40557a) != mpVar3.f40560b0 && i12 != 0) {
                        string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                        string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                    } else if (z10) {
                        string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                        string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                    } else {
                        string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                        string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                    }
                }
                int iMeasureText2 = (int) textPaint2.measureText(string2);
                mpVar3.f40574y = iMeasureText2;
                mpVar3.f40574y = Math.min(iMeasureText2, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
                int i15 = mpVar3.f40574y;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                mpVar3.v = new StaticLayout(string2, textPaint2, i15, alignment, 1.0f, 0.0f, false);
                int iMeasureText3 = (int) textPaint2.measureText(string3);
                mpVar3.A = iMeasureText3;
                mpVar3.A = Math.min(iMeasureText3, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
                mpVar3.f40572w = new StaticLayout(string3, textPaint2, mpVar3.A, alignment, 1.0f, 0.0f, false);
                imageReceiver.setImageCoords((mpVar3.f40561c / f11) - (AndroidUtilities.dp(40.0f) / f11), (AndroidUtilities.dp(12.0f) + mpVar3.d) - (AndroidUtilities.dp(40.0f) / f11), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f11));
                mpVar3.Y.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                if (z13) {
                    tL_forumTopic = mpVar3.D;
                    if (tL_forumTopic == null) {
                        j10 = 0;
                    } else {
                        j10 = tL_forumTopic.f22432id;
                    }
                    mpVar3.E = j10;
                }
            }
            i11 = 0;
            int iMeasureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
            mpVar3.f40573x = iMeasureText4;
            int iMin2 = Math.min(iMeasureText4, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
            mpVar3.f40573x = iMin2;
            mpVar3.f40571s = org.telegram.ui.Components.tv0.c(string, textPaint, iMin2, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, iMin2, 1, true);
            if (mpVar3.R) {
                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
            } else if (z13) {
                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
            } else {
                z10 = mpVar3.S;
                if (!z10) {
                    if (z10) {
                        string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                        string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                    } else {
                        string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                        string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                    }
                } else if (z10) {
                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                } else {
                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                }
            }
            int iMeasureText5 = (int) textPaint2.measureText(string2);
            mpVar3.f40574y = iMeasureText5;
            mpVar3.f40574y = Math.min(iMeasureText5, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
            int i16 = mpVar3.f40574y;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
            mpVar3.v = new StaticLayout(string2, textPaint2, i16, alignment2, 1.0f, 0.0f, false);
            int iMeasureText6 = (int) textPaint2.measureText(string3);
            mpVar3.A = iMeasureText6;
            mpVar3.A = Math.min(iMeasureText6, mpVar3.f40561c - AndroidUtilities.dp(60.0f));
            mpVar3.f40572w = new StaticLayout(string3, textPaint2, mpVar3.A, alignment2, 1.0f, 0.0f, false);
            imageReceiver.setImageCoords((mpVar3.f40561c / f11) - (AndroidUtilities.dp(40.0f) / f11), (AndroidUtilities.dp(12.0f) + mpVar3.d) - (AndroidUtilities.dp(40.0f) / f11), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f11));
            mpVar3.Y.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
            if (z13) {
                tL_forumTopic = mpVar3.D;
                if (tL_forumTopic == null) {
                    j10 = 0;
                } else {
                    j10 = tL_forumTopic.f22432id;
                }
                mpVar3.E = j10;
            }
        }
        float fMin = Math.min(1.0f, rnVar.J9 / AndroidUtilities.dp(110.0f));
        canvas2.translate(rnVar.C9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), rnVar.Q8()) : 0.0f, -(rnVar.W8(org.telegram.ui.Components.z11.f35132c) + rnVar.O.getInputBubbleHeight() + rnVar.v.c() + AndroidUtilities.dp(10.0f)));
        rnVar.L9.a(canvas2, rnVar.f42213t0, fMin, 1.0f - rnVar.Q9);
        canvas2.restore();
        rn rnVar3 = rnVar.P9;
        if (rnVar3 != null) {
            canvas2.saveLayerAlpha(0.0f, 0.0f, rnVar3.f42213t0.getMeasuredWidth(), rnVar.P9.f42213t0.getMeasuredHeight(), (int) (rnVar.Q9 * f10), 31);
            canvas2.translate(0.0f, (getMeasuredHeight() - rnVar.J9) - f12);
            rnVar.P9.f42213t0.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.f39786u3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dh.k kVar;
        rn rnVar = this.f39786u3;
        km kmVar = rnVar.Y8;
        kmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(kmVar.f25870g0);
            kmVar.f25899z = false;
        }
        if (this.T1 || ((kVar = rnVar.T9) != null && kVar.a())) {
            return false;
        }
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (!((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() && !rnVar.A9()) {
            y1(motionEvent);
        }
        return zOnInterceptTouchEvent;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = this.U2;
        int i15 = i12 - i10;
        rn rnVar = this.f39786u3;
        if (i14 != i15) {
            if (i14 != 0) {
                rnVar.h9(false);
            }
            this.U2 = i15;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f39785t3 != measuredHeight) {
            this.f39784s3 = true;
            mj mjVar = rnVar.f42226u0;
            if (mjVar != null) {
                mjVar.g();
            }
            rnVar.S8.a();
            this.f39784s3 = false;
            this.f39785t3 = measuredHeight;
        }
        rnVar.N5 = false;
        km kmVar = rnVar.Y8;
        if (kmVar != null && kmVar.y()) {
            rnVar.Y8.x();
        }
        rnVar.p9();
        rnVar.D9();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mp mpVar;
        rn rnVar = this.f39786u3;
        ud.a aVar = rnVar.f42184qc;
        km kmVar = rnVar.Y8;
        kmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(kmVar.f25870g0);
            kmVar.f25899z = false;
        }
        if (motionEvent.getAction() == 0) {
            rnVar.f42161oa = true;
        }
        if (rnVar.J9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float fMin = Math.min(1.0f, rnVar.J9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || fMin != 1.0f || (mpVar = rnVar.L9) == null || mpVar.N) {
                mp mpVar2 = rnVar.L9;
                if (mpVar2 == null || !mpVar2.N) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(rnVar.J9, 0.0f);
                    rnVar.M9 = valueAnimatorOfFloat;
                    if (rnVar.L9 != null) {
                        aVar.a(false, true);
                    }
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                        public final kj f39380b;

                        {
                            this.f39380b = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i10) {
                                case 0:
                                    rn rnVar2 = this.f39380b.f39786u3;
                                    rnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rnVar2.f42213t0.invalidate();
                                    break;
                                case 1:
                                    rn rnVar3 = this.f39380b.f39786u3;
                                    rnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rnVar3.f42213t0.invalidate();
                                    break;
                                case 2:
                                    rn rnVar4 = this.f39380b.f39786u3;
                                    rnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rnVar4.f42213t0.invalidate();
                                    break;
                                default:
                                    rn rnVar5 = this.f39380b.f39786u3;
                                    rnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    rnVar5.f42213t0.invalidate();
                                    break;
                            }
                        }
                    });
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(sh.m.V);
                    valueAnimatorOfFloat.start();
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    mp mpVar3 = rnVar.L9;
                    if (jCurrentTimeMillis - mpVar3.Q >= 500 || !mpVar3.I) {
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(rnVar.J9, 0.0f);
                        rnVar.M9 = valueAnimatorOfFloat2;
                        if (rnVar.L9 != null) {
                            aVar.a(false, true);
                        }
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final kj f39380b;

                            {
                                this.f39380b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i10) {
                                    case 0:
                                        rn rnVar2 = this.f39380b.f39786u3;
                                        rnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar2.f42213t0.invalidate();
                                        break;
                                    case 1:
                                        rn rnVar3 = this.f39380b.f39786u3;
                                        rnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar3.f42213t0.invalidate();
                                        break;
                                    case 2:
                                        rn rnVar4 = this.f39380b.f39786u3;
                                        rnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar4.f42213t0.invalidate();
                                        break;
                                    default:
                                        rn rnVar5 = this.f39380b.f39786u3;
                                        rnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar5.f42213t0.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat2.setDuration(250L);
                        valueAnimatorOfFloat2.setInterpolator(sh.m.V);
                        valueAnimatorOfFloat2.start();
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        rnVar.M9 = animatorSet;
                        if (rnVar.L9 != null) {
                            aVar.a(false, true);
                        }
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(rnVar.J9, AndroidUtilities.dp(111.0f));
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final kj f39380b;

                            {
                                this.f39380b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        rn rnVar2 = this.f39380b.f39786u3;
                                        rnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar2.f42213t0.invalidate();
                                        break;
                                    case 1:
                                        rn rnVar3 = this.f39380b.f39786u3;
                                        rnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar3.f42213t0.invalidate();
                                        break;
                                    case 2:
                                        rn rnVar4 = this.f39380b.f39786u3;
                                        rnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar4.f42213t0.invalidate();
                                        break;
                                    default:
                                        rn rnVar5 = this.f39380b.f39786u3;
                                        rnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar5.f42213t0.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat3.setDuration(400L);
                        valueAnimatorOfFloat3.setInterpolator(org.telegram.ui.Components.er.f28122f);
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                            public final kj f39380b;

                            {
                                this.f39380b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        rn rnVar2 = this.f39380b.f39786u3;
                                        rnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar2.f42213t0.invalidate();
                                        break;
                                    case 1:
                                        rn rnVar3 = this.f39380b.f39786u3;
                                        rnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar3.f42213t0.invalidate();
                                        break;
                                    case 2:
                                        rn rnVar4 = this.f39380b.f39786u3;
                                        rnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar4.f42213t0.invalidate();
                                        break;
                                    default:
                                        rn rnVar5 = this.f39380b.f39786u3;
                                        rnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        rnVar5.f42213t0.invalidate();
                                        break;
                                }
                            }
                        });
                        valueAnimatorOfFloat4.setStartDelay(600L);
                        valueAnimatorOfFloat4.setDuration(250L);
                        valueAnimatorOfFloat4.setInterpolator(sh.m.V);
                        animatorSet.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                        animatorSet.start();
                    }
                }
            } else if (mpVar.G != 1.0f) {
                float f10 = rnVar.J9;
                ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(f10, AndroidUtilities.dp(8.0f) + f10);
                rnVar.M9 = valueAnimatorOfFloat5;
                valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                    public final kj f39380b;

                    {
                        this.f39380b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                rn rnVar2 = this.f39380b.f39786u3;
                                rnVar2.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rnVar2.f42213t0.invalidate();
                                break;
                            case 1:
                                rn rnVar3 = this.f39380b.f39786u3;
                                rnVar3.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rnVar3.f42213t0.invalidate();
                                break;
                            case 2:
                                rn rnVar4 = this.f39380b.f39786u3;
                                rnVar4.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rnVar4.f42213t0.invalidate();
                                break;
                            default:
                                rn rnVar5 = this.f39380b.f39786u3;
                                rnVar5.J9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rnVar5.f42213t0.invalidate();
                                break;
                        }
                    }
                });
                valueAnimatorOfFloat5.setDuration(200L);
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
                valueAnimatorOfFloat5.setInterpolator(erVar);
                valueAnimatorOfFloat5.start();
                final mp mpVar4 = rnVar.L9;
                ti tiVar = new ti(this, i12);
                AnimatorSet animatorSet2 = mpVar4.F;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    mpVar4.F.cancel();
                }
                mpVar4.U = tiVar;
                mpVar4.F = new AnimatorSet();
                ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(mpVar4.G, 1.0f);
                valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                mp mpVar5 = mpVar4;
                                mpVar5.getClass();
                                mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mpVar5.P.invalidate();
                                View view = mpVar5.W;
                                if (view != null) {
                                    view.invalidate();
                                }
                                break;
                            default:
                                mp mpVar6 = mpVar4;
                                mpVar6.getClass();
                                mpVar6.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = mpVar6.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                                break;
                        }
                    }
                });
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(mpVar4.H, 0.0f);
                valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                mp mpVar5 = mpVar4;
                                mpVar5.getClass();
                                mpVar5.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mpVar5.P.invalidate();
                                View view = mpVar5.W;
                                if (view != null) {
                                    view.invalidate();
                                }
                                break;
                            default:
                                mp mpVar6 = mpVar4;
                                mpVar6.getClass();
                                mpVar6.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = mpVar6.W;
                                if (view2 != null) {
                                    view2.invalidate();
                                }
                                break;
                        }
                    }
                });
                mpVar4.F.addListener(new am(mpVar4, i12));
                mpVar4.F.playTogether(valueAnimatorOfFloat6, valueAnimatorOfFloat7);
                mpVar4.F.setDuration(120L);
                mpVar4.F.setInterpolator(erVar);
                mpVar4.F.start();
            } else {
                rn.X1(rnVar);
            }
        }
        if (!this.T1) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (((org.telegram.ui.ActionBar.n2) rnVar).actionBar.t() || rnVar.A9()) {
                return zOnTouchEvent;
            }
            y1(motionEvent);
            if (rnVar.f41996b9 || zOnTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.f39786u3.M8 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (this.f39786u3.Z8 != null) {
            y1(null);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f39784s3) {
            return;
        }
        qg.a aVar = this.f39786u3.Mb;
        if (aVar.f46508b != 0) {
            int childCount = aVar.f46507a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.f46507a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override
    public final void setItemAnimator(f2.v0 v0Var) {
        if (this.T1) {
            return;
        }
        super.setItemAnimator(v0Var);
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            rn rnVar = this.f39786u3;
            rnVar.o9();
            rnVar.r9();
        }
    }

    public final void w1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float x8;
        float f10;
        rn rnVar;
        float f11;
        float f12;
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        kj kjVar = this;
        Canvas canvas2 = canvas;
        int childCount = kjVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i15 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            x8 = 0.0f;
            f10 = 2.0f;
            rnVar = kjVar.f39786u3;
            if (i15 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = kjVar.getChildAt(i15);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!rn.d2(rnVar, childAt, rectF)) {
                    if (!(childAt instanceof org.telegram.ui.Cells.t1)) {
                        if (rnVar.f42252w0.f37439n && (childAt instanceof org.telegram.ui.Cells.h0)) {
                            float measuredHeight2 = ((((kjVar.getMeasuredHeight() - rnVar.f42160o9) - rnVar.wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + rnVar.f42160o9;
                            if (!((org.telegram.ui.Cells.h0) childAt).E && !rnVar.f42213t0.T1) {
                                if (childAt.getTop() > measuredHeight2) {
                                    childAt.setTranslationY(measuredHeight2 - childAt.getTop());
                                    break;
                                } else {
                                    childAt.setTranslationY(0.0f);
                                    break;
                                }
                            }
                            break;
                            break;
                        }
                        if (childAt instanceof org.telegram.ui.Cells.ua) {
                            float measuredHeight3 = ((((kjVar.getMeasuredHeight() - rnVar.f42160o9) - rnVar.wa) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + rnVar.f42160o9;
                            if (!((org.telegram.ui.Cells.ua) childAt).J && !rnVar.f42213t0.T1) {
                                if (childAt.getTop() > measuredHeight3) {
                                    childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                                } else {
                                    childAt.setTranslationY(0.0f);
                                }
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                org.telegram.ui.Components.ca0 backgroundDrawable = s1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f27395f || s1Var.f3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z11 = s1Var.f25274b8;
                                    org.telegram.ui.ActionBar.c6 c6Var = kjVar.f35277l2;
                                    if (z11 || s1Var.f25289c8) {
                                        i13 = i15;
                                        if (currentPosition == null) {
                                            Paint paintX0 = kjVar.X0("paintChatMessageBackgroundSelected");
                                            pn pnVar = rnVar.f41983aa;
                                            if ((pnVar == null || !pnVar.C) && paintX0 != null) {
                                                float top = (rnVar.x9() ? rnVar.f42213t0.getTop() : ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight()) - rnVar.T0.getBackgroundTranslationY();
                                                int backgroundSizeY = rnVar.T0.getBackgroundSizeY();
                                                pn pnVar2 = rnVar.f41983aa;
                                                if (pnVar2 != null) {
                                                    pnVar2.m(s1Var.getX(), top, kjVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.g6.q(s1Var.getX(), top, kjVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                paintX0 = org.telegram.ui.ActionBar.g6.a2;
                                                paintX0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hc, c6Var));
                                            }
                                            Paint paint = paintX0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, s1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (s1Var.getAlpha() * s1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, s1Var.getTop(), kjVar.getMeasuredWidth(), s1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y10 = (int) s1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            measuredHeight = s1Var.getMeasuredHeight();
                                            i13 = i15;
                                        } else {
                                            int measuredHeight4 = s1Var.getMeasuredHeight() + y10;
                                            long j10 = 0;
                                            int i16 = 0;
                                            float y11 = 0.0f;
                                            while (i16 < childCount) {
                                                View childAt2 = kjVar.getChildAt(i16);
                                                int i17 = i15;
                                                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.ca0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                                        i14 = i16;
                                                        y10 = Math.min(y10, (int) s1Var2.getY());
                                                        measuredHeight4 = Math.max(measuredHeight4, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                                        long j11 = backgroundDrawable2.f27400l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            x8 = s1Var2.getX() + backgroundDrawable2.h;
                                                            y11 = s1Var2.getY() + backgroundDrawable2.f27397i;
                                                        }
                                                    } else {
                                                        i14 = i16;
                                                    }
                                                } else {
                                                    i14 = i16;
                                                }
                                                i16 = i14 + 1;
                                                i15 = i17;
                                            }
                                            i13 = i15;
                                            backgroundDrawable.f27398j = x8;
                                            backgroundDrawable.f27399k = y11 - y10;
                                            measuredHeight = measuredHeight4 - y10;
                                        }
                                        int i18 = measuredHeight + y10;
                                        canvas2.clipRect(0, y10, kjVar.getMeasuredWidth(), i18);
                                        Paint paintX1 = kjVar.X0("paintChatMessageBackgroundSelected");
                                        pn pnVar3 = rnVar.f41983aa;
                                        if (pnVar3 == null || pnVar3.C || paintX1 == null) {
                                            backgroundDrawable.f27392b = null;
                                            backgroundDrawable.f27391a.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hc, c6Var));
                                        } else {
                                            backgroundDrawable.f27392b = paintX1;
                                            float top2 = (rnVar.x9() ? rnVar.f42213t0.getTop() : ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.getMeasuredHeight()) - rnVar.T0.getBackgroundTranslationY();
                                            int backgroundSizeY2 = rnVar.T0.getBackgroundSizeY();
                                            pn pnVar4 = rnVar.f41983aa;
                                            if (pnVar4 != null) {
                                                pnVar4.m(s1Var.getX(), top2, kjVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.g6.q(s1Var.getX(), top2, kjVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y10, kjVar.getMeasuredWidth(), i18);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i13 = i15;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i13 = i15;
                            }
                            if (rnVar.F8 != s1Var && currentMessagesGroup2 == null && s1Var.B1()) {
                                canvas2.save();
                                canvas2.translate(s1Var.getX(), s1Var.getY() + s1Var.getPaddingTop());
                                if (s1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getHeight() >> 1);
                                }
                                s1Var.C1(canvas2, true, false);
                                canvas2.restore();
                            }
                        } else {
                            i13 = i15;
                            if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                if (v0Var.J()) {
                                    canvas2.save();
                                    canvas2.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                                    canvas2.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(rnVar.R8() / 2.0f, 0.0f);
                                    v0Var.z(canvas2, true);
                                    v0Var.C(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                    } else {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.t1) childAt).a(canvas2);
                        canvas2.restore();
                    }
                }
                i15 = i13 + 1;
            }
            i13 = i15;
            i15 = i13 + 1;
        }
        View view = rnVar.F8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup() : null;
        int i19 = 0;
        while (i19 < 3) {
            ArrayList arrayList = kjVar.Z2;
            arrayList.clear();
            if (i19 != i11 || rnVar.f42213t0.T1) {
                int i20 = 0;
                while (i20 < childCount) {
                    View childAt3 = rnVar.f42213t0.getChildAt(i20);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= rnVar.f42213t0.getHeight() && childAt3.getY() + childAt3.getHeight() >= x8 && s1Var3.getVisibility() != i10 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null) {
                            if (i19 == 0) {
                                i12 = 1;
                                if (currentMessagesGroup.messages.size() != 1) {
                                }
                            } else {
                                i12 = 1;
                            }
                            if ((i19 != i12 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i19 != 0 || !s1Var3.getMessageObject().deleted) && ((i19 != 1 || s1Var3.getMessageObject().deleted) && ((i19 != i11 || s1Var3.kc) && (i19 == i11 || !s1Var3.kc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = s1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var3.m3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.l3();
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i21 = backgroundDrawableTop;
                                if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i22 = backgroundDrawableBottom;
                                if (s1Var3.kc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i23 = transitionParams2.top;
                                if (i23 == 0 || i21 < i23) {
                                    transitionParams2.top = i21;
                                }
                                int i24 = transitionParams2.bottom;
                                if (i24 == 0 || i22 > i24) {
                                    transitionParams2.bottom = i22;
                                }
                                int i25 = transitionParams2.left;
                                if (i25 == 0 || backgroundDrawableLeft < i25) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i26 = transitionParams2.right;
                                if (i26 == 0 || backgroundDrawableRight > i26) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                            }
                        }
                    }
                    i20++;
                    i10 = 8;
                    i11 = 2;
                    x8 = 0.0f;
                }
                int i27 = 0;
                while (i27 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i27);
                    float fD2 = groupedMessages2.transitionParams.cell.D2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f13 = transitionParams3.left + fD2 + transitionParams3.offsetLeft;
                    float translationY = transitionParams3.top + transitionParams3.offsetTop;
                    float f14 = transitionParams3.offsetRight + transitionParams3.right + fD2;
                    float fDp = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        translationY += transitionParams3.cell.getTranslationY();
                        fDp += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f15 = translationY;
                    if (fDp > AndroidUtilities.dp(20.0f) + rnVar.f42213t0.getMeasuredHeight()) {
                        fDp = AndroidUtilities.dp(20.0f) + rnVar.f42213t0.getMeasuredHeight();
                    }
                    float f16 = fDp;
                    boolean z12 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z12) {
                        canvas2.save();
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), com.google.android.recaptcha.internal.a.A(f14, f13, f10, f13), com.google.android.recaptcha.internal.a.A(f16, f15, f10, f15));
                    }
                    int size = groupedMessages2.messages.size();
                    int i28 = 0;
                    while (true) {
                        if (i28 >= size) {
                            f12 = f16;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i28);
                        f12 = f16;
                        if (rnVar.S5[messageObject.getDialogId() == rnVar.P5 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i28++;
                            f16 = f12;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f17 = f12;
                    rn rnVar2 = rnVar;
                    transitionParams4.cell.A1(canvas, (int) f13, (int) f15, (int) f14, (int) f17, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z12) {
                        canvas.restore();
                        for (int i29 = 0; i29 < childCount; i29++) {
                            View childAt4 = rnVar2.f42213t0.getChildAt(i29);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top3 = s1Var4.getTop();
                                    childAt4.setPivotX(((f14 - f13) / 2.0f) + (f13 - left));
                                    childAt4.setPivotY(((f17 - f15) / 2.0f) + (f15 - top3));
                                }
                            }
                        }
                    }
                    i27++;
                    canvas2 = canvas;
                    rnVar = rnVar2;
                    i19 = i19;
                    f10 = 2.0f;
                }
            }
            canvas2 = canvas;
            rnVar = rnVar;
            i10 = 8;
            i11 = 2;
            x8 = 0.0f;
            f10 = 2.0f;
            i19++;
            kjVar = this;
        }
    }

    public final void x1(Canvas canvas, RectF rectF) {
        float f10;
        ArrayList arrayList = this.V2;
        int size = arrayList.size();
        rn rnVar = this.f39786u3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList.get(i10);
                if (!rn.d2(rnVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.D2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    s1Var.l2(s1Var.a() ? s1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList.clear();
        }
        ArrayList arrayList2 = this.W2;
        int size2 = arrayList2.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList2.get(i11);
                if (!rn.d2(rnVar, s1Var2, rectF)) {
                    float fD2 = s1Var2.D2(false) + s1Var2.getLeft();
                    float y10 = s1Var2.getY() + s1Var2.getPaddingTop();
                    float alpha = s1Var2.a() ? s1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(fD2, y10);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.V1(canvas, alpha);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.X2;
        int size3 = arrayList3.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList3.get(i12);
                if (rn.d2(rnVar, s1Var3, rectF)) {
                    arrayList3 = arrayList3;
                } else {
                    boolean z12 = s1Var3.getCurrentPosition() != null && (s1Var3.getCurrentPosition().flags & z10) == 0;
                    float alpha2 = s1Var3.a() ? s1Var3.getAlpha() : 1.0f;
                    float fD3 = s1Var3.D2(z11) + s1Var3.getLeft();
                    float y11 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float fD4 = s1Var3.D2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f11 = transitionParams.left + fD4 + transitionParams.offsetLeft;
                        float translationY = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + fD4 + transitionParams.offsetRight;
                        float translationY2 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            translationY += s1Var3.getTranslationY();
                            translationY2 += s1Var3.getTranslationY();
                        }
                        canvas.clipRect(f11 + AndroidUtilities.dp(8.0f), translationY + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), translationY2 - AndroidUtilities.dp(8.0f));
                    }
                    if (s1Var3.getTransitionParams().f25182v0) {
                        canvas.translate(fD3, y11);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.H1(alpha2, canvas, z12);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList3 = arrayList3;
                z10 = 1;
                z11 = false;
            }
            f10 = 8.0f;
            arrayList3.clear();
        } else {
            f10 = 8.0f;
        }
        ArrayList arrayList4 = this.Y2;
        int size4 = arrayList4.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList4.get(i13);
                if (!rn.d2(rnVar, s1Var4, rectF)) {
                    boolean z13 = s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = s1Var4.a() ? s1Var4.getAlpha() : 1.0f;
                    float fD5 = s1Var4.D2(false) + s1Var4.getLeft();
                    float y12 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float fD6 = s1Var4.D2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f13 = transitionParams2.left + fD6 + transitionParams2.offsetLeft;
                        float translationY3 = transitionParams2.top + transitionParams2.offsetTop;
                        float f14 = transitionParams2.right + fD6 + transitionParams2.offsetRight;
                        float translationY4 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            translationY3 += s1Var4.getTranslationY();
                            translationY4 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f13 + AndroidUtilities.dp(f10), translationY3 + AndroidUtilities.dp(f10), f14 - AndroidUtilities.dp(f10), translationY4 - AndroidUtilities.dp(f10));
                    }
                    if (!z13 && s1Var4.getTransitionParams().f25182v0) {
                        canvas.translate(fD5, y12);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.c2(canvas, alpha3, null);
                        s1Var4.M1(canvas, alpha3);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList4.clear();
        }
    }

    public final void y1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages groupedMessagesY8;
        MessageObject messageObject;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        rn rnVar = this.f39786u3;
        if (motionEvent != null) {
            rnVar.f42294z4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !rnVar.f41996b9 && !rnVar.f41982a9 && rnVar.Z8 == null && !((org.telegram.ui.ActionBar.n2) rnVar).inPreviewMode) {
            View pressedChildView = getPressedChildView();
            if (pressedChildView instanceof org.telegram.ui.Cells.s1) {
                if (rnVar.Z8 != null) {
                    rn.V1(rnVar, 0.0f);
                }
                rnVar.Z8 = (org.telegram.ui.Cells.s1) pressedChildView;
                MessageObject messageObjectT1 = rn.T1(rnVar);
                boolean zF6 = rnVar.F6(messageObjectT1);
                int i10 = rnVar.N3;
                if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || rnVar.Z3 != rnVar.getUserConfig().getClientUserId())) || (((arrayList = rnVar.W3) != null && arrayList.contains(messageObjectT1)) || ((rnVar.E8(messageObjectT1) == 1 && (messageObjectT1.getDialogId() == rnVar.H6 || messageObjectT1.needDrawBluredPreview())) || ((rnVar.h == null && messageObjectT1.getId() < 0) || (((chat2 = rnVar.f42026e) != null && ChatObject.isForum(chat2) && !zF6) || rnVar.b9() || (messageObjectT1.isEphemeral() && messageObjectT1.isOut())))))) {
                    rn.V1(rnVar, 0.0f);
                    rnVar.Z8 = null;
                    return;
                } else {
                    this.f39768c3 = motionEvent.getPointerId(0);
                    rnVar.f41982a9 = true;
                    this.a3 = (int) motionEvent.getX();
                    this.f39767b3 = (int) motionEvent.getY();
                    return;
                }
            }
            return;
        }
        if (rnVar.Z8 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.f39768c3) {
            int iMax = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.a3)));
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.f39767b3);
            if (getScrollState() == 0 && rnVar.f41982a9 && !rnVar.f41996b9 && iMax <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(iMax) / 3 > iAbs) {
                MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                rnVar.Z8.onTouchEvent(motionEventObtain);
                super.onInterceptTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                rnVar.f42239v0.R = false;
                rnVar.f41982a9 = false;
                rnVar.f41996b9 = true;
                this.a3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (rnVar.f41996b9) {
                if (Math.abs(iMax) < AndroidUtilities.dp(50.0f)) {
                    this.f39772g3 = false;
                } else if (!this.f39772g3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.f39772g3 = true;
                }
                float f10 = iMax;
                rn.V1(rnVar, f10);
                MessageObject messageObjectT2 = rn.T1(rnVar);
                if (messageObjectT2 != null && (messageObjectT2.isRoundVideo() || messageObjectT2.isVideo())) {
                    rnVar.Mc(false, false);
                }
                org.telegram.ui.Cells.s1 s1Var = rnVar.Z8;
                if (com.google.android.recaptcha.internal.a.u(s1Var)) {
                    z1(s1Var, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (rnVar.Z8 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.f39768c3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                org.telegram.ui.Cells.s1 s1Var2 = rnVar.Z8;
                if (Math.abs(com.google.android.recaptcha.internal.a.u(s1Var2) ? s1Var2.D2(false) : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject messageObjectT3 = rn.T1(rnVar);
                    boolean zF7 = rnVar.F6(messageObjectT3);
                    hk hkVar = rnVar.K0;
                    if ((hkVar == null || hkVar.getVisibility() != 0 || ((rnVar.E0 && zF7) || messageObjectT3.wasJustSent)) && ((chat = rnVar.f42026e) == null || ((!ChatObject.isNotInChat(chat) || rnVar.F9()) && ((!ChatObject.isChannel(rnVar.f42026e) || ChatObject.canPost(rnVar.f42026e) || rnVar.f42026e.megagroup) && ChatObject.canSendMessages(rnVar.f42026e))))) {
                        rnVar.Bb(rn.T1(rnVar));
                    } else {
                        if (messageObjectT3.getGroupId() != 0 && (groupedMessagesY8 = rnVar.y8(messageObjectT3.getGroupId())) != null && (messageObject = groupedMessagesY8.captionMessage) != null) {
                            messageObjectT3 = messageObject;
                        }
                        rnVar.f42095j5 = messageObjectT3;
                        Bundle bundleE = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
                        bundleE.putBoolean("quote", true);
                        bundleE.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(messageObjectT3.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != rnVar.a() && peerDialogId != rnVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            bundleE.putLong("reply_to_author", peerDialogId);
                        }
                        bundleE.putInt("messagesCount", 1);
                        bundleE.putBoolean("canSelectTopics", true);
                        gy gyVar = new gy(bundleE);
                        gyVar.f38621y2 = rnVar;
                        rnVar.presentFragment(gyVar);
                    }
                }
            }
            org.telegram.ui.Cells.s1 s1Var3 = rnVar.Z8;
            float slidingOffsetX = com.google.android.recaptcha.internal.a.u(s1Var3) ? s1Var3.getSlidingOffsetX() : 0.0f;
            this.f39771f3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                rnVar.Z8 = null;
            }
            this.f39769d3 = System.currentTimeMillis();
            this.f39770e3 = 0.0f;
            invalidate();
            rnVar.f41982a9 = false;
            rnVar.f41996b9 = false;
            rnVar.f42239v0.R = true;
        }
    }

    public final void z1(org.telegram.ui.Cells.s1 s1Var, float f10) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f10);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }
}
