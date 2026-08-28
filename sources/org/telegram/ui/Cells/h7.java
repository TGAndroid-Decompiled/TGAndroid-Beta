package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.qs;
public class h7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.p5 A;
    public float B;
    public float C;
    public StaticLayout D;
    public int E;
    public org.telegram.ui.Components.p5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public MessageObject J;
    public boolean K;
    public final int L;
    public final int M;
    public int N;
    public int O;
    public final RadialProgress2 P;
    public final int Q;
    public StaticLayout R;
    public int S;
    public final TextPaint T;
    public final TextPaint U;
    public final org.telegram.ui.ActionBar.b6 V;
    public boolean W;
    public final SpannableStringBuilder f24471a;
    public float f24472a0;
    public final dp f24473b;
    public boolean f24474b0;
    public boolean f24475c;
    public float f24476c0;
    public boolean d;
    public final TextPaint f24477d0;
    public boolean f24478e;
    public Utilities.CallbackReturn f24479e0;
    public int f24480f;
    public float f24481f0;
    public e00 f24482g0;
    public int h;
    public int f24483n;
    public final int f24484r;
    public StaticLayout f24485s;
    public float v;
    public float f24486w;
    public org.telegram.ui.Components.p5 f24487x;
    public int f24488y;

    public h7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i9 = this.N;
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        if (i9 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i9 = this.O;
        if (i9 < 0) {
            return 4;
        }
        if (i9 == 0) {
            return 2;
        }
        return 3;
    }

    public void a() {
        int i9 = this.N;
        int i10 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i9 == 0) {
            if (this.O == 0) {
                this.J.putInDownloadsStore = true;
                FileLoader.getInstance(i10).loadFile(this.J.getDocument(), this.J, 1, 0);
            }
            if (d(this.J)) {
                if (this.f24480f == 2 && this.O != 1) {
                    this.O = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.N = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i9 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.J)) {
                this.N = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i9 == 2) {
            radialProgress2.o(0.0f, false);
            this.J.putInDownloadsStore = true;
            FileLoader.getInstance(i10).loadFile(this.J.getDocument(), this.J, 1, 0);
            this.N = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i9 == 4) {
            FileLoader.getInstance(i10).cancelLoadFile(this.J.getDocument());
            this.N = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i9;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        float f14;
        float f15;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.V;
        if (this.Q == 1) {
            this.T.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        }
        StaticLayout staticLayout2 = this.R;
        int i11 = this.f24484r;
        int i12 = 0;
        float f16 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f15 = 24.0f;
            } else {
                f15 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                i10 = 0;
            } else {
                i10 = this.S;
            }
            canvas.translate(dp + i10, i11);
            this.R.draw(canvas);
            canvas.restore();
        }
        float f17 = 0.0f;
        if (this.f24485s != null) {
            int alpha = org.telegram.ui.ActionBar.f6.f23034f3.getAlpha();
            float f18 = this.f24476c0;
            if (f18 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23034f3.setAlpha((int) (alpha * f18));
            }
            canvas.save();
            if (LocaleController.isRTL) {
                f12 = 24.0f;
            } else {
                f12 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f12);
            if (LocaleController.isRTL && (staticLayout = this.R) != null) {
                int width = staticLayout.getWidth();
                if (LocaleController.isRTL) {
                    f14 = 12.0f;
                } else {
                    f14 = 4.0f;
                }
                i12 = width + AndroidUtilities.dp(f14);
            }
            float f19 = dp2 + i12;
            if (LocaleController.isRTL) {
                f13 = this.f24485s.getWidth() - this.f24486w;
            } else {
                f13 = 0.0f;
            }
            canvas.translate((f19 + f13) - this.v, i11);
            this.f24485s.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f24485s, this.f24487x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24476c0 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23034f3.setAlpha(alpha);
            }
        }
        if (this.I != null) {
            this.U.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f10 = 24.0f;
            } else {
                f10 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL) {
                f11 = this.I.getWidth() - this.H;
            } else {
                f11 = 0.0f;
            }
            canvas.translate((dp3 + f11) - this.G, this.E);
            this.I.draw(canvas);
            canvas.restore();
        }
        if (this.D != null) {
            org.telegram.ui.ActionBar.f6.f23052g3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
            int alpha2 = org.telegram.ui.ActionBar.f6.f23052g3.getAlpha();
            float f20 = this.f24476c0;
            if (f20 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23052g3.setAlpha((int) (alpha2 * f20));
            }
            canvas.save();
            if (!LocaleController.isRTL) {
                f16 = AndroidUtilities.leftBaseline;
            }
            float dp4 = AndroidUtilities.dp(f16);
            if (LocaleController.isRTL) {
                f17 = this.D.getWidth() - this.C;
            }
            canvas.translate((dp4 + f17) - this.B, this.f24488y);
            this.D.draw(canvas);
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.D, this.A, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f24476c0 != 1.0f) {
                org.telegram.ui.ActionBar.f6.f23052g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i9 = org.telegram.ui.ActionBar.f6.f23115jd;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23098id;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        RadialProgress2 radialProgress2 = this.P;
        radialProgress2.d = v02;
        radialProgress2.H = this.f24476c0;
        radialProgress2.draw(canvas);
        if (this.f24475c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.f6.T0("paintDivider", b6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.W;
        if (!z10 && this.f24472a0 == 0.0f) {
            return;
        }
        if (z10) {
            float f10 = this.f24472a0;
            if (f10 != 1.0f) {
                this.f24472a0 = f10 + 0.10666667f;
                invalidate();
                this.f24472a0 = Utilities.clamp(this.f24472a0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f11 = this.f24472a0;
                canvas.scale(f11, f11, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.f6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f12 = this.f24472a0;
            if (f12 != 0.0f) {
                this.f24472a0 = f12 - 0.10666667f;
                invalidate();
            }
        }
        this.f24472a0 = Utilities.clamp(this.f24472a0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f112 = this.f24472a0;
        canvas.scale(f112, f112, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.f6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.f6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.f6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f24479e0;
        if (callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f24474b0;
        if (z10) {
            float f10 = this.f24476c0;
            if (f10 != 1.0f) {
                this.f24476c0 = f10 + 0.10666667f;
                invalidate();
                this.f24476c0 = Utilities.clamp(this.f24476c0, 1.0f, 0.0f);
                if (this.f24481f0 == 1.0f && this.f24482g0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f24481f0) * 255.0f), 31);
                    this.f24482g0.setViewType(4);
                    this.f24482g0.d();
                    this.f24482g0.h();
                    this.f24482g0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f24481f0 * 255.0f), 31);
                    b(canvas);
                    super.dispatchDraw(canvas);
                    c(canvas);
                    canvas.restore();
                    return;
                }
                b(canvas);
                c(canvas);
                super.dispatchDraw(canvas);
            }
        }
        if (!z10) {
            float f11 = this.f24476c0;
            if (f11 != 0.0f) {
                this.f24476c0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f24476c0 = Utilities.clamp(this.f24476c0, 1.0f, 0.0f);
        if (this.f24481f0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        dp dpVar = this.f24473b;
        if (dpVar.getVisibility() != 0) {
            dpVar.setVisibility(0);
        }
        dpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f24475c = z10;
        this.J = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.P;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f26487w.setImageBitmap(bitmap);
            } else {
                String artworkUrl = messageObject.getArtworkUrl(true);
                if (!TextUtils.isEmpty(artworkUrl)) {
                    radialProgress2.h(artworkUrl);
                } else {
                    radialProgress2.i(null, null, null);
                }
            }
        } else {
            radialProgress2.i(photoSize, document, messageObject);
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        boolean z12;
        int i9;
        int i10;
        String fileName = this.J.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.J;
        if (!messageObject.attachPathExists && !messageObject.mediaExists) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.J.getDialogId()) != 0) {
            if (z12) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            this.f24480f = i10;
            z12 = true;
        } else {
            this.f24480f = 0;
            this.O = -1;
        }
        int i11 = this.f24480f;
        int i12 = this.L;
        RadialProgress2 radialProgress2 = this.P;
        if (i11 != 0) {
            if (this.J.isOutOwner()) {
                i9 = org.telegram.ui.ActionBar.f6.Nb;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23099ie;
            }
            radialProgress2.f26471e.setColor(org.telegram.ui.ActionBar.f6.v0(i9, this.V));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.J);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.N = 1;
            } else {
                this.N = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f24480f == 1) {
                DownloadController.getInstance(i12).removeLoadingFileObserver(this);
                this.O = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this.J, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.O = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.O = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (z12) {
            DownloadController.getInstance(i12).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.J);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.N = 1;
            } else {
                this.N = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i12).addLoadingFileObserver(fileName, this.J, this);
            if (!FileLoader.getInstance(i12).isLoadingFile(fileName)) {
                this.N = 2;
                radialProgress2.o(0.0f, z11);
            } else {
                this.N = 4;
                Float fileProgress2 = ImageLoader.getInstance().getFileProgress(fileName);
                if (fileProgress2 != null) {
                    radialProgress2.o(fileProgress2.floatValue(), z11);
                } else {
                    radialProgress2.o(0.0f, z11);
                }
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        }
    }

    public MessageObject getMessage() {
        return this.J;
    }

    @Override
    public int getObserverTag() {
        return this.M;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.e();
        g(false, false);
        int i9 = this.L;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f24487x = org.telegram.ui.Components.t5.update(0, this, this.f24487x, this.f24485s);
        this.A = org.telegram.ui.Components.t5.update(0, this, this.A, this.D);
        this.F = org.telegram.ui.Components.t5.update(0, this, this.F, this.I);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.L;
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        this.P.f();
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.t5.release(this, this.f24487x);
        org.telegram.ui.Components.t5.release(this, this.A);
        org.telegram.ui.Components.t5.release(this, this.F);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        g(true, z10);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.J.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.J.getMusicAuthor(), this.J.getMusicTitle()));
        } else if (this.f24485s != null && this.D != null) {
            accessibilityNodeInfo.setText(((Object) this.f24485s.getText()) + ", " + ((Object) this.D.getText()));
        }
        if (this.f24473b.f27781a.f26313q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        if (iconForCurrentState != 1) {
            if (iconForCurrentState != 2) {
                if (iconForCurrentState != 3) {
                    string = LocaleController.getString("AccActionPlay", R.string.AccActionPlay);
                } else {
                    string = LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload);
                }
            } else {
                string = LocaleController.getString("AccActionDownload", R.string.AccActionDownload);
            }
        } else {
            string = LocaleController.getString("AccActionPause", R.string.AccActionPause);
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, string));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        this.P.o(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
        if (this.f24480f != 0) {
            if (this.O != 1) {
                g(false, true);
            }
        } else if (this.N != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.P.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (i9 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i9, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.K = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.f24481f0 != f10) {
            this.f24481f0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(e00 e00Var) {
        this.f24482g0 = e00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f24479e0 = callbackReturn;
    }

    public h7(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24484r = AndroidUtilities.dp(9.0f);
        this.f24488y = AndroidUtilities.dp(29.0f);
        this.E = AndroidUtilities.dp(29.0f);
        int i10 = UserConfig.selectedAccount;
        this.L = i10;
        this.f24474b0 = true;
        this.f24476c0 = 0.0f;
        this.f24481f0 = 1.0f;
        this.V = b6Var;
        this.Q = i9;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.P = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.f6.f23099ie, org.telegram.ui.ActionBar.f6.f23116je, org.telegram.ui.ActionBar.f6.f23309uc, org.telegram.ui.ActionBar.f6.f23323vc);
        this.M = DownloadController.getInstance(i10).generateObserverTag();
        setWillNotDraw(false);
        dp dpVar = new dp(context, 22, b6Var);
        this.f24473b = dpVar;
        dpVar.setVisibility(4);
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(dpVar, g7.e6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i9 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.T = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f24471a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.U = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (b6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f24477d0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(b6Var.N0(org.telegram.ui.ActionBar.f6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
