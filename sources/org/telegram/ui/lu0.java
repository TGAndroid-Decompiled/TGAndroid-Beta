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
public class lu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public hu0 E;
    public iu0 F;
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
    public final ViewGroup f40289a;
    public final ViewGroup f40290b;
    public final boolean f40291c;
    public ku0 d;
    public View f40292e;
    public ImageReceiver f40293f;
    public ImageReceiver f40294g;
    public ImageReceiver h;
    public boolean f40295i;
    public final gh.k f40296j;
    public gh.j f40297k;
    public final Path f40298l;
    public final float[] f40299m;
    public boolean f40300n;
    public float f40301o;
    public float f40302p;
    public float f40303q;
    public float f40304r;
    public float f40305s;
    public float f40306t;
    public float f40307u;
    public float v;
    public float f40308w;
    public float f40309x;
    public float f40310y;
    public float f40311z;

    public lu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f40294g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f40296j = new gh.k();
        this.f40298l = new Path();
        this.f40299m = new float[8];
        this.Q = new float[2];
        this.f40289a = viewGroup;
        this.f40290b = viewGroup2;
        this.f40291c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
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
                    if (hypot > 1.005f && !this.f40300n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x4 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f40305s = x4;
                        this.G = x4;
                        float y8 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f40306t = y8;
                        this.H = y8;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f40292e = viewGroup;
                        this.D = messageObject;
                        ku0 ku0Var = this.d;
                        ViewGroup viewGroup2 = this.f40289a;
                        boolean z11 = this.f40291c;
                        if (ku0Var == null && !z11) {
                            i13 = -1;
                            ku0 ku0Var2 = new ku0(this, viewGroup2.getContext());
                            this.d = ku0Var2;
                            ku0Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f40294g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f40294g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f40294g.setCrossfadeWithOldImage(false);
                            this.f40294g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f40300n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f40295i = z10;
                            if (z10 && this.f40297k == null) {
                                gh.j e10 = gh.j.e(this.d);
                                this.f40297k = e10;
                                if (e10 != null) {
                                    e10.f7400k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f40295i) {
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
                                    this.f40294g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f40294g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f40307u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f40308w = imageReceiver.getImageHeight();
                            this.f40309x = imageReceiver.getImageWidth();
                            this.f40310y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f40311z = bitmapWidth;
                            float f9 = this.f40310y;
                            float f10 = f9 / bitmapWidth;
                            float f11 = this.f40308w;
                            float f12 = this.f40309x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f40311z = (bitmapWidth / f9) * f11;
                                    this.f40310y = f11;
                                } else {
                                    this.f40310y = f10 * f12;
                                    this.f40311z = f12;
                                }
                            } else {
                                this.f40310y = f11;
                                this.f40311z = f12;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                ku0 ku0Var3 = this.d;
                                mediaController.setTextureView(ku0Var3.f40021b, ku0Var3.f40022c, ku0Var3.f40020a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f40020a.getLayoutParams();
                                this.d.f40020a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f40022c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f40020a.setLayoutParams(layoutParams);
                                }
                                this.d.f40021b.setScaleX(1.0f);
                                this.d.f40021b.setScaleY(1.0f);
                                hu0 hu0Var = this.E;
                                if (hu0Var != null) {
                                    this.d.d.setImageBitmap(hu0Var.b0().getBitmap((int) this.f40311z, (int) this.f40310y));
                                    this.d.d.s((int) this.f40311z, (int) this.f40310y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f40020a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f40293f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f40293f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.c6) {
                                    org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) drawable;
                                    c6Var.f(this.d);
                                    c6Var.N = true;
                                }
                                this.f40293f.setImageCoords(this.f40307u, this.v, this.f40309x, this.f40308w);
                                this.f40293f.setAspectFit(imageReceiver.isAspectFit());
                                this.f40293f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f40294g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f40294g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f40020a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        hu0 hu0Var2 = this.E;
                        if (hu0Var2 != null) {
                            hu0Var2.x0(messageObject);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x10 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x11 = this.G - ((motionEvent.getX(i21) + x10) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x11;
                    float f15 = this.O;
                    this.J = f14 / f15;
                    this.K = (-y11) / f15;
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
            float x12 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f40305s = x12;
            this.G = x12;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f40306t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f40300n) {
            hu0 hu0Var = this.E;
            if (hu0Var != null) {
                hu0Var.D(this.D);
            }
            this.f40300n = false;
        }
        ku0 ku0Var = this.d;
        if (ku0Var != null && ku0Var.getParent() != null) {
            this.f40289a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            gh.j jVar = this.f40297k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f40297k = null;
            }
            ImageReceiver imageReceiver = this.f40293f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.c6) {
                    ((org.telegram.ui.Components.c6) drawable).w(this.d);
                }
            }
        }
        View view = this.f40292e;
        if (view != null) {
            view.invalidate();
            this.f40292e = null;
        }
        ImageReceiver imageReceiver2 = this.f40293f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f40293f.clearImage();
            this.f40293f = null;
        }
        ImageReceiver imageReceiver3 = this.f40294g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f40294g.clearImage();
            this.f40294g = null;
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
        if (this.C == null && this.f40300n) {
            if (!this.f40291c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 25));
            this.C.addListener(new e50(this, 18));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.jr.f29800f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f40291c && (view = this.f40292e) != null) {
            view.invalidate();
        }
        ku0 ku0Var = this.d;
        if (ku0Var != null) {
            ku0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f40300n && view == this.f40292e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f40292e != null) {
            motionEvent.offsetLocation(-this.f40303q, -this.f40304r);
            return this.f40292e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(me meVar) {
        this.F = meVar;
    }

    public final boolean i() {
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.f40292e; view != this.f40289a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f10 += view.getLeft();
            f11 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f12 = 0.0f;
        for (View view2 = this.f40292e; view2 != this.f40290b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f9 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f40303q = f9;
        this.f40304r = f12;
        this.f40301o = f10;
        this.f40302p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f40291c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.c6) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.c6) imageReceiver.getDrawable()).f27334q0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.isWaitingForLoad()) {
                    return false;
                }
                return true;
            }
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        return true;
    }

    public lu0() {
        this.f40294g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f40296j = new gh.k();
        this.f40298l = new Path();
        this.f40299m = new float[8];
        this.Q = new float[2];
        this.f40289a = null;
        this.f40290b = null;
        this.f40291c = true;
    }

    public void c(Canvas canvas, float f9, float f10, float f11, float f12, float f13) {
    }
}
