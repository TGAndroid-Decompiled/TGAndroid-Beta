package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class o10 extends xf.b {
    public final Context d;

    public final FiltersSetupActivity f40974e;

    public o10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.f40974e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override
    public final int h() {
        return this.f40974e.f35484n.size();
    }

    @Override
    public final int j(int i10) {
        m10 m10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.f40974e;
            if (i10 < filtersSetupActivity.f35484n.size() && (m10Var = (m10) filtersSetupActivity.f35484n.get(i10)) != null) {
                return m10Var.f49413a;
            }
            return 3;
        }
        return 3;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        char c10;
        long j10;
        int iMax;
        FiltersSetupActivity filtersSetupActivity = this.f40974e;
        ArrayList arrayList = filtersSetupActivity.f35484n;
        m10 m10Var = (m10) arrayList.get(i10);
        if (m10Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((m10) arrayList.get(i11)).f49413a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.j4) view).setText(m10Var.f40285c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (TextUtils.isEmpty(m10Var.f40285c)) {
                    x8Var.setText(null);
                    x8Var.setFixedSize(12);
                } else {
                    x8Var.setFixedSize(0);
                    x8Var.setText(m10Var.f40285c);
                }
                x8Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    p8Var.f(m10Var.f40285c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    p8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                p10 p10Var = (p10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = m10Var.f40286e;
                p10Var.d = z10;
                p10Var.f41246e = tL_dialogFilterSuggested;
                p10Var.setWillNotDraw(!z10);
                p10Var.f41243a.setText(tL_dialogFilterSuggested.filter.title.text);
                p10Var.f41244b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            q10 q10Var = (q10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(iW0, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23182k7, false), mode));
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawable, drawable2);
            q10Var.f41485a.l(((Object) m10Var.f40285c) + "", false);
            q10Var.f41486b.setImageDrawable(dqVar);
            return;
        }
        k10 k10Var = (k10) view;
        MessagesController.DialogFilter dialogFilter = m10Var.d;
        ImageView imageView = k10Var.h;
        org.telegram.ui.ActionBar.h5 h5Var = k10Var.f39561a;
        ImageView imageView2 = k10Var.f39563c;
        View view2 = k10Var.f39565f;
        FiltersSetupActivity filtersSetupActivity2 = k10Var.A;
        MessagesController.DialogFilter dialogFilter2 = k10Var.f39570x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.f19622id;
        k10Var.f39570x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.f19622id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0) {
            c10 = 0;
            if (dialogFilter.color != k10Var.f39564e) {
                int iDp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.g6.f23303r8;
                k10Var.f39564e = i15;
                view2.setBackground(org.telegram.ui.ActionBar.g6.K(iDp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length])));
            }
        } else {
            c10 = 0;
        }
        if (i15 != k10Var.d) {
            ValueAnimator valueAnimator = k10Var.f39571y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                float alpha = imageView2.getAlpha();
                float f10 = i15 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = alpha;
                fArr[1] = f10;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                k10Var.f39571y = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new g3(k10Var, 14));
                k10Var.f39571y.setInterpolator(org.telegram.ui.Components.er.h);
                k10Var.f39571y.setDuration(340L);
                ValueAnimator valueAnimator2 = k10Var.f39571y;
                if (i15 >= 0) {
                    iMax = Math.max(0, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    iMax = Math.max(0, i10 - filtersSetupActivity2.f35486s);
                }
                valueAnimator2.setStartDelay(((long) iMax) * j10);
                k10Var.f39571y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            k10Var.d = i15;
        }
        k10Var.f39566n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (dialogFilter.isDefault()) {
            sb2.append(LocaleController.getString(R.string.FilterAllChats));
        } else {
            int i16 = dialogFilter.flags;
            int i17 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i16 & i17) == i17) {
                sb2.append(LocaleController.getString(R.string.FilterAllChats));
            } else {
                if ((i16 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterNonContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterGroups));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterChannels));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterBots));
                }
            }
        }
        if (!dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
        }
        if (sb2.length() == 0) {
            sb2.append(LocaleController.getString(R.string.FilterNoChats));
        }
        String string = dialogFilter.name;
        if (dialogFilter.isDefault()) {
            string = LocaleController.getString(R.string.FilterAllChats);
        }
        if (!z12) {
            k10Var.f39569w = k10Var.f39570x.locked ? 1.0f : 0.0f;
        }
        Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(string, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
        h5Var.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
        h5Var.l(spannableReplaceAnimatedEmoji, false);
        k10Var.f39562b.setText(sb2);
        k10Var.v = z10;
        if (dialogFilter.isDefault()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        k10Var.invalidate();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        Context context = this.d;
        if (i10 == 0) {
            j4Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 == 3) {
                    j4Var = new org.telegram.ui.Cells.x8(context);
                } else if (i10 == 4) {
                    q10 q10Var = new q10(context);
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    q10Var.f41485a = h5Var;
                    h5Var.setTextSize(16);
                    h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.g6.f23251o6;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    h5Var.setTag(Integer.valueOf(i12));
                    q10Var.addView(h5Var);
                    ImageView imageView = new ImageView(context);
                    q10Var.f41486b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    q10Var.addView(imageView);
                    j4Var = q10Var;
                } else if (i10 != 6) {
                    p10 p10Var = new p10(context);
                    TextView textView = new TextView(context);
                    p10Var.f41243a = textView;
                    org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    p10Var.addView(textView, h7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    p10Var.f41244b = textView2;
                    org.telegram.messenger.rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    p10Var.addView(textView2, h7.z5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(context);
                    p10Var.f41245c = lh0Var;
                    lh0Var.setText(LocaleController.getString(R.string.Add));
                    lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    lh0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                    int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, iW0));
                    p10Var.addView(lh0Var, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    p10Var.setAddOnClickListener(new org.telegram.ui.Components.xh0(24, this, p10Var));
                    j4Var = p10Var;
                } else {
                    j4Var = new org.telegram.ui.Cells.p8(context);
                }
            } else {
                k10 k10Var = new k10(this.f40974e, context);
                k10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                k10Var.setOnReorderButtonTouchListener(new lh.p1(i11, this, k10Var));
                k10Var.setOnOptionsClick(new a(this, 28));
                j4Var = k10Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            l10 l10Var = new l10(context);
            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
            l10Var.f39912a = ri0Var;
            ri0Var.f(i13, 90, 90, null);
            ri0Var.setScaleType(ImageView.ScaleType.CENTER);
            ri0Var.d();
            ri0Var.setImportantForAccessibility(2);
            l10Var.addView(ri0Var, h7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            ri0Var.setOnClickListener(new a(l10Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(spannableStringBuilderReplaceTags);
            l10Var.addView(textView3, h7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            j4Var = l10Var;
        }
        return new org.telegram.ui.Components.lk0(j4Var);
    }
}
