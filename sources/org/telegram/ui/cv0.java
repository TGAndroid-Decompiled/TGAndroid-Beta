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
public class cv0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public yu0 E;
    public zu0 F;
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
    public final ViewGroup f33225a;
    public final ViewGroup f33226b;
    public final boolean f33227c;
    public bv0 d;
    public View e;
    public ImageReceiver f33228f;
    public ImageReceiver f33229g;
    public ImageReceiver h;
    public boolean f33230i;
    public final ih.k f33231j;
    public ih.j f33232k;
    public final Path f33233l;
    public final float[] f33234m;
    public boolean f33235n;
    public float f33236o;
    public float f33237p;
    public float f33238q;
    public float f33239r;
    public float f33240s;
    public float f33241t;
    public float f33242u;
    public float v;
    public float f33243w;
    public float f33244x;
    public float f33245y;
    public float f33246z;

    public cv0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f33229g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f33231j = new ih.k();
        this.f33233l = new Path();
        this.f33234m = new float[8];
        this.Q = new float[2];
        this.f33225a = viewGroup;
        this.f33226b = viewGroup2;
        this.f33227c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f33235n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f33240s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f33241t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = messageObject;
                        bv0 bv0Var = this.d;
                        ViewGroup viewGroup2 = this.f33225a;
                        boolean z10 = this.f33227c;
                        if (bv0Var == null && !z10) {
                            i13 = -1;
                            bv0 bv0Var2 = new bv0(this, viewGroup2.getContext());
                            this.d = bv0Var2;
                            bv0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f33229g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f33229g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f33229g.setCrossfadeWithOldImage(false);
                            this.f33229g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f33235n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f33230i = z4;
                            if (z4 && this.f33232k == null) {
                                ih.j e = ih.j.e(this.d);
                                this.f33232k = e;
                                if (e != null) {
                                    e.f7582k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f33230i) {
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
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = messageObject.messageOwner;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                                        if (closestPhotoSizeWithSize != null) {
                                            int i18 = closestPhotoSizeWithSize.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                                        } else {
                                            iArr[0] = i13;
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
                                                int i19 = closestPhotoSizeWithSize2.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                            } else {
                                                iArr[0] = i13;
                                            }
                                        }
                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                        imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                    } else if (messageObject.getDocument() != null) {
                                        TLRPC.Document document = messageObject.getDocument();
                                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                            int i20 = closestPhotoSizeWithSize3.size;
                                            iArr[0] = i20;
                                            if (i20 == 0) {
                                                iArr[0] = i13;
                                            }
                                            imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                                        }
                                    }
                                }
                                if (imageLocation != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f33229g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f33229g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f33242u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f33243w = imageReceiver.getImageHeight();
                            this.f33244x = imageReceiver.getImageWidth();
                            this.f33245y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f33246z = bitmapWidth;
                            float f10 = this.f33245y;
                            float f11 = f10 / bitmapWidth;
                            float f12 = this.f33243w;
                            float f13 = this.f33244x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f33246z = (bitmapWidth / f10) * f12;
                                    this.f33245y = f12;
                                } else {
                                    this.f33245y = f11 * f13;
                                    this.f33246z = f13;
                                }
                            } else {
                                this.f33245y = f12;
                                this.f33246z = f13;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                bv0 bv0Var3 = this.d;
                                mediaController.setTextureView(bv0Var3.f32949b, bv0Var3.f32950c, bv0Var3.f32948a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f32948a.getLayoutParams();
                                this.d.f32948a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f32950c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f32948a.setLayoutParams(layoutParams);
                                }
                                this.d.f32949b.setScaleX(1.0f);
                                this.d.f32949b.setScaleY(1.0f);
                                yu0 yu0Var = this.E;
                                if (yu0Var != null) {
                                    this.d.d.setImageBitmap(yu0Var.e0().getBitmap((int) this.f33246z, (int) this.f33245y));
                                    this.d.d.s((int) this.f33246z, (int) this.f33245y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f32948a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f33228f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f33228f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.y5) {
                                    org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
                                    y5Var.f(this.d);
                                    y5Var.O = true;
                                }
                                this.f33228f.setImageCoords(this.f33242u, this.v, this.f33244x, this.f33243w);
                                this.f33228f.setAspectFit(imageReceiver.isAspectFit());
                                this.f33228f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f33229g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f33229g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f32948a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        yu0 yu0Var2 = this.E;
                        if (yu0Var2 != null) {
                            yu0Var2.w0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y11 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y12 = this.H - ((motionEvent.getY(i21) + y11) / 2.0f);
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
            this.f33240s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f33241t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f33235n) {
            yu0 yu0Var = this.E;
            if (yu0Var != null) {
                yu0Var.H(this.D);
            }
            this.f33235n = false;
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null && bv0Var.getParent() != null) {
            this.f33225a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            ih.j jVar = this.f33232k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f33232k = null;
            }
            ImageReceiver imageReceiver = this.f33228f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.y5) {
                    ((org.telegram.ui.Components.y5) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f33228f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f33228f.clearImage();
            this.f33228f = null;
        }
        ImageReceiver imageReceiver3 = this.f33229g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f33229g.clearImage();
            this.f33229g = null;
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
        if (this.C == null && this.f33235n) {
            if (!this.f33227c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 25));
            this.C.addListener(new ss0(this, 9));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.mr.f27122f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f33227c && (view = this.e) != null) {
            view.invalidate();
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null) {
            bv0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f33235n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f33238q, -this.f33239r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(ve veVar) {
        this.F = veVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.e; view != this.f33225a; view = (View) view.getParent()) {
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
        for (View view2 = this.e; view2 != this.f33226b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f33238q = f10;
        this.f33239r = f13;
        this.f33236o = f11;
        this.f33237p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f33227c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.y5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.y5) imageReceiver.getDrawable()).f30858r0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public cv0() {
        this.f33229g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f33231j = new ih.k();
        this.f33233l = new Path();
        this.f33234m = new float[8];
        this.Q = new float[2];
        this.f33225a = null;
        this.f33226b = null;
        this.f33227c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
