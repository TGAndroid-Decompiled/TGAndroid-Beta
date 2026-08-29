package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o50 extends FrameLayout {
    public int A;
    public int B;
    public float C;
    public long D;
    public final float[] E;
    public boolean F;
    public final r50 G;
    public final org.telegram.ui.Components.aj0 f40978a;
    public final TextView f40979b;
    public final TLRPC.GroupCallParticipant f40980c;
    public final org.telegram.ui.Components.xi0 d;
    public boolean f40981e;
    public float f40982f;
    public float h;
    public int f40983n;
    public double f40984r;
    public final Paint f40985s;
    public final Paint v;
    public final Path f40986w;
    public final float[] f40987x;
    public final RectF f40988y;

    public o50(r50 r50Var, Context context, TLRPC.GroupCallParticipant groupCallParticipant) {
        super(context);
        Integer num;
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        this.G = r50Var;
        this.f40985s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f40986w = new Path();
        this.f40987x = new float[8];
        this.f40988y = new RectF();
        this.E = new float[3];
        setWillNotDraw(false);
        this.f40980c = groupCallParticipant;
        this.f40984r = ChatObject.getParticipantVolume(groupCallParticipant) / 20000.0f;
        this.C = 1.0f;
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.speaker, "" + R.raw.speaker, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.d = xi0Var;
        ?? imageView = new ImageView(context);
        this.f40978a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(xi0Var);
        if (this.f40984r == 0.0d) {
            num = 1;
        } else {
            num = null;
        }
        imageView.setTag(num);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView((View) imageView, i7.f6.d(-2, 40.0f, i10 | 16, 0.0f, 0.0f, 0.0f, 0.0f));
        if (this.f40984r == 0.0d) {
            i11 = 17;
        } else {
            i11 = 34;
        }
        xi0Var.N(i11);
        xi0Var.L(xi0Var.f34739f - 1, false, true);
        TextView textView = new TextView(context);
        this.f40979b = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(3);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143hg, false));
        textView.setTextSize(1, 16.0f);
        double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
        Locale locale = Locale.US;
        double max = participantVolume > 0.0d ? Math.max(participantVolume, 1.0d) : 0.0d;
        textView.setText(((int) max) + "%");
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(43.0f);
        }
        if (LocaleController.isRTL) {
            i12 = AndroidUtilities.dp(43.0f);
        } else {
            i12 = 0;
        }
        textView.setPadding(dp, 0, i12, 0);
        addView(textView, i7.f6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        int participantVolume2 = (int) (ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d);
        int i14 = 0;
        while (true) {
            float[] fArr = this.E;
            if (i14 < fArr.length) {
                if (i14 == 0) {
                    i13 = 0;
                } else if (i14 == 1) {
                    i13 = 50;
                } else {
                    i13 = 150;
                }
                if (participantVolume2 > i13) {
                    fArr[i14] = 1.0f;
                } else {
                    fArr[i14] = 0.0f;
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void a(double d, boolean z10) {
        double d10;
        int i10;
        TLObject chat;
        int i11;
        r50 r50Var = this.G;
        AccountInstance accountInstance = r50Var.d;
        if (VoIPService.getSharedInstance() != null) {
            this.f40984r = d;
            TLRPC.GroupCallParticipant groupCallParticipant = this.f40980c;
            groupCallParticipant.volume = (int) (d * 20000.0d);
            int i12 = 0;
            groupCallParticipant.volume_by_admin = false;
            groupCallParticipant.flags |= 128;
            double participantVolume = ChatObject.getParticipantVolume(groupCallParticipant) / 100.0d;
            Locale locale = Locale.US;
            if (participantVolume > 0.0d) {
                d10 = Math.max(participantVolume, 1.0d);
            } else {
                d10 = 0.0d;
            }
            this.f40979b.setText(((int) d10) + "%");
            VoIPService.getSharedInstance().setParticipantVolume(groupCallParticipant, groupCallParticipant.volume);
            Integer num = null;
            if (z10) {
                long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                if (peerId > 0) {
                    chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                } else {
                    chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                }
                TLObject tLObject = chat;
                if (groupCallParticipant.volume == 0) {
                    r40 r40Var = r50Var.f41875b3;
                    if (r40Var != null) {
                        r40Var.dismiss();
                        r50Var.f41875b3 = null;
                    }
                    r50Var.d1(true);
                    if (r50Var.Q0()) {
                        i11 = 0;
                    } else {
                        i11 = 5;
                    }
                    r50Var.x1(groupCallParticipant, peerId, i11);
                } else {
                    VoIPService.getSharedInstance().editCallMember(tLObject, null, null, Integer.valueOf(groupCallParticipant.volume), null, null);
                }
            }
            if (this.f40984r == 0.0d) {
                num = 1;
            }
            org.telegram.ui.Components.aj0 aj0Var = this.f40978a;
            if ((aj0Var.getTag() == null && num != null) || (aj0Var.getTag() != null && num == null)) {
                if (this.f40984r == 0.0d) {
                    i10 = 17;
                } else {
                    i10 = 34;
                }
                org.telegram.ui.Components.xi0 xi0Var = this.d;
                xi0Var.N(i10);
                if (this.f40984r != 0.0d) {
                    i12 = 17;
                }
                xi0Var.K(i12);
                xi0Var.start();
                aj0Var.setTag(num);
            }
        }
    }

    public final boolean b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f40982f = motionEvent.getX();
            this.h = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f40981e) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.h) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.f40982f) > viewConfiguration.getScaledTouchSlop()) {
                        this.f40981e = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            int x4 = (int) motionEvent.getX();
                            this.f40983n = x4;
                            if (x4 < 0) {
                                this.f40983n = 0;
                            } else if (x4 > getMeasuredWidth()) {
                                this.f40983n = getMeasuredWidth();
                            }
                            this.F = true;
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.F) {
                    int x10 = (int) motionEvent.getX();
                    this.f40983n = x10;
                    if (x10 < 0) {
                        this.f40983n = 0;
                    } else if (x10 > getMeasuredWidth()) {
                        this.f40983n = getMeasuredWidth();
                    }
                    a(this.f40983n / getMeasuredWidth(), false);
                    invalidate();
                    return true;
                }
            }
        } else {
            this.f40981e = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.h) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int x11 = (int) motionEvent.getX();
                    this.f40983n = x11;
                    if (x11 < 0) {
                        this.f40983n = 0;
                    } else if (x11 > getMeasuredWidth()) {
                        this.f40983n = getMeasuredWidth();
                    }
                    this.F = true;
                }
            }
            if (this.F) {
                if (motionEvent.getAction() == 1) {
                    a(this.f40983n / getMeasuredWidth(), true);
                }
                this.F = false;
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        float dp;
        int i11;
        o50 o50Var = this;
        int i12 = o50Var.A;
        double d = o50Var.f40984r;
        if (d < 0.25d) {
            o50Var.A = -3385513;
        } else if (d > 0.25d && d < 0.5d) {
            o50Var.A = -3562181;
        } else if (d >= 0.5d && d <= 0.75d) {
            o50Var.A = -11027349;
        } else {
            o50Var.A = -11688225;
        }
        if (i12 == 0) {
            i10 = o50Var.A;
            o50Var.C = 1.0f;
        } else {
            int offsetColor = AndroidUtilities.getOffsetColor(o50Var.B, i12, o50Var.C, 1.0f);
            if (i12 != o50Var.A) {
                o50Var.C = 0.0f;
                o50Var.B = offsetColor;
            }
            i10 = offsetColor;
        }
        Paint paint = o50Var.f40985s;
        paint.setColor(i10);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - o50Var.D;
        if (j10 > 17) {
            j10 = 17;
        }
        o50Var.D = elapsedRealtime;
        float f10 = o50Var.C;
        if (f10 < 1.0f) {
            float f11 = (((float) j10) / 200.0f) + f10;
            o50Var.C = f11;
            if (f11 > 1.0f) {
                o50Var.C = 1.0f;
            } else {
                o50Var.invalidate();
            }
        }
        Path path = o50Var.f40986w;
        path.reset();
        float f12 = 6.0f;
        float dp2 = AndroidUtilities.dp(6.0f);
        float[] fArr = o50Var.f40987x;
        fArr[7] = dp2;
        fArr[6] = dp2;
        int i13 = 1;
        fArr[1] = dp2;
        fArr[0] = dp2;
        if (o50Var.f40983n < AndroidUtilities.dp(12.0f)) {
            f9 = Math.max(0.0f, (o50Var.f40983n - AndroidUtilities.dp(6.0f)) / AndroidUtilities.dp(6.0f));
        } else {
            f9 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(6.0f) * f9;
        fArr[5] = dp3;
        fArr[4] = dp3;
        fArr[3] = dp3;
        fArr[2] = dp3;
        RectF rectF = o50Var.f40988y;
        rectF.set(0.0f, 0.0f, o50Var.f40983n, o50Var.getMeasuredHeight());
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        path.close();
        Canvas canvas2 = canvas;
        canvas2.drawPath(path, paint);
        int participantVolume = (int) (ChatObject.getParticipantVolume(o50Var.f40980c) / 100.0d);
        org.telegram.ui.Components.aj0 aj0Var = o50Var.f40978a;
        int dp4 = AndroidUtilities.dp(5.0f) + (aj0Var.getMeasuredWidth() / 2) + aj0Var.getLeft();
        int measuredHeight = (aj0Var.getMeasuredHeight() / 2) + aj0Var.getTop();
        int i14 = 0;
        while (true) {
            float[] fArr2 = o50Var.E;
            if (i14 < fArr2.length) {
                if (i14 == 0) {
                    dp = AndroidUtilities.dp(f12);
                    i11 = 0;
                } else if (i14 == i13) {
                    dp = AndroidUtilities.dp(10.0f);
                    i11 = 50;
                } else {
                    dp = AndroidUtilities.dp(14.0f);
                    i11 = 150;
                }
                float f13 = fArr2[i14];
                float dp5 = (1.0f - f13) * AndroidUtilities.dp(2.0f);
                Paint paint2 = o50Var.v;
                paint2.setAlpha((int) (255.0f * f13));
                float f14 = dp4;
                float f15 = measuredHeight;
                rectF.set((f14 - dp) + dp5, (f15 - dp) + dp5, (f14 + dp) - dp5, (f15 + dp) - dp5);
                canvas2.drawArc(rectF, -50.0f, 100.0f, false, paint2);
                if (participantVolume > i11) {
                    float f16 = fArr2[i14];
                    if (f16 < 1.0f) {
                        float f17 = (((float) j10) / 180.0f) + f16;
                        fArr2[i14] = f17;
                        if (f17 > 1.0f) {
                            fArr2[i14] = 1.0f;
                        }
                        invalidate();
                    }
                } else {
                    float f18 = fArr2[i14];
                    if (f18 > 0.0f) {
                        float f19 = f18 - (((float) j10) / 180.0f);
                        fArr2[i14] = f19;
                        if (f19 < 0.0f) {
                            fArr2[i14] = 0.0f;
                        }
                        invalidate();
                    }
                }
                i14++;
                canvas2 = canvas;
                f12 = 6.0f;
                i13 = 1;
                o50Var = this;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.f40983n = (int) (View.MeasureSpec.getSize(i10) * this.f40984r);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return b(motionEvent);
    }
}
