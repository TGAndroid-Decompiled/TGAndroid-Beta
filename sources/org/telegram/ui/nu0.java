package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public class nu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public ju0 E;
    public ku0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f40813a;
    public final ViewGroup f40814b;
    public final boolean f40815c;
    public mu0 d;
    public View f40816e;
    public ImageReceiver f40817f;
    public ImageReceiver f40818g;
    public ImageReceiver h;
    public boolean f40819i;
    public final dh.l f40820j;
    public dh.k f40821k;
    public final Path f40822l;
    public final float[] f40823m;
    public boolean f40824n;
    public float f40825o;
    public float f40826p;
    public float f40827q;
    public float f40828r;
    public float f40829s;
    public float f40830t;
    public float f40831u;
    public float v;
    public float f40832w;
    public float f40833x;
    public float f40834y;
    public float f40835z;

    public nu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f40818g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f40820j = new dh.l();
        this.f40822l = new Path();
        this.f40823m = new float[8];
        this.Q = new float[2];
        this.f40813a = viewGroup;
        this.f40814b = viewGroup2;
        this.f40815c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i14 = -1;
                int i15 = -1;
                for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                    if (this.M == motionEvent.getPointerId(i16)) {
                        i14 = i16;
                    }
                    if (this.N == motionEvent.getPointerId(i16)) {
                        i15 = i16;
                    }
                }
                if (i14 != -1 && i15 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f40824n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f40829s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f40830t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f40816e = viewGroup;
                        this.D = messageObject;
                        mu0 mu0Var = this.d;
                        ViewGroup viewGroup2 = this.f40813a;
                        boolean z11 = this.f40815c;
                        if (mu0Var == null && !z11) {
                            i12 = -1;
                            mu0 mu0Var2 = new mu0(this, viewGroup2.getContext());
                            this.d = mu0Var2;
                            mu0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i12 = -1;
                        }
                        if (this.f40818g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f40818g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f40818g.setCrossfadeWithOldImage(false);
                            this.f40818g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f40824n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f40819i = z10;
                            if (z10 && this.f40821k == null) {
                                dh.k e10 = dh.k.e(this.d);
                                this.f40821k = e10;
                                if (e10 != null) {
                                    e10.f4610k.put(this.d, Integer.valueOf(i9));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f40819i) {
                                this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.setColorFilter(this.S);
                            } else {
                                this.h.setColorFilter(null);
                            }
                            if (messageObject == null || !messageObject.isPhoto()) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                        if (closestPhotoSizeWithSize != null) {
                                            int i17 = closestPhotoSizeWithSize.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        } else {
                                            iArr[0] = i12;
                                        }
                                    }
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (messageObject.isGif()) {
                                            imageLocation = ImageLocation.getForDocument(messageObject.getDocument());
                                        } else {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                            if (closestPhotoSizeWithSize2 != null) {
                                                int i18 = closestPhotoSizeWithSize2.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            } else {
                                                iArr[0] = i12;
                                            }
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                        imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                    } else if (messageObject.getDocument() != null) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                            int i19 = closestPhotoSizeWithSize3.size;
                                            iArr[0] = i19;
                                            if (i19 == 0) {
                                                iArr[0] = i12;
                                            }
                                            imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                                        }
                                    }
                                }
                                if (imageLocation != null) {
                                    i10 = i15;
                                    i13 = i14;
                                    this.f40818g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f40818g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f40831u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f40832w = imageReceiver.getImageHeight();
                            this.f40833x = imageReceiver.getImageWidth();
                            this.f40834y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f40835z = bitmapWidth;
                            float f10 = this.f40834y;
                            float f11 = f10 / bitmapWidth;
                            float f12 = this.f40832w;
                            float f13 = this.f40833x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f40835z = (bitmapWidth / f10) * f12;
                                    this.f40834y = f12;
                                } else {
                                    this.f40834y = f11 * f13;
                                    this.f40835z = f13;
                                }
                            } else {
                                this.f40834y = f12;
                                this.f40835z = f13;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                mu0 mu0Var3 = this.d;
                                mediaController.setTextureView(mu0Var3.f40533b, mu0Var3.f40534c, mu0Var3.f40532a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f40532a.getLayoutParams();
                                this.d.f40532a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f40534c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f40532a.setLayoutParams(layoutParams);
                                }
                                this.d.f40533b.setScaleX(1.0f);
                                this.d.f40533b.setScaleY(1.0f);
                                ju0 ju0Var = this.E;
                                if (ju0Var != null) {
                                    this.d.d.setImageBitmap(ju0Var.G().getBitmap((int) this.f40835z, (int) this.f40834y));
                                    this.d.d.s((int) this.f40835z, (int) this.f40834y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f40532a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f40817f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f40817f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.x5) {
                                    org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
                                    x5Var.f(this.d);
                                    x5Var.N = true;
                                }
                                this.f40817f.setImageCoords(this.f40831u, this.v, this.f40833x, this.f40832w);
                                this.f40817f.setAspectFit(imageReceiver.isAspectFit());
                                this.f40817f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f40818g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f40818g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f40532a.setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        ju0 ju0Var2 = this.E;
                        if (ju0Var2 != null) {
                            ju0Var2.x0(messageObject);
                        }
                        this.P = 0.0f;
                        i11 = i13;
                    } else {
                        i10 = i15;
                        i11 = i14;
                    }
                    float x11 = motionEvent.getX(i11);
                    int i20 = i10;
                    float y11 = motionEvent.getY(i11);
                    float x12 = this.G - ((motionEvent.getX(i20) + x11) / 2.0f);
                    float y12 = this.H - ((motionEvent.getY(i20) + y11) / 2.0f);
                    float f15 = -x12;
                    float f16 = this.O;
                    this.J = f15 / f16;
                    this.K = (-y12) / f16;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f40829s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f40830t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f40824n) {
            ju0 ju0Var = this.E;
            if (ju0Var != null) {
                ju0Var.y(this.D);
            }
            this.f40824n = false;
        }
        mu0 mu0Var = this.d;
        if (mu0Var != null && mu0Var.getParent() != null) {
            this.f40813a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            dh.k kVar = this.f40821k;
            if (kVar != null) {
                kVar.b(this.d);
                this.f40821k = null;
            }
            ImageReceiver imageReceiver = this.f40817f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.x5) {
                    ((org.telegram.ui.Components.x5) drawable).w(this.d);
                }
            }
        }
        View view = this.f40816e;
        if (view != null) {
            view.invalidate();
            this.f40816e = null;
        }
        ImageReceiver imageReceiver2 = this.f40817f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f40817f.clearImage();
            this.f40817f = null;
        }
        ImageReceiver imageReceiver3 = this.f40818g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f40818g.clearImage();
            this.f40818g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.h.clearImage();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f40824n) {
            if (!this.f40815c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new f3(this, 25));
            this.C.addListener(new bc0(this, 16));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.gr.f28844f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f40815c && (view = this.f40816e) != null) {
            view.invalidate();
        }
        mu0 mu0Var = this.d;
        if (mu0Var != null) {
            mu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f40824n && view == this.f40816e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f40816e != null) {
            motionEvent.offsetLocation(-this.f40827q, -this.f40828r);
            return this.f40816e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(oe oeVar) {
        this.F = oeVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f40816e; view != this.f40813a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.f40816e; view2 != this.f40814b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f40827q = f10;
        this.f40828r = f13;
        this.f40825o = f11;
        this.f40826p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f40815c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.x5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.x5) imageReceiver.getDrawable()).f34527q0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public nu0() {
        this.f40818g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f40820j = new dh.l();
        this.f40822l = new Path();
        this.f40823m = new float[8];
        this.Q = new float[2];
        this.f40813a = null;
        this.f40814b = null;
        this.f40815c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
