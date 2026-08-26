package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class FeaturesPageView extends BaseListPageView {
    public final Bitmap bitmap;
    public final ArrayList items;
    public final int type;

    public final class HeaderView extends FrameLayout {
        public final GradientTools gradientTools;
        public final int height;
        public final BackupImageView imageView;

        public HeaderView(Context context) {
            super(context);
            GradientTools gradientTools = new GradientTools();
            this.gradientTools = gradientTools;
            int i = FeaturesPageView.this.type;
            Theme.ResourcesProvider resourcesProvider = FeaturesPageView.this.resourcesProvider;
            if (i == 0) {
                this.height = AndroidUtilities.dp(150.0f);
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
                addView(backupImageView, LayoutHelper.createFrame(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
                TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                avatarDrawable.setInfo(UserConfig.selectedAccount, currentUser);
                backupImageView.getImageReceiver().setForUserOrChat(currentUser, avatarDrawable);
                TextView textView = new TextView(context);
                zzkk.m(20.0f, 1, textView);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                textView.setText(LocaleController.getString(R.string.UpgradedStories));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
                gradientTools.isLinear = true;
                gradientTools.isDiagonal = true;
                gradientTools.setColors(Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient1, false), 0, 0);
                Paint paint = gradientTools.paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
                return;
            }
            if (i == 1) {
                LoginActivity.LoginPayView.AnonymousClass1 anonymousClass1 = new LoginActivity.LoginPayView.AnonymousClass1(context, 1);
                addView(anonymousClass1, LayoutHelper.createFrame(-1, 190, 55));
                StarsReactionsSheet.AnonymousClass6 anonymousClass6 = new StarsReactionsSheet.AnonymousClass6(context, 1, 1, 1);
                anonymousClass6.setStarParticlesView(anonymousClass1);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int i2 = Theme.key_premiumGradient2;
                canvas.drawColor(ColorUtils.blendARGB(0.5f, Theme.getColor(i2, resourcesProvider), Theme.getColor(Theme.key_dialogBackground, resourcesProvider)));
                anonymousClass6.setBackgroundBitmap(bitmapCreateBitmap);
                GLIconRenderer gLIconRenderer = anonymousClass6.mRenderer;
                gLIconRenderer.colorKey1 = i2;
                gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
                gLIconRenderer.updateColors();
                addView(anonymousClass6, LayoutHelper.createFrame(160, 160, 1));
                GLIconRenderer gLIconRenderer2 = anonymousClass6.mRenderer;
                if (gLIconRenderer2 != null) {
                    gLIconRenderer2.angleX = -180.0f;
                    AndroidUtilities.runOnUIThread(new GLIconTextureView.AnonymousClass2(anonymousClass6, 1), 100L);
                }
                TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 20.0f);
                textViewM.setTypeface(AndroidUtilities.bold());
                textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                zzkg.m(R.string.TelegramBusiness, textViewM, 17);
                addView(textViewM, LayoutHelper.createFrame(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
                zzkg.m(R.string.TelegramBusinessSubtitle2, textView2, 17);
                addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (FeaturesPageView.this.type == 0) {
                BackupImageView backupImageView = this.imageView;
                Rect rect = AndroidUtilities.rectTmp2;
                backupImageView.getHitRect(rect);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                GradientTools gradientTools = this.gradientTools;
                gradientTools.setBounds(rectF);
                float f = 360.0f / 7;
                for (int i = 0; i < 7; i++) {
                    float f2 = (i * f) - 90.0f;
                    float f3 = 5;
                    float f4 = f2 + f3;
                    canvas.drawArc(AndroidUtilities.rectTmp, f4, ((f2 + f) - f3) - f4, false, gradientTools.paint);
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = this.height;
            if (i3 > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    public final class ItemCell extends FrameLayout {
        public final TextView description;
        public final ImageView imageView;
        public final TextView textView;

        public ItemCell(FeaturesPageView featuresPageView, Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, featuresPageView.resourcesProvider, textView, 14.0f);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText, featuresPageView.resourcesProvider, textView2, 14.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }
    }

    public FeaturesPageView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        SparseIntArray sparseIntArray;
        super(context, resourcesProvider);
        ArrayList arrayList = new ArrayList();
        this.items = arrayList;
        this.type = i;
        ArrayList arrayList2 = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        if (i != 0) {
            if (i == 1) {
                sparseIntArray = messagesController.businessFeaturesTypesToPosition;
                arrayList2.add(new Item(R.drawable.menu_premium_location, 29, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
                arrayList2.add(new Item(R.drawable.menu_premium_clock, 30, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
                arrayList2.add(new Item(R.drawable.menu_quickreply, 31, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
                arrayList2.add(new Item(R.drawable.menu_feature_status, 32, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
                arrayList2.add(new Item(R.drawable.menu_premium_away, 33, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
                arrayList2.add(new Item(R.drawable.menu_premium_chatbot, 34, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
                arrayList2.add(new Item(R.drawable.menu_feature_intro, 36, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
                arrayList2.add(new Item(R.drawable.menu_premium_chatlink, 37, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            }
            if (sparseIntArray != null) {
                Collections.sort(arrayList2, new TableModel$$ExternalSyntheticLambda0(sparseIntArray, 5));
            }
            arrayList.add(new Item(0));
            arrayList.addAll(arrayList2);
            arrayList.add(new Item(2));
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setShader(new LinearGradient(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 0.0f, new int[]{Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient3, false), Theme.getColor(null, Theme.key_premiumGradient4, false)}, (float[]) null, Shader.TileMode.CLAMP));
            canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
        }
        arrayList2.add(new Item(R.drawable.msg_stories_order, 20, LocaleController.getString(R.string.PremiumStoriesPriority), LocaleController.getString(R.string.PremiumStoriesPriorityDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_stealth, 15, LocaleController.getString(R.string.PremiumStoriesStealth), LocaleController.getString(R.string.PremiumStoriesStealthDescription)));
        arrayList2.add(new Item(R.drawable.menu_quality_hd, 25, LocaleController.getString(R.string.PremiumStoriesQuality), LocaleController.getString(R.string.PremiumStoriesQualityDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_views, 16, LocaleController.getString(R.string.PremiumStoriesViews), LocaleController.getString(R.string.PremiumStoriesViewsDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_timer, 17, LocaleController.getString(R.string.PremiumStoriesExpiration), LocaleController.getString(R.string.PremiumStoriesExpirationDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_save, 18, LocaleController.getString(R.string.PremiumStoriesSaveToGallery), LocaleController.getString(R.string.PremiumStoriesSaveToGalleryDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_caption, 21, LocaleController.getString(R.string.PremiumStoriesCaption), LocaleController.getString(R.string.PremiumStoriesCaptionDescription)));
        arrayList2.add(new Item(R.drawable.msg_stories_link, 19, LocaleController.getString(R.string.PremiumStoriesFormatting), LocaleController.getString(R.string.PremiumStoriesFormattingDescription)));
        sparseIntArray = null;
        if (sparseIntArray != null) {
            Collections.sort(arrayList2, new TableModel$$ExternalSyntheticLambda0(sparseIntArray, 5));
        }
        arrayList.add(new Item(0));
        arrayList.addAll(arrayList2);
        arrayList.add(new Item(2));
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(arrayList.size(), 1, Bitmap.Config.ARGB_8888);
        this.bitmap = bitmapCreateBitmap2;
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Paint paint2 = new Paint();
        paint2.setShader(new LinearGradient(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), 0.0f, new int[]{Theme.getColor(null, Theme.key_premiumGradient1, false), Theme.getColor(null, Theme.key_premiumGradient2, false), Theme.getColor(null, Theme.key_premiumGradient3, false), Theme.getColor(null, Theme.key_premiumGradient4, false)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas2.drawRect(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight(), paint2);
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        return new MessageSeenView.AnonymousClass3(this, 3);
    }

    public final class Item {
        public final String description;
        public final int iconRes;
        public final int order;
        public final String text;
        public final int viewType;

        public Item(int i) {
            this.viewType = i;
        }

        public Item(int i, int i2, String str, String str2) {
            this.viewType = 1;
            this.iconRes = i;
            this.text = str;
            this.description = str2;
            this.order = i2;
        }
    }
}
