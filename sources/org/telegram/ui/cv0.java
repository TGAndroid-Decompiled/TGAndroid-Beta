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
    public final ViewGroup f35863a;
    public final ViewGroup f35864b;
    public final boolean f35865c;
    public bv0 d;
    public View f35866e;
    public ImageReceiver f35867f;
    public ImageReceiver f35868g;
    public ImageReceiver h;
    public boolean f35869i;
    public final jh.k f35870j;
    public jh.j f35871k;
    public final Path f35872l;
    public final float[] f35873m;
    public boolean f35874n;
    public float f35875o;
    public float f35876p;
    public float f35877q;
    public float f35878r;
    public float f35879s;
    public float f35880t;
    public float f35881u;
    public float v;
    public float f35882w;
    public float f35883x;
    public float f35884y;
    public float f35885z;

    public cv0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f35868g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f35870j = new jh.k();
        this.f35872l = new Path();
        this.f35873m = new float[8];
        this.Q = new float[2];
        this.f35863a = viewGroup;
        this.f35864b = viewGroup2;
        this.f35865c = false;
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
                    if (hypot > 1.005f && !this.f35874n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f35879s = x10;
                        this.G = x10;
                        float y10 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f35880t = y10;
                        this.H = y10;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f35866e = viewGroup;
                        this.D = messageObject;
                        bv0 bv0Var = this.d;
                        ViewGroup viewGroup2 = this.f35863a;
                        boolean z10 = this.f35865c;
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
                        if (this.f35868g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver();
                            this.f35868g = imageReceiver2;
                            imageReceiver2.setCrossfadeAlpha((byte) 2);
                            this.f35868g.setCrossfadeWithOldImage(false);
                            this.f35868g.onAttachedToWindow();
                            ImageReceiver imageReceiver3 = new ImageReceiver();
                            this.h = imageReceiver3;
                            imageReceiver3.setCrossfadeAlpha((byte) 2);
                            this.h.setCrossfadeWithOldImage(false);
                            this.h.onAttachedToWindow();
                        }
                        this.f35874n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z10) {
                            viewGroup2.addView(this.d);
                            if (messageObject != null && messageObject.hasMediaSpoilers() && !messageObject.isMediaSpoilersRevealed) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.f35869i = z4;
                            if (z4 && this.f35871k == null) {
                                jh.j e6 = jh.j.e(this.d);
                                this.f35871k = e6;
                                if (e6 != null) {
                                    e6.f10130k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            ImageLocation imageLocation = null;
                            if (this.h.getBitmap() != null) {
                                this.h.getBitmap().recycle();
                                this.h.setImageBitmap((Bitmap) null);
                            }
                            if (imageReceiver.getBitmap() != null && !imageReceiver.getBitmap().isRecycled() && this.f35869i) {
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
                                    this.f35868g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                                    this.f35868g.setCrossfadeAlpha((byte) 2);
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f35881u = imageReceiver.getImageX();
                            this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                            this.f35882w = imageReceiver.getImageHeight();
                            this.f35883x = imageReceiver.getImageWidth();
                            this.f35884y = imageReceiver.getBitmapHeight();
                            float bitmapWidth = imageReceiver.getBitmapWidth();
                            this.f35885z = bitmapWidth;
                            float f10 = this.f35884y;
                            float f11 = f10 / bitmapWidth;
                            float f12 = this.f35882w;
                            float f13 = this.f35883x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f35885z = (bitmapWidth / f10) * f12;
                                    this.f35884y = f12;
                                } else {
                                    this.f35884y = f11 * f13;
                                    this.f35885z = f13;
                                }
                            } else {
                                this.f35884y = f12;
                                this.f35885z = f13;
                            }
                            if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                                this.R = true;
                                MediaController mediaController = MediaController.getInstance();
                                bv0 bv0Var3 = this.d;
                                mediaController.setTextureView(bv0Var3.f35607b, bv0Var3.f35608c, bv0Var3.f35606a, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.f35606a.getLayoutParams();
                                this.d.f35606a.setTag(R.id.parent_tag, imageReceiver);
                                if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                                    this.d.f35608c.setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.getImageWidth();
                                    layoutParams.height = (int) imageReceiver.getImageHeight();
                                    this.d.f35606a.setLayoutParams(layoutParams);
                                }
                                this.d.f35607b.setScaleX(1.0f);
                                this.d.f35607b.setScaleY(1.0f);
                                yu0 yu0Var = this.E;
                                if (yu0Var != null) {
                                    this.d.d.setImageBitmap(yu0Var.h0().getBitmap((int) this.f35885z, (int) this.f35884y));
                                    this.d.d.s((int) this.f35885z, (int) this.f35884y);
                                    this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                                }
                                this.d.f35606a.setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver();
                                this.f35867f = imageReceiver5;
                                imageReceiver5.onAttachedToWindow();
                                Drawable drawable = imageReceiver.getDrawable();
                                this.f35867f.setImageBitmap(drawable);
                                if (drawable instanceof org.telegram.ui.Components.y5) {
                                    org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
                                    y5Var.f(this.d);
                                    y5Var.O = true;
                                }
                                this.f35867f.setImageCoords(this.f35881u, this.v, this.f35883x, this.f35882w);
                                this.f35867f.setAspectFit(imageReceiver.isAspectFit());
                                this.f35867f.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f35868g.setRoundRadius(imageReceiver.getRoundRadius(true));
                                this.f35868g.setAspectFit(imageReceiver.isAspectFit());
                                this.d.f35606a.setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        yu0 yu0Var2 = this.E;
                        if (yu0Var2 != null) {
                            yu0Var2.y0(messageObject);
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
            this.f35879s = x13;
            this.G = x13;
            float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f35880t = y13;
            this.H = y13;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f35874n) {
            yu0 yu0Var = this.E;
            if (yu0Var != null) {
                yu0Var.G(this.D);
            }
            this.f35874n = false;
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null && bv0Var.getParent() != null) {
            this.f35863a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            jh.j jVar = this.f35871k;
            if (jVar != null) {
                jVar.b(this.d);
                this.f35871k = null;
            }
            ImageReceiver imageReceiver = this.f35867f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.y5) {
                    ((org.telegram.ui.Components.y5) drawable).w(this.d);
                }
            }
        }
        View view = this.f35866e;
        if (view != null) {
            view.invalidate();
            this.f35866e = null;
        }
        ImageReceiver imageReceiver2 = this.f35867f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f35867f.clearImage();
            this.f35867f = null;
        }
        ImageReceiver imageReceiver3 = this.f35868g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.f35868g.clearImage();
            this.f35868g = null;
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
        if (this.C == null && this.f35874n) {
            if (!this.f35865c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 25));
            this.C.addListener(new ss0(this, 9));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f35865c && (view = this.f35866e) != null) {
            view.invalidate();
        }
        bv0 bv0Var = this.d;
        if (bv0Var != null) {
            bv0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f35874n && view == this.f35866e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f35866e != null) {
            motionEvent.offsetLocation(-this.f35877q, -this.f35878r);
            return this.f35866e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(te teVar) {
        this.F = teVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f35866e; view != this.f35863a; view = (View) view.getParent()) {
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
        for (View view2 = this.f35866e; view2 != this.f35864b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f35877q = f10;
        this.f35878r = f13;
        this.f35875o = f11;
        this.f35876p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f35865c) {
            if (imageReceiver.getDrawable() instanceof org.telegram.ui.Components.y5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.y5) imageReceiver.getDrawable()).f33345r0;
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
        this.f35868g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.f35870j = new jh.k();
        this.f35872l = new Path();
        this.f35873m = new float[8];
        this.Q = new float[2];
        this.f35863a = null;
        this.f35864b = null;
        this.f35865c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
