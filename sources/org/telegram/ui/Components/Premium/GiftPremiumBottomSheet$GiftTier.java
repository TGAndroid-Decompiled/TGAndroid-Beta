package org.telegram.ui.Components.Premium;

import com.android.billingclient.api.ProductDetails;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

public final class GiftPremiumBottomSheet$GiftTier {
    private int discount;
    public final TLRPC.TL_premiumGiftCodeOption giftCodeOption;
    public final TLRPC.TL_premiumGiftOption giftOption;
    public ProductDetails googlePlayProductDetails;
    private long pricePerMonth;
    private long pricePerMonthRegular;
    public final TLRPC.TL_premiumGiftCodeOption starsCodeOption;
    public final TLRPC.TL_premiumGiftOption starsOption;

    public GiftPremiumBottomSheet$GiftTier(TLRPC.TL_premiumGiftOption tL_premiumGiftOption, Object obj) {
        this.giftOption = tL_premiumGiftOption;
        this.giftCodeOption = null;
        this.starsOption = obj instanceof TLRPC.TL_premiumGiftOption ? (TLRPC.TL_premiumGiftOption) obj : null;
        this.starsCodeOption = obj instanceof TLRPC.TL_premiumGiftCodeOption ? (TLRPC.TL_premiumGiftCodeOption) obj : null;
    }

    public GiftPremiumBottomSheet$GiftTier(TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, Object obj) {
        this.giftOption = null;
        this.giftCodeOption = tL_premiumGiftCodeOption;
        this.starsOption = obj instanceof TLRPC.TL_premiumGiftOption ? (TLRPC.TL_premiumGiftOption) obj : null;
        this.starsCodeOption = obj instanceof TLRPC.TL_premiumGiftCodeOption ? (TLRPC.TL_premiumGiftCodeOption) obj : null;
    }

    public void setGooglePlayProductDetails(ProductDetails productDetails) {
        this.googlePlayProductDetails = productDetails;
    }

    public void setPricePerMonthRegular(long j) {
        this.pricePerMonthRegular = j;
    }

    public String getStoreProduct() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.giftOption;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.store_product;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.giftCodeOption;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.store_product;
        }
        return null;
    }

    public int getMonths() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.giftOption;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.months;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.giftCodeOption;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.months;
        }
        return 1;
    }

    public int getDiscount() {
        if (this.discount == 0) {
            if (getPricePerMonth() == 0) {
                return 0;
            }
            if (this.pricePerMonthRegular != 0) {
                int pricePerMonth = (int) ((1.0d - (getPricePerMonth() / this.pricePerMonthRegular)) * 100.0d);
                this.discount = pricePerMonth;
                if (pricePerMonth == 0) {
                    this.discount = -1;
                }
            }
        }
        return this.discount;
    }

    public long getPricePerMonth() {
        if (this.pricePerMonth == 0) {
            long price = getPrice();
            if (price != 0) {
                this.pricePerMonth = price / getMonths();
            }
        }
        return this.pricePerMonth;
    }

    public String getFormattedPrice() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        if (BuildVars.useInvoiceBilling() || (((tL_premiumGiftOption = this.giftOption) != null && tL_premiumGiftOption.store_product == null) || ((tL_premiumGiftCodeOption = this.giftCodeOption) != null && tL_premiumGiftCodeOption.store_product == null))) {
            return BillingController.getInstance().formatCurrency(getPrice(), getCurrency());
        }
        return this.googlePlayProductDetails == null ? "" : BillingController.getInstance().formatCurrency(getPrice(), getCurrency(), 6);
    }

    public long getPrice() {
        if (this.giftOption != null) {
            if (BuildVars.useInvoiceBilling() || this.giftOption.store_product == null) {
                return this.giftOption.amount;
            }
        } else if (this.giftCodeOption != null && (BuildVars.useInvoiceBilling() || this.giftCodeOption.store_product == null)) {
            return this.giftCodeOption.amount;
        }
        ProductDetails productDetails = this.googlePlayProductDetails;
        if (productDetails == null) {
            return 0L;
        }
        return productDetails.getOneTimePurchaseOfferDetails().getPriceAmountMicros();
    }

    public String getCurrency() {
        if (this.giftOption != null) {
            if (BuildVars.useInvoiceBilling() || this.giftOption.store_product == null) {
                return this.giftOption.currency;
            }
        } else if (this.giftCodeOption != null && (BuildVars.useInvoiceBilling() || this.giftCodeOption.store_product == null)) {
            return this.giftCodeOption.currency;
        }
        ProductDetails productDetails = this.googlePlayProductDetails;
        return productDetails == null ? "" : productDetails.getOneTimePurchaseOfferDetails().getPriceCurrencyCode();
    }

    public Object getStarsOption() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.starsOption;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.starsCodeOption;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption;
        }
        return null;
    }

    public boolean isStarsPaymentAvailable() {
        return (this.starsOption == null && this.starsCodeOption == null) ? false : true;
    }

    public long getStarsPrice() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = this.starsOption;
        if (tL_premiumGiftOption != null) {
            return tL_premiumGiftOption.amount;
        }
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = this.starsCodeOption;
        if (tL_premiumGiftCodeOption != null) {
            return tL_premiumGiftCodeOption.amount;
        }
        return 0L;
    }
}
