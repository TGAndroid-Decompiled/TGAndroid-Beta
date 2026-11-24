package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class ProfileStoriesView extends View implements gk7 {
    public static final int t0 = 0;
    public ty8 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public f2b L;
    public final v2b M;
    public final g2b N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final lm U;
    public final lm V;
    public final lm W;
    public final Paint a;
    public float a0;
    public final Paint b;
    public ValueAnimator b0;
    public final int c;
    public final Path c0;
    public final long d;
    public final Matrix d0;
    public final boolean e;
    public final PathMeasure e0;
    public final oc6 f;
    public final Path f0;
    public float g0;
    public final xm8 h;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public boolean l0;
    public final lm m0;
    public final gn n;
    public final lm n0;
    public final pj4 o0;
    public final yr8 p0;
    public long q0;
    public int r;
    public float r0;
    public int s;
    public float s0;
    public zr8 w;
    public final ArrayList x;
    public boolean y;

    public ProfileStoriesView(Context context, int i, long j, boolean z, oc6 oc6Var, xm8 xm8Var, wjb wjbVar) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        gn gnVar = new gn(false, true, true);
        this.n = gnVar;
        Paint paint4 = new Paint(1);
        this.x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new v2b(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        s33 s33Var = s33.h;
        this.U = new lm(this, 0L, 480L, s33Var);
        this.V = new lm(this, 0L, 240L, s33Var);
        this.W = new lm(this, 0L, 150L, s33.f);
        this.a0 = 1.0f;
        this.c0 = new Path();
        this.d0 = new Matrix();
        this.e0 = new PathMeasure();
        this.f0 = new Path();
        this.m0 = new lm(this, 0L, 350L, s33Var);
        this.n0 = new lm(this, 0L, 350L, s33Var);
        an8 an8Var = (an8) this;
        this.o0 = new pj4(an8Var, (byte) 28);
        this.p0 = new yr8(an8Var, (byte) 0);
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = oc6Var;
        this.h = xm8Var;
        xm8Var.getImageReceiver().F1 = new yr8(an8Var, (byte) 1);
        this.N = na7.q1(i).M1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(gl.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(bkb.v0(bkb.dl, wjbVar));
        paint2.setStrokeWidth(gl.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(bkb.v0(bkb.c6, wjbVar));
        gnVar.w(gl.L(18.0f));
        gnVar.n(0.4f, 320L, s33Var);
        gnVar.x(gl.o());
        gnVar.u(-1);
        gnVar.q(true);
        gnVar.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(gl.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static zr8 d(zr8 zr8Var, zr8 zr8Var2, zr8 zr8Var3) {
        if (zr8Var3 != null) {
            RectF rectF = zr8Var3.n;
            if (zr8Var == null) {
                if (zr8Var2 != null) {
                    return zr8Var2;
                }
                return null;
            }
            RectF rectF2 = zr8Var.n;
            if (zr8Var2 != null) {
                RectF rectF3 = zr8Var2.n;
                if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) <= Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                    return zr8Var2;
                }
            }
            return zr8Var;
        }
        return null;
    }

    private float getExpandRight() {
        return this.j0 - (this.m0.d(this.l0) * gl.L(71.0f));
    }

    public final void a(Canvas canvas, zr8 zr8Var, zr8 zr8Var2) {
        if (zr8Var2 == null) {
            return;
        }
        RectF rectF = zr8Var2.m;
        RectF rectF2 = gl.P;
        rectF2.set(rectF);
        float f = -(gl.N(1.66f) * zr8Var2.j);
        rectF2.inset(f, f);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = zr8Var.m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.T;
        path.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
            path.arcTo(rectF2, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
            float f2 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f2);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f2));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f, float f2, Canvas canvas, Paint paint, RectF rectF) {
        if (hc2.b0(y6c.t0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f2) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f3 = f + f2;
            float f4 = (((int) f3) / 90) * 90;
            float f5 = (-199.0f) + f4;
            Path path = this.c0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.d0;
            matrix.reset();
            matrix.postRotate(f4, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.e0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f0;
            path2.reset();
            pathMeasure.getSegment(((f3 - f5) / 360.0f) * length, length * (((f3 - f2) - f5) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f, f2, false, paint);
    }

    public final void c(Canvas canvas, zr8 zr8Var, zr8 zr8Var2, zr8 zr8Var3, Paint paint) {
        boolean z;
        double degrees;
        double degrees2;
        float width;
        zr8 zr8Var4 = zr8Var;
        RectF rectF = zr8Var2.n;
        if (zr8Var4 == null) {
            if (zr8Var3 == null) {
                b(0.0f, 360.0f, canvas, paint, rectF);
                return;
            }
            zr8Var4 = zr8Var3;
        } else {
            RectF rectF2 = zr8Var4.n;
            if (zr8Var3 != null) {
                RectF rectF3 = zr8Var3.n;
                float centerX = rectF2.centerX();
                float width2 = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width3 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width4 = rectF3.width() / 2.0f;
                boolean z2 = false;
                if (centerX > centerX2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX - width2)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX + width2)) / 2.0f) - centerX2) / width3));
                }
                float f = (float) degrees;
                if (centerX3 > centerX2) {
                    z2 = true;
                }
                if (z2) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX3 - width4)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX3 + width4)) / 2.0f) - centerX2) / width3));
                }
                float f2 = (float) degrees2;
                if (z) {
                    if (z2) {
                        float max = Math.max(f, f2);
                        b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                        return;
                    }
                    b(f2 + 180.0f, 180.0f - (f + f2), canvas, paint, rectF);
                    b(f, (180.0f - f2) - f, canvas, paint, rectF);
                    return;
                } else if (z2) {
                    b(f + 180.0f, 180.0f - (f2 + f), canvas, paint, rectF);
                    b(f2, (180.0f - f2) - f, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(f, f2);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        RectF rectF4 = zr8Var4.n;
        float centerX4 = rectF4.centerX();
        float width5 = rectF4.width() / 2.0f;
        float centerX5 = rectF.centerX();
        if (Math.abs(centerX4 - centerX5) > width5 + (rectF.width() / 2.0f)) {
            b(0.0f, 360.0f, canvas, paint, rectF);
        } else if (centerX4 > centerX5) {
            float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 + width) + (centerX4 - width5)) / 2.0f) - centerX5) / width));
            b(degrees3, 360.0f - (2.0f * degrees3), canvas, paint, rectF);
        } else {
            float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 - width) + (centerX4 + width5)) / 2.0f) - centerX5) / width));
            b(degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), canvas, paint, rectF);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x5) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean z, boolean z2) {
        boolean z3;
        TL_stories.PeerStories peerStories;
        int i;
        ArrayList<TL_stories.StoryItem> arrayList;
        int i2;
        int i3;
        ArrayList arrayList2;
        g2b g2bVar;
        int i4;
        int size;
        int i5;
        boolean z4;
        String str;
        int i6;
        da7 d;
        TLRPC.PeerColor peerColor;
        int i7;
        da7 d2;
        TLRPC.PeerColor peerColor2;
        boolean z5;
        TL_stories.StoryItem storyItem;
        boolean z6;
        int i8;
        int i9;
        int i10;
        if (this.e) {
            return;
        }
        int i11 = this.c;
        long e = y6c.h(i11).e();
        long j = this.d;
        int i12 = 0;
        if (j == e) {
            z3 = true;
        } else {
            z3 = false;
        }
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        TL_stories.PeerStories y = na7.q1(i11).M1().y(j);
        TL_stories.PeerStories x = na7.q1(i11).M1().x(j);
        int i13 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i13 == 0) {
            peerStories = null;
        } else {
            peerStories = y;
        }
        if (y != null) {
            i = Math.max(0, y.max_read_id);
        } else {
            i = 0;
        }
        if (x != null) {
            i = Math.max(i, x.max_read_id);
        }
        if (peerStories == null || (arrayList = peerStories.stories) == null) {
            arrayList = new ArrayList<>();
        }
        ArrayList arrayList3 = new ArrayList();
        boolean z7 = true;
        int i14 = this.r;
        this.r = 0;
        boolean z8 = z3;
        int i15 = 0;
        while (i12 < arrayList.size()) {
            TL_stories.StoryItem storyItem2 = arrayList.get(i12);
            int i16 = i12;
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                if (storyItem2.id > i) {
                    this.r++;
                }
                i15++;
            }
            i12 = i16 + 1;
        }
        int i17 = 0;
        while (true) {
            i2 = i14;
            if (i17 < arrayList.size()) {
                TL_stories.StoryItem storyItem3 = arrayList.get(i17);
                if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                    i10 = i17;
                } else {
                    if (storyItem3 instanceof TL_stories.TL_storyItemSkipped) {
                        int i18 = storyItem3.id;
                        i10 = i17;
                        if (x != null) {
                            for (int i19 = 0; i19 < x.stories.size(); i19++) {
                                if (x.stories.get(i19).id == i18) {
                                    storyItem3 = x.stories.get(i19);
                                    break;
                                }
                            }
                        }
                        storyItem3 = storyItem3;
                        boolean z9 = storyItem3 instanceof TL_stories.TL_storyItemSkipped;
                        if (z9) {
                            if (y != null) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= y.stories.size()) {
                                        break;
                                    } else if (y.stories.get(i20).id == i18) {
                                        y.stories.get(i20);
                                        break;
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                        } else if (z9) {
                            continue;
                        }
                    } else {
                        i10 = i17;
                    }
                    int i21 = storyItem3.expire_date;
                    if ((i21 == 0 || currentTime <= i21) && (z8 || storyItem3.id > i)) {
                        arrayList3.add(storyItem3);
                        i3 = 3;
                        if (arrayList3.size() >= 3) {
                            break;
                        }
                    }
                }
                i17 = i10 + 1;
                i14 = i2;
            } else {
                i3 = 3;
                break;
            }
        }
        if (arrayList3.size() < i3) {
            for (int i22 = 0; i22 < arrayList.size(); i22 = i8 + 1) {
                TL_stories.StoryItem storyItem4 = arrayList.get(i22);
                if (storyItem4 instanceof TL_stories.TL_storyItemSkipped) {
                    int i23 = storyItem4.id;
                    i8 = i22;
                    if (x != null) {
                        int i24 = 0;
                        while (true) {
                            if (i24 >= x.stories.size()) {
                                break;
                            } else if (x.stories.get(i24).id == i23) {
                                storyItem4 = x.stories.get(i24);
                                break;
                            } else {
                                i24++;
                            }
                        }
                    }
                    boolean z10 = storyItem4 instanceof TL_stories.TL_storyItemSkipped;
                    if (z10) {
                        if (y != null) {
                            int i25 = 0;
                            while (true) {
                                if (i25 >= y.stories.size()) {
                                    break;
                                } else if (y.stories.get(i25).id == i23) {
                                    y.stories.get(i25);
                                    break;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    } else if (z10) {
                        continue;
                    }
                } else {
                    i8 = i22;
                }
                if (!(storyItem4 instanceof TL_stories.TL_storyItemDeleted) && (((i9 = storyItem4.expire_date) == 0 || currentTime <= i9) && !arrayList3.contains(storyItem4))) {
                    arrayList3.add(storyItem4);
                    if (arrayList3.size() >= 3) {
                        break;
                    }
                }
            }
        }
        int i26 = 0;
        while (true) {
            arrayList2 = this.x;
            int size2 = arrayList2.size();
            g2bVar = this.N;
            i4 = -1;
            if (i26 >= size2) {
                break;
            }
            zr8 zr8Var = (zr8) arrayList2.get(i26);
            int i27 = 0;
            while (true) {
                if (i27 < arrayList3.size()) {
                    storyItem = (TL_stories.StoryItem) arrayList3.get(i27);
                    if (storyItem.id == zr8Var.a) {
                        break;
                    }
                    i27++;
                } else {
                    i27 = -1;
                    storyItem = null;
                    break;
                }
            }
            if (i27 == -1) {
                zr8Var.e = 0.0f;
            } else {
                zr8Var.c = i27;
                if (!z8 && (peerStories == null || storyItem == null || storyItem.id > g2bVar.w(j))) {
                    z6 = false;
                } else {
                    z6 = z7;
                }
                zr8Var.d = z6;
            }
            if (!z) {
                boolean z11 = z7;
                zr8Var.f.f(zr8Var.d, z11);
                zr8Var.g.e(z11, zr8Var.c);
                zr8Var.h.e(z11, zr8Var.e);
            }
            i26++;
            z7 = true;
        }
        int i28 = 0;
        while (i28 < arrayList3.size()) {
            TL_stories.StoryItem storyItem5 = (TL_stories.StoryItem) arrayList3.get(i28);
            int i29 = 0;
            while (true) {
                if (i29 < arrayList2.size()) {
                    if (((zr8) arrayList2.get(i29)).a == storyItem5.id) {
                        break;
                    }
                    i29++;
                } else {
                    i29 = i4;
                    break;
                }
            }
            if (i29 == i4) {
                storyItem5.dialogId = j;
                zr8 zr8Var2 = new zr8(this, storyItem5);
                zr8Var2.c = i28;
                zr8Var2.e = 1.0f;
                lm lmVar = zr8Var2.h;
                lmVar.e(true, 0.0f);
                if (!z8 && (peerStories == null || storyItem5.id > peerStories.max_read_id)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                zr8Var2.d = z5;
                if (!z) {
                    zr8Var2.f.f(z5, true);
                    zr8Var2.g.e(true, zr8Var2.c);
                    lmVar.e(true, zr8Var2.e);
                }
                arrayList2.add(zr8Var2);
            }
            i28++;
            i4 = -1;
        }
        this.w = null;
        int i30 = 0;
        while (true) {
            if (i30 >= arrayList2.size()) {
                break;
            }
            zr8 zr8Var3 = (zr8) arrayList2.get(i30);
            if (zr8Var3.e > 0.0f) {
                this.w = zr8Var3;
                break;
            }
            i30++;
        }
        ArrayList E = g2bVar.E(j);
        if (E == null) {
            size = 0;
        } else {
            size = E.size();
        }
        this.K = size;
        int max = Math.max(arrayList3.size(), i15);
        if (max == 0 && this.K != 0) {
            i5 = 1;
        } else {
            i5 = max;
        }
        if (z2 && z && i5 == this.s + 1 && this.r == i2 + 1) {
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean[] zArr = {false};
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b0 = ofFloat;
            ofFloat.addUpdateListener(new pk(this, zArr, (byte) 21));
            this.b0.addListener(new eh8(this, zArr, (byte) 3));
            b00.n(3.0f, this.b0);
            this.b0.setDuration(400L);
            this.b0.setStartDelay(120L);
            this.b0.start();
        }
        this.s = i5;
        if (i5 > 0) {
            z4 = false;
            str = k96.G(i5, "Stories", new Object[0]);
        } else {
            z4 = false;
            str = "";
        }
        if (z && !k96.a0) {
            z4 = true;
        }
        this.n.t(str, z4, true);
        v2b v2bVar = this.M;
        if (i13 >= 0) {
            TLRPC.User V1 = na7.q1(i11).V1(Long.valueOf(j));
            if (V1 != null) {
                TLRPC.EmojiStatus emojiStatus = V1.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    v2bVar.c(da7.a(emojiStatus), z);
                }
            }
            v2bVar.getClass();
            if (V1 != null && (peerColor2 = V1.profile_color) != null) {
                i7 = peerColor2.color;
            } else {
                i7 = -1;
            }
            ea7 ea7Var = na7.q1(v2bVar.a).F3;
            if (ea7Var == null) {
                d2 = null;
            } else {
                d2 = ea7Var.d(i7);
            }
            v2bVar.c(d2, z);
        } else {
            TLRPC.Chat K0 = na7.q1(i11).K0(Long.valueOf(-j));
            if (K0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = K0.emoji_status;
                if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                    v2bVar.c(da7.a(emojiStatus2), z);
                }
            }
            v2bVar.getClass();
            if (K0 != null && (peerColor = K0.profile_color) != null) {
                i6 = peerColor.color;
            } else {
                i6 = -1;
            }
            ea7 ea7Var2 = na7.q1(v2bVar.a).F3;
            if (ea7Var2 == null) {
                d = null;
            } else {
                d = ea7Var2.d(i6);
            }
            v2bVar.c(d, z);
        }
        invalidate();
    }

    public float getFragmentTransitionProgress() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i < arrayList.size()) {
                ((zr8) arrayList.get(i)).b.I();
                i++;
            } else {
                kk7.f(this.c).b(this, kk7.x5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.y = false;
        while (true) {
            ArrayList arrayList = this.x;
            if (i < arrayList.size()) {
                ((zr8) arrayList.get(i)).b.K();
                i++;
            } else {
                kk7.f(this.c).n(this, kk7.x5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.O < 0.9f) {
            z = this.R.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.g0 && motionEvent.getX() <= this.h0 && Math.abs(motionEvent.getY() - this.i0) < gl.L(32.0f)) {
            z = true;
        } else {
            z = false;
        }
        yr8 yr8Var = this.p0;
        if (z && motionEvent.getAction() == 0) {
            this.q0 = System.currentTimeMillis();
            this.r0 = motionEvent.getX();
            this.s0 = motionEvent.getY();
            gl.r(yr8Var);
            gl.e3(yr8Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            gl.r(yr8Var);
            if (z && System.currentTimeMillis() - this.q0 <= ViewConfiguration.getTapTimeout() && loe.a(this.r0, this.s0, motionEvent.getX(), motionEvent.getY()) <= gl.L(12.0f)) {
                g2b g2bVar = this.N;
                long j = this.d;
                if (g2bVar.L(j) || g2bVar.J(j) || !this.x.isEmpty()) {
                    e(this.o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.q0 = -1L;
            gl.r(yr8Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f) {
        if (bkb.I.o()) {
            return;
        }
        this.P = f;
        invalidate();
    }

    public void setExpandProgress(float f) {
        if (this.O != f) {
            this.O = f;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f) {
        if (this.J == f) {
            return;
        }
        this.J = f;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f) {
        if (this.I == f) {
            return;
        }
        this.I = f;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(pj4 pj4Var) {
    }
}
