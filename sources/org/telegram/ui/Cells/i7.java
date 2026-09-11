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
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.t00;
public class i7 extends FrameLayout implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.v5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.v5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public MessageObject N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder f22104a;
    public final TextPaint f22105a0;
    public final mp f22106b;
    public final TextPaint f22107b0;
    public boolean f22108c;
    public final org.telegram.ui.ActionBar.f6 f22109c0;
    public boolean d;
    public boolean f22110d0;
    public boolean f22111e;
    public float f22112e0;
    public int f22113f;
    public boolean f22114f0;
    public float f22115g0;
    public int h;
    public final TextPaint f22116h0;
    public Utilities.CallbackReturn f22117i0;
    public float f22118j0;
    public t00 f22119k0;
    public int f22120n;
    public final int f22121r;
    public StaticLayout f22122s;
    public float v;
    public float f22123w;
    public org.telegram.ui.Components.v5 f22124x;
    public int f22125y;

    public i7(Context context) {
        this(context, 0, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.S;
        if (i10 < 0) {
            return 4;
        }
        if (i10 == 0) {
            return 2;
        }
        return 3;
    }

    public void a() {
        int i10 = this.R;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (this.S == 0) {
                this.N.putInDownloadsStore = true;
                FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f22113f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.o(0.0f, false);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 1) {
            if (MediaController.getInstance().lambda$startAudioAgain$7(this.N)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (i10 == 2) {
            radialProgress2.o(0.0f, false);
            this.N.putInDownloadsStore = true;
            FileLoader.getInstance(i11).loadFile(this.N.getDocument(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 4) {
            FileLoader.getInstance(i11).cancelLoadFile(this.N.getDocument());
            this.R = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        int i10;
        float f7;
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout;
        float f13;
        float f14;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22109c0;
        if (this.U == 1) {
            this.f22105a0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i12 = this.f22121r;
        int i13 = 0;
        float f15 = 24.0f;
        if (staticLayout2 != null) {
            canvas.save();
            if (LocaleController.isRTL) {
                f14 = 24.0f;
            } else {
                f14 = AndroidUtilities.leftBaseline;
            }
            int dp = AndroidUtilities.dp(f14);
            if (LocaleController.isRTL) {
                i11 = 0;
            } else {
                i11 = this.W;
            }
            canvas.translate(dp + i11, i12);
            this.V.draw(canvas);
            canvas.restore();
        }
        float f16 = 0.0f;
        if (this.f22122s != null) {
            int alpha = org.telegram.ui.ActionBar.j6.f20697f3.getAlpha();
            float f17 = this.f22115g0;
            if (f17 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20697f3.setAlpha((int) (alpha * f17));
            }
            canvas.save();
            if (LocaleController.isRTL) {
                f11 = 24.0f;
            } else {
                f11 = AndroidUtilities.leftBaseline;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (LocaleController.isRTL && (staticLayout = this.V) != null) {
                int width = staticLayout.getWidth();
                if (LocaleController.isRTL) {
                    f13 = 12.0f;
                } else {
                    f13 = 4.0f;
                }
                i13 = width + AndroidUtilities.dp(f13);
            }
            float f18 = dp2 + i13;
            if (LocaleController.isRTL) {
                f12 = this.f22122s.getWidth() - this.f22123w;
            } else {
                f12 = 0.0f;
            }
            canvas.translate((f18 + f12) - this.v, i12);
            this.f22122s.draw(canvas);
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f22122s, this.f22124x, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22115g0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20697f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.f22107b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
            canvas.save();
            if (LocaleController.isRTL) {
                f7 = 24.0f;
            } else {
                f7 = AndroidUtilities.leftBaseline;
            }
            float dp3 = AndroidUtilities.dp(f7);
            if (LocaleController.isRTL) {
                f10 = this.M.getWidth() - this.L;
            } else {
                f10 = 0.0f;
            }
            canvas.translate((dp3 + f10) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.j6.f20715g3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, f6Var));
            int alpha2 = org.telegram.ui.ActionBar.j6.f20715g3.getAlpha();
            float f19 = this.f22115g0;
            if (f19 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20715g3.setAlpha((int) (alpha2 * f19));
            }
            canvas.save();
            if (!LocaleController.isRTL) {
                f15 = AndroidUtilities.leftBaseline;
            }
            float dp4 = AndroidUtilities.dp(f15);
            if (LocaleController.isRTL) {
                f16 = this.H.getWidth() - this.G;
            }
            canvas.translate((dp4 + f16) - this.F, this.f22125y);
            this.H.draw(canvas);
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.f22115g0 != 1.0f) {
                org.telegram.ui.ActionBar.j6.f20715g3.setAlpha(alpha2);
            }
        }
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.f20778jd;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20760id;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = v02;
        radialProgress2.H = this.f22115g0;
        radialProgress2.draw(canvas);
        if (this.f22108c) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - AndroidUtilities.dp(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            } else {
                canvas.drawLine(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.f22110d0;
        if (!z10 && this.f22112e0 == 0.0f) {
            return;
        }
        if (z10) {
            float f7 = this.f22112e0;
            if (f7 != 1.0f) {
                this.f22112e0 = f7 + 0.10666667f;
                invalidate();
                this.f22112e0 = Utilities.clamp(this.f22112e0, 1.0f, 0.0f);
                int measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
                int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
                canvas.save();
                float f10 = this.f22112e0;
                canvas.scale(f10, f10, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                Drawable drawable = org.telegram.ui.ActionBar.j6.Z0;
                drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight);
                org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
                canvas.restore();
            }
        }
        if (!z10) {
            float f11 = this.f22112e0;
            if (f11 != 0.0f) {
                this.f22112e0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.f22112e0 = Utilities.clamp(this.f22112e0, 1.0f, 0.0f);
        int measuredWidth2 = (getMeasuredWidth() - AndroidUtilities.dp(12.0f)) - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth();
        int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f102 = this.f22112e0;
        canvas.scale(f102, f102, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
        Drawable drawable2 = org.telegram.ui.ActionBar.j6.Z0;
        drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.j6.Z0.getIntrinsicHeight() + measuredHeight2);
        org.telegram.ui.ActionBar.j6.Z0.draw(canvas);
        canvas.restore();
    }

    public boolean d(MessageObject messageObject) {
        Utilities.CallbackReturn callbackReturn = this.f22117i0;
        if (callbackReturn != null && ((Boolean) callbackReturn.run(messageObject)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f22114f0;
        if (z10) {
            float f7 = this.f22115g0;
            if (f7 != 1.0f) {
                this.f22115g0 = f7 + 0.10666667f;
                invalidate();
                this.f22115g0 = Utilities.clamp(this.f22115g0, 1.0f, 0.0f);
                if (this.f22118j0 == 1.0f && this.f22119k0 != null) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.f22118j0) * 255.0f), 31);
                    this.f22119k0.setViewType(4);
                    this.f22119k0.d();
                    this.f22119k0.h();
                    this.f22119k0.draw(canvas);
                    canvas.restore();
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.f22118j0 * 255.0f), 31);
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
            float f10 = this.f22115g0;
            if (f10 != 0.0f) {
                this.f22115g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.f22115g0 = Utilities.clamp(this.f22115g0, 1.0f, 0.0f);
        if (this.f22118j0 == 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        mp mpVar = this.f22106b;
        if (mpVar.getVisibility() != 0) {
            mpVar.setVisibility(0);
        }
        mpVar.a(z10, z11);
    }

    public final void f(MessageObject messageObject, boolean z10) {
        TLRPC.PhotoSize photoSize;
        this.f22108c = z10;
        this.N = messageObject;
        TLRPC.Document document = messageObject.getDocument();
        if (document != null) {
            photoSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 360);
        } else {
            photoSize = null;
        }
        boolean z11 = photoSize instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (!z11 && !(photoSize instanceof TLRPC.TL_photoSizeProgressive)) {
            Bitmap bitmap = messageObject.audioCover;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.f24089w.setImageBitmap(bitmap);
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
        int i10;
        int i11;
        String fileName = this.N.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        MessageObject messageObject = this.N;
        if (!messageObject.attachPathExists && !messageObject.mediaExists) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (SharedConfig.streamMedia && messageObject.isMusic() && ((int) this.N.getDialogId()) != 0) {
            if (z12) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f22113f = i11;
            z12 = true;
        } else {
            this.f22113f = 0;
            this.S = -1;
        }
        int i12 = this.f22113f;
        int i13 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i12 != 0) {
            if (this.N.isOutOwner()) {
                i10 = org.telegram.ui.ActionBar.j6.Nb;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f20761ie;
            }
            radialProgress2.f24073e.setColor(org.telegram.ui.ActionBar.j6.v0(i10, this.f22109c0));
            boolean isPlayingMessage = MediaController.getInstance().isPlayingMessage(this.N);
            if (isPlayingMessage && (!isPlayingMessage || !MediaController.getInstance().isMessagePaused())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            if (this.f22113f == 1) {
                DownloadController.getInstance(i13).removeLoadingFileObserver(this);
                this.S = -1;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.N, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.S = 0;
                radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
                return;
            }
            this.S = 1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(fileName);
            if (fileProgress != null) {
                radialProgress2.o(fileProgress.floatValue(), z11);
            } else {
                radialProgress2.o(0.0f, z11);
            }
        } else if (z12) {
            DownloadController.getInstance(i13).removeLoadingFileObserver(this);
            boolean isPlayingMessage2 = MediaController.getInstance().isPlayingMessage(this.N);
            if (isPlayingMessage2 && (!isPlayingMessage2 || !MediaController.getInstance().isMessagePaused())) {
                this.R = 1;
            } else {
                this.R = 0;
            }
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
        } else {
            DownloadController.getInstance(i13).addLoadingFileObserver(fileName, this.N, this);
            if (!FileLoader.getInstance(i13).isLoadingFile(fileName)) {
                this.R = 2;
                radialProgress2.o(0.0f, z11);
            } else {
                this.R = 4;
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
        return this.N;
    }

    @Override
    public int getObserverTag() {
        return this.Q;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
        g(false, false);
        int i10 = this.P;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagePlayingDidStart);
        this.f22124x = org.telegram.ui.Components.z5.update(0, this, this.f22124x, this.f22122s);
        this.E = org.telegram.ui.Components.z5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.z5.update(0, this, this.J, this.M);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.T.f();
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        org.telegram.ui.Components.z5.release(this, this.f22124x);
        org.telegram.ui.Components.z5.release(this, this.E);
        org.telegram.ui.Components.z5.release(this, this.J);
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
        if (this.N.isMusic()) {
            accessibilityNodeInfo.setText(LocaleController.formatString("AccDescrMusicInfo", R.string.AccDescrMusicInfo, this.N.getMusicAuthor(), this.N.getMusicTitle()));
        } else if (this.f22122s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.f22122s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.f22106b.f28477a.f23907q) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i7.onMeasure(int, int):void");
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
        this.T.o(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
        if (this.f22113f != 0) {
            if (this.S != 1) {
                g(false, true);
            }
        } else if (this.R != 4) {
            g(false, true);
        }
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.T.o(1.0f, true);
        g(false, true);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 16) {
            a();
            return true;
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setCheckForButtonPress(boolean z10) {
        this.O = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.f22118j0 != f7) {
            this.f22118j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(t00 t00Var) {
        this.f22119k0 = t00Var;
    }

    public void setNeedPlayMessageListener(Utilities.CallbackReturn<MessageObject, Boolean> callbackReturn) {
        this.f22117i0 = callbackReturn;
    }

    public i7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f22121r = AndroidUtilities.dp(9.0f);
        this.f22125y = AndroidUtilities.dp(29.0f);
        this.I = AndroidUtilities.dp(29.0f);
        int i11 = UserConfig.selectedAccount;
        this.P = i11;
        this.f22114f0 = true;
        this.f22115g0 = 0.0f;
        this.f22118j0 = 1.0f;
        this.f22109c0 = f6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.j6.f20761ie, org.telegram.ui.ActionBar.j6.f20779je, org.telegram.ui.ActionBar.j6.f20978uc, org.telegram.ui.ActionBar.j6.f20995vc);
        this.Q = DownloadController.getInstance(i11).generateObserverTag();
        setWillNotDraw(false);
        mp mpVar = new mp(context, 22, f6Var);
        this.f22106b = mpVar;
        mpVar.setVisibility(4);
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.f20792k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        boolean z10 = LocaleController.isRTL;
        addView(mpVar, w7.x5.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.f22105a0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.f22104a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new at(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.f22107b0 = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        if (f6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.f22116h0 = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint3.setColor(f6Var.G0(org.telegram.ui.ActionBar.j6.G6));
        }
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
