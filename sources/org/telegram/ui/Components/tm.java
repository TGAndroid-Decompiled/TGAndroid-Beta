package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class tm extends tl0 {
    public final Context f33101c;
    public final boolean d;
    public boolean e;
    public boolean f33102f;
    public final ArrayList h = new ArrayList(8);
    public int f33103n;
    public int f33104r;
    public boolean f33105s;
    public final ChatAttachAlertPhotoLayout v;

    public tm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, Context context, boolean z10) {
        this.v = chatAttachAlertPhotoLayout;
        this.f33101c = context;
        this.d = z10;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final boolean E(mm0 mm0Var) {
        MediaController.AlbumEntry albumEntry;
        boolean isEmpty = ChatAttachAlertPhotoLayout.f26016r1.isEmpty();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if ((!isEmpty || ((albumEntry = chatAttachAlertPhotoLayout.T0) != null && !albumEntry.photos.isEmpty())) && chatAttachAlertPhotoLayout.f30215b.R && h() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        ArrayList<MediaController.PhotoEntry> arrayList;
        MediaController.PhotoEntry M = M(i10);
        if (M == null) {
            int i11 = this.f33104r;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
            if (i10 <= i11) {
                ArrayList arrayList2 = ChatAttachAlertPhotoLayout.f26016r1;
                if (!arrayList2.isEmpty()) {
                    M = (MediaController.PhotoEntry) arrayList2.get(0);
                } else {
                    MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
                    if (albumEntry != null && (arrayList = albumEntry.photos) != null) {
                        M = arrayList.get(0);
                    }
                }
            } else if (!chatAttachAlertPhotoLayout.T0.photos.isEmpty()) {
                M = (MediaController.PhotoEntry) ic.a.g(1, chatAttachAlertPhotoLayout.T0.photos);
            }
        }
        if (M != null) {
            long j10 = M.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j10 /= 1000;
            }
            return LocaleController.formatYearMont(j10, true);
        }
        return "";
    }

    @Override
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        float ceil = (((int) (Math.ceil(h() / chatAttachAlertPhotoLayout.M0) * measuredHeight)) - (mm0Var.getMeasuredHeight() - currentActionBarHeight)) * f7;
        float f10 = measuredHeight;
        iArr[0] = ((int) (ceil / f10)) * chatAttachAlertPhotoLayout.M0;
        int paddingTop = mm0Var.getPaddingTop() + ((int) (ceil % f10)) + ((int) ((1.0f - f7) * currentActionBarHeight));
        iArr[1] = paddingTop;
        if (iArr[0] == 0 && paddingTop < chatAttachAlertPhotoLayout.getListTopPadding()) {
            iArr[1] = chatAttachAlertPhotoLayout.getListTopPadding() + currentActionBarHeight;
        }
    }

    @Override
    public final float H(mm0 mm0Var) {
        int i10 = this.v.M0;
        int ceil = (int) Math.ceil(this.f33103n / i10);
        if (mm0Var.getChildCount() != 0) {
            int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
            View childAt = mm0Var.getChildAt(0);
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                return Utilities.clamp((((R / i10) * measuredHeight) - childAt.getTop()) / ((ceil * measuredHeight) - (mm0Var.getMeasuredHeight() - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())), 1.0f, 0.0f);
            }
        }
        return 0.0f;
    }

    @Override
    public final void J(mm0 mm0Var) {
        this.f33105s = false;
        int childCount = mm0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            mm0Var.getChildAt(i10).invalidate();
        }
    }

    @Override
    public final void K() {
        this.f33105s = true;
    }

    public final vl0 L() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(this.f33101c, chatAttachAlertPhotoLayout.f30214a);
        if (this == chatAttachAlertPhotoLayout.G) {
            x5Var.setOutlineProvider(new rm(this));
            x5Var.setClipToOutline(true);
        }
        x5Var.setFastScrollDelegate(new s(this, 22));
        x5Var.setDelegate(new p1(14, this, x5Var));
        return new s4.e1(x5Var);
    }

    public final MediaController.PhotoEntry M(int i10) {
        boolean z10 = this.f33102f;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        if (z10 && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        boolean z11 = ChatAttachAlertPhotoLayout.f26015q1;
        return chatAttachAlertPhotoLayout.b0(i10);
    }

    @Override
    public final int h() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        if (!chatAttachAlertPhotoLayout.f26058v0) {
            return 1;
        }
        int i10 = 0;
        this.e = false;
        this.f33102f = false;
        boolean z10 = chatAttachAlertPhotoLayout.P0;
        if (z10 && this == tmVar) {
            return 2;
        }
        if (this.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            this.e = true;
            i10 = 1;
        }
        if (chatAttachAlertPhotoLayout.f26033g1) {
            i10++;
        }
        if (z10 && this == tmVar) {
            i10++;
        }
        this.f33104r = i10;
        if (!z10) {
            i10 += ChatAttachAlertPhotoLayout.f26016r1.size();
            MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.T0;
            if (albumEntry != null) {
                i10 += albumEntry.photos.size();
            }
        }
        if (this.e && i10 > chatAttachAlertPhotoLayout.M0 && !chatAttachAlertPhotoLayout.O0) {
            this.f33102f = true;
            i10++;
        }
        if (this == tmVar) {
            i10++;
        }
        this.f33103n = i10;
        return i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        tm tmVar = chatAttachAlertPhotoLayout.G;
        if (chatAttachAlertPhotoLayout.f26058v0) {
            boolean z10 = chatAttachAlertPhotoLayout.P0;
            if (z10 && this == tmVar) {
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
            boolean z12 = this.f33102f;
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
            if (chatAttachAlertPhotoLayout.f26033g1 && i11 == 0) {
                return 4;
            }
            if (this == tmVar && i10 == this.f33103n - 1) {
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
            uz uzVar = chatAttachAlertPhotoLayout.H;
            if ((h() == 1 && !chatAttachAlertPhotoLayout.P0 && chatAttachAlertPhotoLayout.T0 == null) || !chatAttachAlertPhotoLayout.f26058v0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            uzVar.setVisibility(i10);
        }
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z15 = this.d;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 == 7) {
                        ((r20) view).setUseAnEmojiVisible(chatAttachAlertPhotoLayout.f26033g1);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                r5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
                if (!z15 || !chatAttachAlertPhotoLayout.O0 || i10 != 0) {
                    i12 = 1;
                }
                r5Var.setType(i12);
                return;
            }
            ((org.telegram.ui.Cells.q5) view).setItemSize(chatAttachAlertPhotoLayout.K0);
            return;
        }
        if (this.f33102f && i10 > chatAttachAlertPhotoLayout.M0) {
            i10--;
        }
        if (z15 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
            i10--;
        }
        if (chatAttachAlertPhotoLayout.f26033g1) {
            i10--;
        }
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        if (this == chatAttachAlertPhotoLayout.G) {
            x5Var.setItemSize(chatAttachAlertPhotoLayout.K0);
        } else {
            if (chatAttachAlertPhotoLayout.f26054s.f47708o == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            x5Var.setIsVertical(z10);
        }
        if (tiVar.T0 == 0 && !tiVar.W0 && !tiVar.H) {
            x5Var.getCheckBox().setVisibility(0);
        } else {
            x5Var.getCheckBox().setVisibility(8);
        }
        MediaController.PhotoEntry b02 = chatAttachAlertPhotoLayout.b0(i10);
        if (b02 == null) {
            return;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.f26017s1;
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
        if (tiVar != null && tiVar.f33030i0) {
            z14 = true;
        } else {
            z14 = false;
        }
        x5Var.d(b02, z11, z12, z13, z14);
        if ((tiVar.f33021f0 instanceof org.telegram.ui.un) && tiVar.W1) {
            x5Var.b(ChatAttachAlertPhotoLayout.f26018t1.indexOf(Integer.valueOf(b02.imageId)), hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        } else {
            x5Var.b(-1, hashMap.containsKey(Integer.valueOf(b02.imageId)), false);
        }
        if (!chatAttachAlertPhotoLayout.f26060w0 && b02.isVideo) {
            x5Var.setAlpha(0.3f);
        } else if (!chatAttachAlertPhotoLayout.f26062x0 && !b02.isVideo) {
            x5Var.setAlpha(0.3f);
        } else {
            x5Var.setAlpha(1.0f);
        }
        x5Var.getImageView().setTag(Integer.valueOf(i10));
        x5Var.setTag(Integer.valueOf(i10));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.v;
        ti tiVar = chatAttachAlertPhotoLayout.f30215b;
        org.telegram.ui.ActionBar.u6 u6Var = chatAttachAlertPhotoLayout.f30214a;
        if (i10 != 0) {
            Context context = this.f33101c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    ?? frameLayout = new FrameLayout(context);
                                    ImageView imageView = new ImageView(context);
                                    frameLayout.f24971a = imageView;
                                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                                    imageView.setScaleType(scaleType);
                                    int i11 = org.telegram.ui.ActionBar.y6.f23302aa;
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, mode);
                                    frameLayout.addView(imageView, gb1.h(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    ImageView imageView2 = new ImageView(context);
                                    frameLayout.f24972b = imageView2;
                                    imageView2.setScaleType(scaleType);
                                    org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.f23321ba, u6Var, mode);
                                    frameLayout.addView(imageView2, gb1.h(44, 44.0f, 17, 5.0f, 0.0f, 0.0f, 27.0f));
                                    TextView textView = new TextView(context);
                                    frameLayout.f24973c = textView;
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23341ca, u6Var);
                                    textView.setTextSize(1, 12.0f);
                                    textView.setGravity(17);
                                    frameLayout.addView(textView, gb1.h(-2, -2.0f, 17, 5.0f, 13.0f, 5.0f, 0.0f));
                                    frameLayout.d = AndroidUtilities.dp(80.0f);
                                    return new s4.e1(frameLayout);
                                }
                                FrameLayout frameLayout2 = new FrameLayout(context);
                                frameLayout2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                                fi.d dVar = new fi.d(context, u6Var, true);
                                dVar.setUseWrapContent(true);
                                dVar.f();
                                dVar.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                                spannableStringBuilder.setSpan(new zq(R.drawable.camera, 0), 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessCamera));
                                dVar.i(spannableStringBuilder, false, true);
                                frameLayout2.addView(dVar, gb1.h(-2, 44.0f, 81, 10.0f, 0.0f, 10.0f, 12.0f));
                                return new s4.e1(frameLayout2);
                            }
                            r20 r20Var = new r20(context, tiVar.M1);
                            r20Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(400.0f)));
                            r20Var.setGravity(17);
                            r20Var.isClickable();
                            r20Var.f32084b.setOnClickListener(new f0(new xl(chatAttachAlertPhotoLayout, 5), 17));
                            r20Var.f32083a.setOnClickListener(new f0(new xl(chatAttachAlertPhotoLayout, 6), 18));
                            r20Var.f32085c.setOnClickListener(new ga(17, r20Var, new b3(this, 2)));
                            return new s4.e1(r20Var);
                        }
                        return new s4.e1(new View(context));
                    }
                    tiVar.getClass();
                    return new s4.e1(new sm(this, context));
                }
                return new s4.e1(new bi.cc(this, context, 13));
            }
            ?? view = new View(context);
            view.setFocusable(true);
            view.f24834a = AndroidUtilities.dp(0.0f);
            return new s4.e1(view);
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            vl0 vl0Var = (vl0) arrayList.get(0);
            arrayList.remove(0);
            return vl0Var;
        }
        return L();
    }

    @Override
    public final void y(s4.e1 e1Var) {
        if (e1Var.f47738a instanceof org.telegram.ui.Cells.q5) {
            this.v.Q.i();
        }
    }
}
