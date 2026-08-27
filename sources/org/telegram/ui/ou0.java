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

public class ou0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public ku0 E;
    public lu0 F;
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

    public final ViewGroup f41169a;

    public final ViewGroup f41170b;

    public final boolean f41171c;
    public nu0 d;

    public View f41172e;

    public ImageReceiver f41173f;

    public ImageReceiver f41174g;
    public ImageReceiver h;

    public boolean f41175i;

    public final eh.k f41176j;

    public eh.j f41177k;

    public final Path f41178l;

    public final float[] f41179m;

    public boolean f41180n;

    public float f41181o;

    public float f41182p;

    public float f41183q;

    public float f41184r;

    public float f41185s;

    public float f41186t;

    public float f41187u;
    public float v;

    public float f41188w;

    public float f41189x;

    public float f41190y;

    public float f41191z;

    public ou0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f41174g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f41176j = new eh.k();
        this.f41178l = new Path();
        this.f41179m = new float[8];
        this.Q = new float[2];
        this.f41169a = viewGroup;
        this.f41170b = viewGroup2;
        this.f41171c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (!this.L && motionEvent.getPointerCount() == 2) {
                this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x8 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                this.f41185s = x8;
                this.G = x8;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                this.f41186t = y10;
                this.H = y10;
                this.O = 1.0f;
                this.M = motionEvent.getPointerId(0);
                this.N = motionEvent.getPointerId(1);
                this.L = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.L) {
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
            if (i15 == -1 || i16 == -1) {
                this.L = false;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                d();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
            this.O = fHypot;
            if (fHypot <= 1.005f || this.f41180n) {
                i11 = i16;
                i12 = i15;
            } else {
                this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                this.f41185s = x10;
                this.G = x10;
                float y11 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                this.f41186t = y11;
                this.H = y11;
                this.O = 1.0f;
                this.J = 0.0f;
                this.K = 0.0f;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                this.f41172e = viewGroup;
                this.D = messageObject;
                nu0 nu0Var = this.d;
                ViewGroup viewGroup2 = this.f41169a;
                boolean z10 = this.f41171c;
                if (nu0Var != null || z10) {
                    i13 = -1;
                } else {
                    i13 = -1;
                    nu0 nu0Var2 = new nu0(this, viewGroup2.getContext());
                    this.d = nu0Var2;
                    nu0Var2.setFocusable(false);
                    this.d.setFocusableInTouchMode(false);
                    this.d.setEnabled(false);
                }
                if (this.f41174g == null) {
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    this.f41174g = imageReceiver2;
                    imageReceiver2.setCrossfadeAlpha((byte) 2);
                    this.f41174g.setCrossfadeWithOldImage(false);
                    this.f41174g.onAttachedToWindow();
                    ImageReceiver imageReceiver3 = new ImageReceiver();
                    this.h = imageReceiver3;
                    imageReceiver3.setCrossfadeAlpha((byte) 2);
                    this.h.setCrossfadeWithOldImage(false);
                    this.h.onAttachedToWindow();
                }
                this.f41180n = true;
                this.A = 1.0f;
                this.B = 0.0f;
                if (z10) {
                    i14 = i15;
                    i11 = i16;
                } else {
                    viewGroup2.addView(this.d);
                    boolean z11 = (messageObject == null || !messageObject.hasMediaSpoilers() || messageObject.isMediaSpoilersRevealed) ? false : true;
                    this.f41175i = z11;
                    if (z11 && this.f41177k == null) {
                        eh.j jVarE = eh.j.e(this.d);
                        this.f41177k = jVarE;
                        if (jVarE != null) {
                            jVarE.f5508k.put(this.d, Integer.valueOf(i10));
                        }
                    }
                    ImageLocation forDocument = null;
                    if (this.h.getBitmap() != null) {
                        this.h.getBitmap().recycle();
                        this.h.setImageBitmap((Bitmap) null);
                    }
                    if (imageReceiver.getBitmap() == null || imageReceiver.getBitmap().isRecycled() || !this.f41175i) {
                        this.h.setColorFilter(null);
                    } else {
                        this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                        ImageReceiver imageReceiver4 = this.h;
                        if (this.S == null) {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                            this.S = new ColorMatrixColorFilter(colorMatrix);
                        }
                        imageReceiver4.setColorFilter(this.S);
                    }
                    if (messageObject != null && messageObject.isPhoto()) {
                        int[] iArr = new int[1];
                        TLRPC.Message message = messageObject.messageOwner;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = message.media;
                            if ((!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null) && (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || messageMedia.webpage == null)) {
                                if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                    forDocument = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                } else if (messageObject.getDocument() != null) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                        int i18 = closestPhotoSizeWithSize.size;
                                        iArr[0] = i18;
                                        if (i18 == 0) {
                                            iArr[0] = i13;
                                        }
                                        forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                                    }
                                }
                            } else if (messageObject.isGif()) {
                                forDocument = ImageLocation.getForDocument(messageObject.getDocument());
                            } else {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                if (closestPhotoSizeWithSize2 != null) {
                                    int i19 = closestPhotoSizeWithSize2.size;
                                    iArr[0] = i19;
                                    if (i19 == 0) {
                                        iArr[0] = i13;
                                    }
                                    forDocument = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                } else {
                                    iArr[0] = i13;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                            if (closestPhotoSizeWithSize3 != null) {
                                int i20 = closestPhotoSizeWithSize3.size;
                                iArr[0] = i20;
                                if (i20 == 0) {
                                    iArr[0] = i13;
                                }
                                forDocument = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                            } else {
                                iArr[0] = i13;
                            }
                        }
                        if (forDocument != null) {
                            i11 = i16;
                            i14 = i15;
                            this.f41174g.setImage(forDocument, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                            this.f41174g.setCrossfadeAlpha((byte) 2);
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        i();
                    } else {
                        i14 = i15;
                        i11 = i16;
                    }
                    this.f41187u = imageReceiver.getImageX();
                    this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                    this.f41188w = imageReceiver.getImageHeight();
                    this.f41189x = imageReceiver.getImageWidth();
                    this.f41190y = imageReceiver.getBitmapHeight();
                    float bitmapWidth = imageReceiver.getBitmapWidth();
                    this.f41191z = bitmapWidth;
                    float f10 = this.f41190y;
                    float f11 = f10 / bitmapWidth;
                    float f12 = this.f41188w;
                    float f13 = this.f41189x;
                    float f14 = f12 / f13;
                    if (f11 == f14) {
                        this.f41190y = f12;
                        this.f41191z = f13;
                    } else if (f11 < f14) {
                        this.f41191z = (bitmapWidth / f10) * f12;
                        this.f41190y = f12;
                    } else {
                        this.f41190y = f11 * f13;
                        this.f41191z = f13;
                    }
                    if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        this.R = true;
                        MediaController mediaController = MediaController.getInstance();
                        nu0 nu0Var3 = this.d;
                        mediaController.setTextureView(nu0Var3.f40941b, nu0Var3.f40942c, nu0Var3.f40940a, true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f40940a.getLayoutParams();
                        this.d.f40940a.setTag(R.id.parent_tag, imageReceiver);
                        if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                            this.d.f40942c.setResizeMode(3);
                            layoutParams.width = (int) imageReceiver.getImageWidth();
                            layoutParams.height = (int) imageReceiver.getImageHeight();
                            this.d.f40940a.setLayoutParams(layoutParams);
                        }
                        this.d.f40941b.setScaleX(1.0f);
                        this.d.f40941b.setScaleY(1.0f);
                        ku0 ku0Var = this.E;
                        if (ku0Var != null) {
                            this.d.d.setImageBitmap(ku0Var.K().getBitmap((int) this.f41191z, (int) this.f41190y));
                            this.d.d.s((int) this.f41191z, (int) this.f41190y);
                            this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                        }
                        this.d.f40940a.setVisibility(0);
                    } else {
                        this.R = false;
                        ImageReceiver imageReceiver5 = new ImageReceiver();
                        this.f41173f = imageReceiver5;
                        imageReceiver5.onAttachedToWindow();
                        Drawable drawable = imageReceiver.getDrawable();
                        this.f41173f.setImageBitmap(drawable);
                        if (drawable instanceof org.telegram.ui.Components.x5) {
                            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
                            x5Var.f(this.d);
                            x5Var.N = true;
                        }
                        this.f41173f.setImageCoords(this.f41187u, this.v, this.f41189x, this.f41188w);
                        this.f41173f.setAspectFit(imageReceiver.isAspectFit());
                        this.f41173f.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.f41174g.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.f41174g.setAspectFit(imageReceiver.isAspectFit());
                        this.d.f40940a.setVisibility(8);
                    }
                }
                ku0 ku0Var2 = this.E;
                if (ku0Var2 != null) {
                    ku0Var2.w0(messageObject);
                }
                this.P = 0.0f;
                i12 = i14;
            }
            int i21 = i11;
            float x11 = (motionEvent.getX(i21) + motionEvent.getX(i12)) / 2.0f;
            float y12 = (motionEvent.getY(i21) + motionEvent.getY(i12)) / 2.0f;
            float f15 = this.G - x11;
            float f16 = this.H - y12;
            float f17 = -f15;
            float f18 = this.O;
            this.J = f17 / f18;
            this.K = (-f16) / f18;
            e();
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
            this.L = false;
            if (viewGroup != null && viewGroup.getParent() != null) {
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
            }
            d();
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f41180n) {
            ku0 ku0Var = this.E;
            if (ku0Var != null) {
                ku0Var.y(this.D);
            }
            this.f41180n = false;
        }
        nu0 nu0Var = this.d;
        if (nu0Var != null && nu0Var.getParent() != null) {
            this.f41169a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            eh.j jVar = this.f41177k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f41177k = null;
            }
            ImageReceiver imageReceiver = this.f41173f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.x5) {
                    ((org.telegram.ui.Components.x5) drawable).w(this.d);
                }
            }
        }
        View view = this.f41172e;
        if (view != null) {
            view.invalidate();
            this.f41172e = null;
        }
        ImageReceiver imageReceiver2 = this.f41173f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f41173f.clearImage();
            this.f41173f = null;
        }
        ImageReceiver imageReceiver3 = this.f41174g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f41174g.clearImage();
            this.f41174g = null;
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
        if (this.C == null && this.f41180n) {
            if (!this.f41171c && !i()) {
                b();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new g3(this, 25));
            this.C.addListener(new f50(this, 18));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f41171c && (view = this.f41172e) != null) {
            view.invalidate();
        }
        nu0 nu0Var = this.d;
        if (nu0Var != null) {
            nu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        return this.f41180n && view == this.f41172e;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (!i() || this.f41172e == null) {
            return false;
        }
        motionEvent.offsetLocation(-this.f41183q, -this.f41184r);
        return this.f41172e.onTouchEvent(motionEvent);
    }

    public final void h(oe oeVar) {
        this.F = oeVar;
    }

    public final boolean i() {
        float left = 0.0f;
        float left2 = 0.0f;
        float top = 0.0f;
        for (View view = this.f41172e; view != this.f41169a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            left2 += view.getLeft();
            top += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float top2 = 0.0f;
        for (View view2 = this.f41172e; view2 != this.f41170b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            left += view2.getLeft();
            top2 += view2.getTop();
        }
        this.f41183q = left;
        this.f41184r = top2;
        this.f41181o = left2;
        this.f41182p = top;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (this.f41171c) {
            return true;
        }
        if (!(imageReceiver.getDrawable() instanceof org.telegram.ui.Components.x5)) {
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.x5) imageReceiver.getDrawable()).f34488q0;
        return animatedFileDrawableStream == null || !animatedFileDrawableStream.isWaitingForLoad();
    }

    public ou0() {
        this.f41174g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f41176j = new eh.k();
        this.f41178l = new Path();
        this.f41179m = new float[8];
        this.Q = new float[2];
        this.f41169a = null;
        this.f41170b = null;
        this.f41171c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
