package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class hm extends tk0 {
    public final Context f26752c;
    public final boolean d;
    public boolean f26753e;
    public boolean f26754f;
    public final ArrayList h = new ArrayList(8);
    public int f26755n;
    public int f26756r;
    public boolean f26757s;
    public final ChatAttachAlertPhotoLayout v;

    public hm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f26752c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final boolean E(ll0 ll0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f23832r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f28753b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f26756r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f23832r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) i2.g.h(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j3 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j3 /= 1000;
            }
            return LocaleController.formatYearMont(j3, true);
        }
        return "";
    }

    @Override
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (ll0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = ll0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(ll0 ll0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f26755n / i10);
        if (ll0Var.getChildCount() != 0) {
            int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
            View childAt = ll0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (ll0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(ll0 ll0Var) {
        this.f26757s = false;
        int childCount = ll0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ll0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f26757s = true;
    }

    public final vk0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(this.f26752c, chatAttachAlertPhotoLayout.f28752a);
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setOutlineProvider(new fm(this));
            s5Var.setClipToOutline(true);
        }
        s5Var.setFastScrollDelegate(new t(this, 22));
        s5Var.setDelegate(new b3(5, this, s5Var));
        return new s4.c1(s5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f26754f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f23831q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f23874v0) {
            return 1;
        }
        int i10 = 0;
        this.f26753e = false;
        this.f26754f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == hmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.f26753e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f23849g1) {
            i10++;
        }
        if (z10 && this == hmVar) {
            i10++;
        }
        this.f26756r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f23832r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.f26753e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f26754f = true;
            i10++;
        }
        if (this == hmVar) {
            i10++;
        }
        this.f26755n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        hm hmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f23874v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == hmVar) {
                if (i10 == 0) {
                    return 7;
                }
                return 2;
            }
            boolean z11 = this.d;
            if (z11 && i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                if (!chatAttachAlertPhotoLayout.O0) {
                    return 1;
                }
                return 8;
            }
            boolean z12 = this.f26754f;
            if (z12 && i10 == chatAttachAlertPhotoLayout.M0) {
                return 5;
            }
            if (z12 && i10 > chatAttachAlertPhotoLayout.M0) {
                i11 = i10 - 1;
            } else {
                i11 = i10;
            }
            if (z11) {
                i11--;
            }
            if (chatAttachAlertPhotoLayout.f23849g1 && i11 == 0) {
                return 4;
            }
            if (this == hmVar && i10 == this.f26755n - 1) {
                return 2;
            }
            if (z10) {
                return 3;
            }
            return 0;
        }
        return 2;
    }

    @Override
    public final void l() {
        int i10;
        super.l();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (this == chatAttachAlertPhotoLayout.G) {
            mz mzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f23874v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((g20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f23849g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.m5 m5Var = (org.telegram.ui.Cells.m5) view;
                m5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                m5Var.setType((z15 && chatAttachAlertPhotoLayout.O0 && i10 == 0) ? 1 : 1);
                return;
            }
            ((org.telegram.ui.Cells.l5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f26754f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f23849g1) {
            i10--;
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            s5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f23870s.f45726o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            s5Var.setIsVertical(z10);
        }
        if (viVar.Q0 == 0 && !viVar.T0 && !viVar.H) {
            s5Var.getCheckBox().setVisibility(0);
        } else {
            s5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f23833s1;
        if (hashMap.size() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i10 == h() - 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (viVar != null && viVar.f31288i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        s5Var.d(b02, z11, z12, z13, z14);
        if ((viVar.f31279f0 instanceof org.telegram.ui.co) && viVar.T1) {
            s5Var.b(ChatAttachAlertPhotoLayout.f23834t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            s5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f23876w0 && b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f23878x0 && !b02.isVideo) {
            s5Var.setAlpha(0.3f);
        } else {
            s5Var.setAlpha(1.0f);
        }
        s5Var.getImageView().setTag(Integer.valueOf(i10));
        s5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        vi viVar = chatAttachAlertPhotoLayout.f28753b;
        org.telegram.ui.ActionBar.f6 f6Var = chatAttachAlertPhotoLayout.f28752a;
        if (i10 != 0) {
            Context context = this.f26752c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f22291a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20610aa, f6Var);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    frameLayout.addView(imageView, w7.x5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f22292b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20630ba, f6Var), mode));
                                    frameLayout.addView(imageView2, w7.x5.d(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f22293c = textView;
                                    org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f20649ca, f6Var, textView, 1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.c1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                                di.d dVar = new di.d(context, f6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.e();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new nq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.g(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, w7.x5.d(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.c1(frameLayout2);
                            }
                            g20 g20Var = new g20(context, viVar.J1);
                            g20Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(400.0f)));
                            g20Var.setGravity(17);
                            g20Var.isClickable();
                            g20Var.f26234b.setOnClickListener(new g0(new ll(chatAttachAlertPhotoLayout, 5), 18));
                            g20Var.f26233a.setOnClickListener(new g0(new ll(chatAttachAlertPhotoLayout, 6), 19));
                            g20Var.f26235c.setOnClickListener(new ct(5, g20Var, new y2(this, 2)));
                            return new s4.c1(g20Var);
                        }
                        return new s4.c1(new View(context));
                    }
                    viVar.getClass();
                    return new s4.c1(new gm(this, context));
                }
                return new s4.c1(new di.eb(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f22253a = AndroidUtilities.dp(0.0f);
            return new s4.c1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            vk0 vk0Var = (vk0) arrayList.get(0);
            arrayList.remove(0);
            return vk0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.c1 c1Var) {
        if (c1Var.f45738a instanceof org.telegram.ui.Cells.l5) {
            this.v.Q.g();
        }
    }
}
