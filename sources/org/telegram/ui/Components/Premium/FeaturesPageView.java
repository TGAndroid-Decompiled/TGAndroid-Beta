package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.FeaturesPageView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.RecyclerListView;
public class FeaturesPageView extends BaseListPageView {
    RecyclerListView.SelectionAdapter adapter;
    Bitmap bitmap;
    ArrayList<Item> items;
    public final int type;

    public FeaturesPageView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.items = new ArrayList<>();
        this.type = i;
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_order, LocaleController.getString("PremiumStoriesPriority", R.string.PremiumStoriesPriority), LocaleController.getString("PremiumStoriesPriorityDescription", R.string.PremiumStoriesPriorityDescription), 20));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_stealth, LocaleController.getString("PremiumStoriesStealth", R.string.PremiumStoriesStealth), LocaleController.getString("PremiumStoriesStealthDescription", R.string.PremiumStoriesStealthDescription), 15));
            arrayList.add(new Item(this, 1, R.drawable.menu_quality_hd, LocaleController.getString(R.string.PremiumStoriesQuality), LocaleController.getString(R.string.PremiumStoriesQualityDescription), 25));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_views, LocaleController.getString("PremiumStoriesViews", R.string.PremiumStoriesViews), LocaleController.getString("PremiumStoriesViewsDescription", R.string.PremiumStoriesViewsDescription), 16));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_timer, LocaleController.getString("PremiumStoriesExpiration", R.string.PremiumStoriesExpiration), LocaleController.getString("PremiumStoriesExpirationDescription", R.string.PremiumStoriesExpirationDescription), 17));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_save, LocaleController.getString("PremiumStoriesSaveToGallery", R.string.PremiumStoriesSaveToGallery), LocaleController.getString("PremiumStoriesSaveToGalleryDescription", R.string.PremiumStoriesSaveToGalleryDescription), 18));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_caption, LocaleController.getString("PremiumStoriesCaption", R.string.PremiumStoriesCaption), LocaleController.getString("PremiumStoriesCaptionDescription", R.string.PremiumStoriesCaptionDescription), 21));
            arrayList.add(new Item(this, 1, R.drawable.msg_stories_link, LocaleController.getString("PremiumStoriesFormatting", R.string.PremiumStoriesFormatting), LocaleController.getString("PremiumStoriesFormattingDescription", R.string.PremiumStoriesFormattingDescription), 19));
        } else if (i == 1) {
            arrayList.add(new Item(this, 1, R.drawable.menu_premium_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription), 29));
            arrayList.add(new Item(this, 1, R.drawable.menu_premium_clock, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription), 30));
            arrayList.add(new Item(this, 1, R.drawable.menu_quickreply, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription), 31));
            arrayList.add(new Item(this, 1, R.drawable.menu_feature_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription), 32));
            arrayList.add(new Item(this, 1, R.drawable.menu_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription), 33));
            arrayList.add(new Item(this, 1, R.drawable.menu_premium_chatbot, LocaleController.getString(R.string.PremiumBusinessChatbots), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription), 34));
        }
        final MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$new$0;
                lambda$new$0 = FeaturesPageView.lambda$new$0(MessagesController.this, (FeaturesPageView.Item) obj, (FeaturesPageView.Item) obj2);
                return lambda$new$0;
            }
        });
        this.items.add(new Item(0));
        this.items.addAll(arrayList);
        this.items.add(new Item(2));
        this.bitmap = Bitmap.createBitmap(this.items.size(), 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.bitmap);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, this.bitmap.getWidth(), 0.0f, new int[]{Theme.getColor(Theme.key_premiumGradient1), Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient3), Theme.getColor(Theme.key_premiumGradient4)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, this.bitmap.getWidth(), this.bitmap.getHeight(), paint);
    }

    public static int lambda$new$0(MessagesController messagesController, Item item, Item item2) {
        return messagesController.premiumFeaturesTypesToPosition.get(item.order, ConnectionsManager.DEFAULT_DATACENTER_ID) - messagesController.premiumFeaturesTypesToPosition.get(item2.order, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override
    public RecyclerView.Adapter createAdapter() {
        RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View itemCell;
                if (i == 0) {
                    FeaturesPageView featuresPageView = FeaturesPageView.this;
                    itemCell = new HeaderView(featuresPageView.getContext());
                } else if (i == 2) {
                    itemCell = new FixedHeightEmptyCell(FeaturesPageView.this.getContext(), 16);
                } else {
                    FeaturesPageView featuresPageView2 = FeaturesPageView.this;
                    itemCell = new ItemCell(featuresPageView2, featuresPageView2.getContext());
                }
                itemCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(itemCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (FeaturesPageView.this.items.get(i).viewType == 1) {
                    ItemCell itemCell = (ItemCell) viewHolder.itemView;
                    itemCell.imageView.setColorFilter(new PorterDuffColorFilter(FeaturesPageView.this.bitmap.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    itemCell.imageView.setImageDrawable(ContextCompat.getDrawable(FeaturesPageView.this.getContext(), FeaturesPageView.this.items.get(i).iconRes));
                    itemCell.textView.setText(FeaturesPageView.this.items.get(i).text);
                    itemCell.description.setText(FeaturesPageView.this.items.get(i).description);
                }
            }

            @Override
            public int getItemViewType(int i) {
                return FeaturesPageView.this.items.get(i).viewType;
            }

            @Override
            public int getItemCount() {
                return FeaturesPageView.this.items.size();
            }
        };
        this.adapter = selectionAdapter;
        return selectionAdapter;
    }

    public class Item {
        String description;
        int iconRes;
        int order;
        String text;
        final int viewType;

        private Item(FeaturesPageView featuresPageView, int i) {
            this.viewType = i;
        }

        public Item(FeaturesPageView featuresPageView, int i, int i2, String str, String str2, int i3) {
            this.viewType = i;
            this.iconRes = i2;
            this.text = str;
            this.description = str2;
            this.order = i3;
        }
    }

    private class HeaderView extends FrameLayout {
        GradientTools gradientTools;
        int height;
        GLIconTextureView iconTextureView;
        BackupImageView imageView;
        StarParticlesView starParticlesView;

        public HeaderView(Context context) {
            super(context);
            this.gradientTools = new GradientTools();
            int i = FeaturesPageView.this.type;
            if (i == 0) {
                this.height = AndroidUtilities.dp(150.0f);
                BackupImageView backupImageView = new BackupImageView(context);
                this.imageView = backupImageView;
                backupImageView.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
                addView(this.imageView, LayoutHelper.createFrame(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
                TLRPC$User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                avatarDrawable.setInfo(currentUser);
                this.imageView.getImageReceiver().setForUserOrChat(currentUser, avatarDrawable);
                TextView textView = new TextView(context);
                textView.setTextSize(1, 20.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, FeaturesPageView.this.resourcesProvider));
                textView.setText(LocaleController.getString("UpgradedStories", R.string.UpgradedStories));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
                GradientTools gradientTools = this.gradientTools;
                gradientTools.isLinear = true;
                gradientTools.isDiagonal = true;
                gradientTools.setColors(Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient1));
                this.gradientTools.paint.setStyle(Paint.Style.STROKE);
                this.gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                this.gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            } else if (i == 1) {
                StarParticlesView starParticlesView = new StarParticlesView(this, context, FeaturesPageView.this) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, i3);
                        this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                    }

                    @Override
                    public void configure() {
                        StarParticlesView.Drawable drawable = this.drawable;
                        drawable.useGradient = true;
                        drawable.useBlur = false;
                        drawable.checkBounds = true;
                        drawable.isCircle = true;
                        drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                        StarParticlesView.Drawable drawable2 = this.drawable;
                        drawable2.minLifeTime = 2000L;
                        drawable2.randLifeTime = 3000;
                        drawable2.size1 = 16;
                        drawable2.useRotate = false;
                        drawable2.type = 28;
                        drawable2.colorKey = Theme.key_premiumGradient2;
                        drawable2.init();
                    }
                };
                this.starParticlesView = starParticlesView;
                addView(starParticlesView, LayoutHelper.createFrame(-1, 190, 55));
                GLIconTextureView gLIconTextureView = new GLIconTextureView(this, context, 1, 1, FeaturesPageView.this) {
                    @Override
                    public void onAttachedToWindow() {
                        super.onAttachedToWindow();
                        setPaused(false);
                    }

                    @Override
                    public void onDetachedFromWindow() {
                        super.onDetachedFromWindow();
                        setPaused(true);
                    }
                };
                this.iconTextureView = gLIconTextureView;
                gLIconTextureView.setStarParticlesView(this.starParticlesView);
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i2 = Theme.key_premiumGradient2;
                canvas.drawColor(ColorUtils.blendARGB(Theme.getColor(i2, FeaturesPageView.this.resourcesProvider), Theme.getColor(Theme.key_dialogBackground, FeaturesPageView.this.resourcesProvider), 0.5f));
                this.iconTextureView.setBackgroundBitmap(createBitmap);
                GLIconRenderer gLIconRenderer = this.iconTextureView.mRenderer;
                gLIconRenderer.forceNight = true;
                gLIconRenderer.colorKey1 = i2;
                gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
                gLIconRenderer.updateColors();
                addView(this.iconTextureView, LayoutHelper.createFrame(160, 160, 1));
                GLIconTextureView gLIconTextureView2 = this.iconTextureView;
                if (gLIconTextureView2 != null) {
                    gLIconTextureView2.startEnterAnimation(-360, 100L);
                }
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 20.0f);
                textView2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, FeaturesPageView.this.resourcesProvider));
                textView2.setText(LocaleController.getString(R.string.TelegramBusiness));
                textView2.setGravity(17);
                addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 150.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, FeaturesPageView.this.resourcesProvider));
                textView3.setText(LocaleController.getString(R.string.TelegramBusinessSubtitle2));
                textView3.setGravity(17);
                addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 183.0f, 0.0f, 20.0f));
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (FeaturesPageView.this.type == 0) {
                BackupImageView backupImageView = this.imageView;
                Rect rect = AndroidUtilities.rectTmp2;
                backupImageView.getHitRect(rect);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.gradientTools.setBounds(rectF);
                float f = 360.0f / 7;
                for (int i = 0; i < 7; i++) {
                    float f2 = (i * f) - 90.0f;
                    float f3 = 5;
                    float f4 = f2 + f3;
                    canvas.drawArc(AndroidUtilities.rectTmp, f4, ((f2 + f) - f3) - f4, false, this.gradientTools.paint);
                }
            }
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3 = this.height;
            if (i3 > 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    private class ItemCell extends FrameLayout {
        TextView description;
        ImageView imageView;
        TextView textView;

        public ItemCell(FeaturesPageView featuresPageView, Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, featuresPageView.resourcesProvider));
            this.textView.setTextSize(1, 14.0f);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, featuresPageView.resourcesProvider));
            this.description.setTextSize(1, 14.0f);
            addView(this.description, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }
    }
}
