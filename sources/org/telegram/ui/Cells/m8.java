package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.xt;
public final class m8 extends FrameLayout {
    public final TextView E;
    public final sg.q0 F;
    public final ImageView G;
    public AnimatorSet H;
    public final int f21520a;
    public final bi.f4 f21521b;
    public final TextView f21522c;
    public final org.telegram.ui.Components.z9 d;
    public final aq e;
    public boolean f21523f;
    public final ImageView h;
    public final ImageView f21524n;
    public TLRPC.TL_messages_stickerSet f21525r;
    public boolean f21526s;
    public final Rect v;
    public boolean f21527w;
    public final FrameLayout f21528x;
    public final TextView f21529y;

    public m8(Context context, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        int i19;
        this.v = new Rect();
        this.f21520a = i10;
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        z9Var.setAspectFit(true);
        z9Var.setLayerNum(1);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i20 = i11 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 13.0f;
        }
        if (z10) {
            f10 = 13.0f;
        } else {
            f10 = 0.0f;
        }
        addView(z9Var, w7.a6.a(40.0f, f7, 9.0f, f10, 0.0f, 40, i20));
        if (i10 != 0) {
            ImageView imageView = new ImageView(context);
            this.h = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i10 != 3) {
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Vh, false), 1, -1));
            }
            if (i10 == 1) {
                int i21 = org.telegram.ui.ActionBar.g6.Uh;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i21, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (LocaleController.isRTL) {
                    i19 = 3;
                } else {
                    i19 = 5;
                }
                addView(imageView, w7.a6.e(40, 40, i19 | 16));
                ImageView imageView2 = new ImageView(context);
                this.f21524n = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i21, false), mode));
                addView(imageView2, w7.a6.h(58.0f, 58.0f, 8388613));
                aq aqVar = new aq(context, 21, null);
                this.e = aqVar;
                aqVar.b(-1, org.telegram.ui.ActionBar.g6.f19901d6, org.telegram.ui.ActionBar.g6.f20029k7);
                aqVar.setDrawUnchecked(false);
                aqVar.setDrawBackgroundAsArc(3);
                addView(aqVar, w7.a6.i(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i10 == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z11 = LocaleController.isRTL;
                if (z11) {
                    i17 = 3;
                } else {
                    i17 = 5;
                }
                int i22 = i17 | 48;
                if (z11) {
                    i18 = 10;
                } else {
                    i18 = 0;
                }
                addView(imageView, w7.a6.a(40.0f, i18, 9.0f, z11 ? 0 : 10, 0.0f, 40, i22));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21528x = frameLayout;
        TextView textView = new TextView(context);
        this.f21529y = textView;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        int i23 = org.telegram.ui.ActionBar.g6.Oh;
        textView.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{14.0f}, org.telegram.ui.ActionBar.g6.x0(null, i23, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new g8(this, 0));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        frameLayout.addView(textView, w7.a6.h(-2.0f, 28.0f, i12 | 16));
        w7.c6.a(textView);
        TextView textView2 = new TextView(context);
        this.E = textView2;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Rh, false));
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{14.0f}, 0, org.telegram.ui.ActionBar.g6.x0(null, i23, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new g8(this, 0));
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        frameLayout.addView(textView2, w7.a6.i(-2.0f, 32.0f, i13 | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        w7.c6.a(textView2);
        sg.q0 q0Var = new sg.q0(AndroidUtilities.dp(4.0f), context, null, false);
        this.F = q0Var;
        q0Var.setIcon(R.raw.unlock_icon);
        q0Var.a(LocaleController.getString(R.string.Unlock), new g8(this, 0), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int dp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = dp;
            marginLayoutParams.width = dp;
            ((ViewGroup.MarginLayoutParams) q0Var.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            q0Var.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        FrameLayout frameLayout2 = this.f21528x;
        sg.q0 q0Var2 = this.F;
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(q0Var2, w7.a6.h(-2.0f, 28.0f, i14 | 16));
        w7.c6.a(this.F);
        this.f21528x.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        View view = this.f21528x;
        if (LocaleController.isRTL) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        addView(view, w7.a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, i15));
        this.f21528x.setOnClickListener(new g8(this, 1));
        bi.f4 f4Var = new bi.f4(context, 8);
        this.f21521b = f4Var;
        NotificationCenter.listenEmojiLoading(f4Var);
        f4Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        f4Var.setTextSize(1, 16.0f);
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setLines(1);
        f4Var.setMaxLines(1);
        f4Var.setSingleLine(true);
        f4Var.setEllipsize(TextUtils.TruncateAt.END);
        f4Var.setGravity(w7.a6.y());
        addView(f4Var, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f21522c = textView3;
        yh.t(textView3, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20305z6, false), 1, 13.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(w7.a6.y());
        addView(textView3, w7.a6.i(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i10 == 3) {
            ImageView imageView3 = new ImageView(context);
            this.G = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990i6, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 3;
            } else {
                i16 = 5;
            }
            int i24 = i16 | 16;
            if (z12) {
                f11 = 4.0f;
            } else {
                f11 = 0.0f;
            }
            if (z12) {
                f12 = 0.0f;
            } else {
                f12 = 4.0f;
            }
            addView(imageView3, w7.a6.a(-2.0f, f11, 0.0f, f12, 0.0f, -2, i24));
        }
        e(0);
    }

    public final boolean a() {
        int i10 = this.f21520a;
        if (i10 == 1) {
            return this.e.f23604a.f23092q;
        }
        if (i10 == 3) {
            if (this.h.getVisibility() != 0) {
                return false;
            }
        } else if (!this.f21527w || this.f21528x.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        int i10 = this.f21520a;
        if (i10 == 1) {
            this.e.a(z10, z11);
            return;
        }
        int i11 = 4;
        float f11 = 0.0f;
        float f12 = 0.1f;
        if (i10 == 3) {
            ImageView imageView = this.h;
            if (z11) {
                imageView.animate().cancel();
                ViewPropertyAnimator listener = imageView.animate().setListener(new j8(this, z10, 0));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha = listener.alpha(f11);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.1f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            imageView.setVisibility(i11);
            if (!z10) {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else if (this.f21527w) {
            FrameLayout frameLayout = this.f21528x;
            if (z11) {
                frameLayout.animate().cancel();
                ViewPropertyAnimator listener2 = frameLayout.animate().setListener(new j8(this, z10, 1));
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = listener2.alpha(f11);
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.1f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f7);
                if (z10) {
                    f12 = 1.0f;
                }
                scaleX2.scaleY(f12).setDuration(150L).start();
                return;
            }
            if (z10) {
                i11 = 0;
            }
            frameLayout.setVisibility(i11);
            if (!z10) {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
                return;
            }
            frameLayout.setAlpha(1.0f);
            frameLayout.setScaleX(1.0f);
            frameLayout.setScaleY(1.0f);
        }
    }

    public final void c(final boolean z10) {
        float f7;
        float f10;
        if (this.f21520a == 1) {
            float f11 = 0.0f;
            float f12 = 1.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!z10) {
                f11 = 1.0f;
            }
            float[] fArr = {f7, f11};
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.66f;
            }
            if (z10) {
                f12 = 0.66f;
            }
            float[] fArr2 = {f10, f12};
            ImageView imageView = this.f21524n;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            es esVar = xt.f31324a;
            duration.setInterpolator(esVar).withEndAction(new Runnable(this) {
                public final m8 f21281b;

                {
                    this.f21281b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            m8 m8Var = this.f21281b;
                            if (!z11) {
                                m8Var.f21524n.setVisibility(8);
                                return;
                            } else {
                                m8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            m8 m8Var2 = this.f21281b;
                            if (z12) {
                                m8Var2.f21528x.setVisibility(8);
                                return;
                            } else {
                                m8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            m8 m8Var3 = this.f21281b;
                            if (z13) {
                                m8Var3.h.setVisibility(8);
                                return;
                            } else {
                                m8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            if (this.f21527w) {
                FrameLayout frameLayout = this.f21528x;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(esVar).withEndAction(new Runnable(this) {
                    public final m8 f21281b;

                    {
                        this.f21281b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z11 = z10;
                                m8 m8Var = this.f21281b;
                                if (!z11) {
                                    m8Var.f21524n.setVisibility(8);
                                    return;
                                } else {
                                    m8Var.getClass();
                                    return;
                                }
                            case 1:
                                boolean z12 = z10;
                                m8 m8Var2 = this.f21281b;
                                if (z12) {
                                    m8Var2.f21528x.setVisibility(8);
                                    return;
                                } else {
                                    m8Var2.getClass();
                                    return;
                                }
                            default:
                                boolean z13 = z10;
                                m8 m8Var3 = this.f21281b;
                                if (z13) {
                                    m8Var3.h.setVisibility(8);
                                    return;
                                } else {
                                    m8Var3.getClass();
                                    return;
                                }
                        }
                    }
                }).start();
                return;
            }
            ImageView imageView2 = this.h;
            imageView2.setVisibility(0);
            imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(esVar).withEndAction(new Runnable(this) {
                public final m8 f21281b;

                {
                    this.f21281b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z11 = z10;
                            m8 m8Var = this.f21281b;
                            if (!z11) {
                                m8Var.f21524n.setVisibility(8);
                                return;
                            } else {
                                m8Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z12 = z10;
                            m8 m8Var2 = this.f21281b;
                            if (z12) {
                                m8Var2.f21528x.setVisibility(8);
                                return;
                            } else {
                                m8Var2.getClass();
                                return;
                            }
                        default:
                            boolean z13 = z10;
                            m8 m8Var3 = this.f21281b;
                            if (z13) {
                                m8Var3.h.setVisibility(8);
                                return;
                            } else {
                                m8Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
        }
    }

    public final void d(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z10, boolean z11) {
        int i10;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        String str;
        ImageLocation forSticker;
        int i11;
        String str2;
        this.f21523f = z10;
        this.f21525r = tL_messages_stickerSet;
        this.f21526s = z11;
        org.telegram.ui.Components.z9 z9Var = this.d;
        z9Var.setVisibility(0);
        bi.f4 f4Var = this.f21521b;
        f4Var.setTranslationY(0.0f);
        f4Var.setText(this.f21525r.set.title);
        boolean z12 = this.f21525r.set.archived;
        TextView textView = this.f21522c;
        if (z12) {
            f4Var.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            z9Var.setAlpha(0.5f);
        } else {
            f4Var.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            z9Var.setAlpha(1.0f);
        }
        boolean z13 = tL_messages_stickerSet.set.emojis;
        this.f21527w = z13;
        int i12 = 8;
        if (z13) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f21528x.setVisibility(i10);
        if (!this.f21527w) {
            i12 = 0;
        }
        this.h.setVisibility(i12);
        TLRPC.Document document = null;
        z9Var.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        String str3 = "Stickers";
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.f21527w) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, arrayList.size(), new Object[0]));
            int i13 = 0;
            while (true) {
                if (i13 < arrayList.size()) {
                    TLRPC.Document document2 = arrayList.get(i13);
                    if (document2 != null && document2.f19222id == tL_messages_stickerSet.set.thumb_document_id) {
                        document = document2;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, org.telegram.ui.ActionBar.g6.f19843a7, 1.0f);
            boolean z14 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z14) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            }
            if (this.f21527w) {
                i11 = 16388;
            } else {
                i11 = 1;
            }
            if (!LiteMode.isEnabled(i11)) {
                str2 = "_firstframe";
            } else {
                str2 = "";
            }
            String concat = "50_50".concat(str2);
            if (!z14 || (!MessageObject.isAnimatedStickerDocument(document, true) && !MessageObject.isVideoSticker(document))) {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forSticker != null && forSticker.imageType == 1) {
                    z9Var.i(forSticker, concat, "tgs", svgThumb, tL_messages_stickerSet2);
                } else {
                    z9Var.i(forSticker, concat, "webp", svgThumb, tL_messages_stickerSet2);
                }
            } else {
                if (svgThumb != null) {
                    z9Var.n(ImageLocation.getForDocument(document), concat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    z9Var.j(ImageLocation.getForDocument(document), concat, forSticker, null, 0, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    z9Var.setColorFilter(org.telegram.ui.ActionBar.g6.f20230v3);
                }
            }
        } else {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet2.set.emojis) {
                str3 = "EmojiCount";
            }
            textView.setText(LocaleController.formatPluralString(str3, 0, new Object[0]));
            z9Var.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                org.telegram.ui.Components.s5.h(UserConfig.selectedAccount).b(tL_messages_stickerSet2.set.thumb_document_id, new org.telegram.ui.Components.p5() {
                    @Override
                    public final void a(TLRPC.Document document3) {
                        AndroidUtilities.runOnUIThread(new la(7, m8.this, document3));
                    }
                });
            }
        }
        if (this.f21526s) {
            StringBuilder sb2 = new StringBuilder();
            if (tL_messages_stickerSet2.set.emojis) {
                str = "t.me/addemoji/";
            } else {
                str = "t.me/addstickers/";
            }
            sb2.append(str);
            sb2.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public final void e(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        AnimatorSet animatorSet = this.H;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.H = null;
        }
        int i13 = 0;
        sg.q0 q0Var = this.F;
        if (i10 == 1) {
            q0Var.a(LocaleController.getString(R.string.Unlock), new g8(this, 0), false);
        } else if (i10 == 2) {
            q0Var.a(LocaleController.getString(R.string.Restore), new g8(this, 0), false);
        }
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        q0Var.setEnabled(z10);
        if (i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        TextView textView = this.f21529y;
        textView.setEnabled(z11);
        if (i10 == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        TextView textView2 = this.E;
        textView2.setEnabled(z12);
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (i10 != 1 && i10 != 2) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        q0Var.setAlpha(f7);
        if (i10 != 1 && i10 != 2) {
            f10 = 0.6f;
        } else {
            f10 = 1.0f;
        }
        q0Var.setScaleX(f10);
        if (i10 != 1 && i10 != 2) {
            f11 = 0.6f;
        } else {
            f11 = 1.0f;
        }
        q0Var.setScaleY(f11);
        if (i10 != 1 && i10 != 2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        q0Var.setVisibility(i11);
        if (i10 == 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        textView.setAlpha(f12);
        if (i10 == 3) {
            f13 = 1.0f;
        } else {
            f13 = 0.6f;
        }
        textView.setScaleX(f13);
        if (i10 == 3) {
            f14 = 1.0f;
        } else {
            f14 = 0.6f;
        }
        textView.setScaleY(f14);
        if (i10 == 3) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        textView.setVisibility(i12);
        if (i10 == 4) {
            f16 = 1.0f;
        }
        textView2.setAlpha(f16);
        if (i10 == 4) {
            f15 = 1.0f;
        } else {
            f15 = 0.6f;
        }
        textView2.setScaleX(f15);
        if (i10 != 4) {
            f17 = 0.6f;
        }
        textView2.setScaleY(f17);
        if (i10 != 4) {
            i13 = 8;
        }
        textView2.setVisibility(i13);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.f21528x;
        frameLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z13 = LocaleController.isRTL;
        TextView textView3 = this.f21522c;
        bi.f4 f4Var = this.f21521b;
        if (z13) {
            ((ViewGroup.MarginLayoutParams) f4Var.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) f4Var.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.f21525r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f21523f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(71.0f);
            }
            float f7 = dp;
            float height = getHeight() - 1;
            int width = getWidth() - getPaddingRight();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(71.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, height, width - i10, getHeight() - 1, org.telegram.ui.ActionBar.g6.f20022k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        aq aqVar = this.e;
        if (aqVar != null && aqVar.f23604a.f23092q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.f21523f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.v;
        if (background != null && (imageView = this.h) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.f21527w && (frameLayout = this.f21528x) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z10) {
        b(z10, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        int i10;
        ImageView imageView = this.G;
        if (imageView != null) {
            if (onClickListener == null) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z10) {
        this.f21523f = z10;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.h;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f21524n.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z10) {
        c(z10);
    }
}
